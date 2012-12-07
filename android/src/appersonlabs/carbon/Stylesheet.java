package appersonlabs.carbon;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.appcelerator.titanium.io.TiBaseFile;

public class Stylesheet {

    private static final String  PREDICATE_SEPARATORS = " ,";
    
    private static final Pattern SELECTOR_REGEX       = Pattern.compile("([\\.#])?([^\\[]+)(\\[[^\\]]+\\])?");

    private enum TssSelectorType {
        ID, CLASS, TYPE
    };

    private static class TssSelector {
        public TssSelectorType type;
        public String          name;
        public List<String>    predicates;
    }

    private Map<String, Map<String, Object>> stylesById    = new HashMap<String, Map<String, Object>>();
    private Map<String, Map<String, Object>> stylesByClass = new HashMap<String, Map<String, Object>>();
    private Map<String, Map<String, Object>> stylesByType  = new HashMap<String, Map<String, Object>>();

    public Stylesheet(TiBaseFile file) throws IOException {
        try {
            ANTLRInputStream input = new ANTLRInputStream(file.getInputStream());
            TSSLexer lexer = new TSSLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TSSParser parser = new TSSParser(tokens);
            TSSParser.stylesheet_return ss = parser.stylesheet();

            // ss.styles is an array of dicts with a single key that is the
            // selector
            for (Map<String, Map<String, Object>> rule : ss.styles) {
                String key = rule.keySet().iterator().next();
                Map<String, Object> style = rule.get(key);
                TssSelector selector = parseSelector(key);

                Map<String, Map<String, Object>> dest;
                switch (selector.type) {
                case ID:
                    dest = stylesById;
                    break;
                case CLASS:
                    dest = stylesByClass;
                    break;
                default:
                    dest = stylesByType;
                }

                if (selector.predicates != null && !selector.predicates.contains("platform=ios") && !selector.predicates.contains("platform=iphone")) {
                    // TODO add the formfactor predicate
                    Map<String, Object> existing = dest.get(selector.name);
                    if (existing != null) {
                        existing.putAll(style);
                        style = existing;
                    }
                    dest.put(selector.name, style);
                }
            }
        }
        catch (RecognitionException e) {
            throw new IOException(e.getMessage());
        }
    }

    private TssSelector parseSelector(String str) {
        TssSelector result = null;

        Matcher m = SELECTOR_REGEX.matcher(str);
        if (m.matches()) {
            result = new TssSelector();

            if ("#".equals(m.group(0))) {
                result.type = TssSelectorType.ID;
            }
            else if (".".equals(m.group(0))) {
                result.type = TssSelectorType.CLASS;
            }
            else {
                result.type = TssSelectorType.TYPE;
            }

            result.name = m.group(1);

            if (m.group(2) != null) {
                result.predicates = Arrays.asList(m.group(2).split(PREDICATE_SEPARATORS));
            }
        }

        return result;
    }

    public void applyStylesForKey(String proxyName, Map<String, Object> params) {
        if (proxyName == null || params == null) {
            return;
        }

        String proxyId = (String) params.get("id");
        String proxyClass = (String) params.get("class");

        Map<String, Object> result = new HashMap<String, Object>();

        // order of application is: type, class, ID
        if (stylesByType.containsKey(proxyName)) {
            result.putAll(stylesByType.get(proxyName));
        }
        if (stylesByClass.containsKey(proxyClass)) {
            result.putAll(stylesByClass.get(proxyClass));
        }
        if (stylesById.containsKey(proxyId)) {
            result.putAll(stylesById.get(proxyId));
        }

        // initialization parameters always override styles
        result.putAll(params);
        params = result;
    }
}
