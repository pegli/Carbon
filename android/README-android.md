# Building for Android

Requirements:

* a recent Java Developers Kit (tested with Java 6)
* ant
* Titanium SDK 2.1.2.GA or later

Copy the `build.properties.example` file to `build.properties` and update the 
property values to point to the Titanium and Android SDKs installed on the build
system.  The `build.properties` file should not be checked in to source control.

## Modifying the TSS parser grammar
 
The TSS parser and lexer classes in Carbon are generated from an [ANTLR](http://antlr.org/)
grammar file named `src/appersonlabs/carbon/TSS.g`.  If you make any changes to the
grammar file, you will need to regenerate the `TSSParser.java` and `TSSLexer.java` classes
prior to recompiling the module.  The `build.xml` has a handy-dandy target for this task.
Follow the instructions in the `antlr/README` file to install the required ant task that
compiles ANTLR grammars, then run `ant gentssparser` to recreate the Java source files.