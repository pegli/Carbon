/** 
 * Until TIMOB-9524 is released (3.0.0.GA) all JS must be in one file :(
**/
var ti_proxy_storage = {
	IDs: [],
	//Classes: [], //Add class lookup later
	//Type: {} // Add type lookup later
}

// This namespace is for properties that are in the Ti namespace or that should be
var ti_properties = {
	Platform: {
		displayCaps: {
			platformWidth: Titanium.Platform.displayCaps.platformWidth,
			platformHeight: Titanium.Platform.displayCaps.platformHeight,
			screenDensity: Ti.Platform.displayCaps.density
		},
		name: Ti.Platform.osname,
		orientations: {
			all: [
				Titanium.UI.PORTRAIT,
				Titanium.UI.UPSIDE_PORTRAIT,
				Titanium.UI.LANDSCAPE_LEFT,
				Titanium.UI.LANDSCAPE_RIGHT
			],
			portrait: [
				Titanium.UI.PORTRAIT,
				Titanium.UI.UPSIDE_PORTRAIT
			],
			landscape: [
				Titanium.UI.LANDSCAPE_LEFT,
				Titanium.UI.LANDSCAPE_RIGHT
			]
		},
		isTablet: function() {
			var isTablet = false;

			if ( ti_properties.Platform.osname == 'ipad' ) {

				isTablet = true;

			} else if ( ti_properties.Platform.osname == 'android' ) {
				var dpi = ti_properties.Platform.displayCaps.dpi,
					w = ti_properties.Platform.displayCaps.platformWidth / dpi,
					h = ti_properties.Platform.displayCaps.platformHeight / dpi,
					diagonalSize = Math.sqrt(w*w+h*h);

				if( ti_properties.Platform.osname === 'ipad') {
					isTablet = true;
				} else {
					isTablet = (diagonalSize >= 7) ? true : false;
				}
			}

			return isTablet;
		}
	},
	UI: {
		PORTRAIT: Titanium.UI.PORTRAIT,
		UPSIDE_PORTRAIT: Titanium.UI.UPSIDE_PORTRAIT,
		LANDSCAPE_LEFT: Titanium.UI.LANDSCAPE_LEFT,
		LANDSCAPE_RIGHT: Titanium.UI.LANDSCAPE_RIGHT,

		orientations: {
			all: [
				Titanium.UI.PORTRAIT,
				Titanium.UI.UPSIDE_PORTRAIT,
				Titanium.UI.LANDSCAPE_LEFT,
				Titanium.UI.LANDSCAPE_RIGHT
			],
			portrait: [
				Titanium.UI.PORTRAIT,
				Titanium.UI.UPSIDE_PORTRAIT
			],
			landscape: [
				Titanium.UI.LANDSCAPE_LEFT,
				Titanium.UI.LANDSCAPE_RIGHT
			]
		}
	}
}

// In android, the native code is run first, this accessable via 'this'.
// In iOS it's the other way around. using require to require the module 
// from itself only pulls in the native API's so no loop
var kroll;
if(ti_properties.Platform.name !== 'android') {
	kroll = require('appersonlabs.carbon');
} else {
	kroll = this;
}

// This namespace is for methods related to JS object manipulation
var object_methods = {
	extend: function(obj) {
		var i = arguments.length;

		function F() {}

		function N() {}

		while (i--) {

			for (var method in arguments[i]) {
				 F.prototype[method] = arguments[i][method];

			}

			if (typeof arguments[i] !== "object") {
				N.prototype = new arguments[i]();
				for (var m in N.prototype) {
					F.prototype[m] = N.prototype[m];
				}
			}

		}

		return new F();
	}
}

// This namespace is for methods relating to JS string manipulation
string_methods = {
	pretty_concat: (function(){
		"use strict";
		var re = /([^%]*)%(\d\$)?('.|0|\x20)?(-)?(\+)?(\d+)?(\.\d+)?(%|b|c|s|i|d|u|o|x|X|e|E|f|F|g|G)(.*)/;

		function e(value, precision, uppercase){
			value = parseFloat(value,10);
			value = value.toExponential(precision);
			if(uppercase){
				value = value.toUpperCase();
			}
			return value;
		}

		function f(value, precision){
			value = parseFloat(value,10);
			if(precision){
				value = value.toFixed(precision);
			}
			return value;
		}

		function g(value, precision, uppercase){
			var v1 = e(value, precision, uppercase).toString(),
				v2 = f(value, precision).toString();

			if(v1.length >= v2.length) {
				return v2;
			} else {
				return v1;
			}
		}

		return function(){
			var str,
				a = [],
				left,
				right,
				argnum,
				padding,
				justify,
				minlen,
				conversion,
				precision = -1,
				repl,
				crtArgumentCtr = 1,
				crtArgument,
				joiner = [],
				useArgNum = false,
				alwayssigned = false;

			if(!arguments || arguments.length < 1){
				return;
			}
			str = arguments[0];
			while(a = re.exec(str)){
				left = a[1];
				argnum = a[2]?parseInt(a[2].substring(0,1),10):false;
				padding = a[3]?a[3].substring(1):' ';
				justify = a[4]||false;
				alwayssigned = (a[5] === '+');
				minlen = a[6]?parseInt(a[6],10):false;
				precision = a[7]?parseInt(a[7].substring(1),10):false;
				conversion = a[8];
				right = a[9];
				if(argnum && argnum < 1 && argnum > arguments.length - 1){
					return;
				}
				if(argnum){
					crtArgument = arguments[argnum];
					useArgNum = true;
				} else {
					if(useArgNum && conversion !== '%'){
						return;
					}
					crtArgument = arguments[crtArgumentCtr++];
				}
				switch(conversion){
					case '%':
						//a percent sign
						repl = '__pct__';
						crtArgumentCtr--;
						break;
					case 'b':
						//an unsigned integer, in binary
						repl = Math.abs(parseInt(crtArgument,10)).toString(2);
						break;
					case 'c':
						//a character with the given number
						repl = String.fromCharCode(parseInt(crtArgument,10));
						break;
					case 's':
						//a string
						repl = crtArgument;
						if(precision){
							repl = repl.substring(0,precision);
						}
						break;
					case 'i':
					case 'd':
						//a signed integer, in decimal
						repl = parseInt(crtArgument,10) || 0;
						if(alwayssigned && repl > 0){
							repl = '+' + repl;
						}
						break;
					case 'u':
						//an unsigned integer, in decimal
						repl = Math.abs(parseInt(crtArgument,10));
						break;
					case 'o':
						//a signed integer, in octal
						repl = parseInt(crtArgument,10).toString(8);
						if(alwayssigned && repl > 0){
							repl = '+' + repl;
						}
						break;
					case 'x':
						//a signed integer, in hexadecimal, lowercase letters
						repl = parseInt(crtArgument,10).toString(16).toLowerCase();
						if(alwayssigned && repl > 0){
							repl = '+' + repl;
						}
						break;
					case 'X':
						//a signed integer, in hexadecimal, uppercase letters
						repl = parseInt(crtArgument,10).toString(16).toUpperCase();
						if(alwayssigned && repl > 0){
							repl = '+' + repl;
						}
						break;
					case 'e':
						//a floating-point number, in scientific notation
						repl = e(crtArgument, precision, false);
						if(alwayssigned && repl > 0){
							repl = '+' + repl;
						}
						break;
					case 'E':
						//a floating-point number, in scientific notation
						repl = parseFloat(crtArgument,10);
						repl = repl.toExponential(precision).toUpperCase();
						if(alwayssigned && repl > 0){
							repl = '+' + repl;
						}
						break;
					case 'F':
					case 'f':
						//a floating-point number, in fixed decimal notation
						repl = f(crtArgument,precision);
						if(alwayssigned && repl > 0){
							repl = '+' + repl;
						}
						break;
					case 'g':
						//a floating-point number, in %e or %f notation
						repl = g(crtArgument,precision, false);
						if(alwayssigned && repl > 0){
							repl = '+' + repl;
						}
						break;
					case 'G':
						//a floating-point number, in %E or %f notation
						repl = g(crtArgument,precision, true);
						if(alwayssigned && repl > 0){
							repl = '+' + repl;
						}
						break;
				}
				if(minlen && repl.toString().length < minlen){
					joiner.length = minlen - repl.toString().length + 1;
					if(justify === '-'){
						repl = repl + joiner.join(padding);
					} else {
						repl = joiner.join(padding) + repl;
					}
				}
				str = left + repl + right;
			}

			return str.replace(/__pct__/g,'%');
		};
	}())
};



var main_namespace = {
	version: '0.0.1',
	UI: {
		load: function(path, templateValues) {
			if(typeof path !== 'string')  throw 'the load method of Carbons UI namespace expects a file path as a string. A '+typeof(path) +' was given.';
			
			var values = kroll.createFromFile(path, templateValues);
			
			ti_proxy_storage.IDs = object_methods.extend(ti_proxy_storage.IDs, values.proxy_cache);
			
			return values.root_element;
		},
		create: function(object, templateValues) {
			if(typeof object !== 'object') throw 'The create method of Carbons UI namespace expects an object. A '+typeof(object) +' was given.';
			
			var values = kroll.createFromObject(object, templateValues);

			ti_proxy_storage.IDs = object_methods.extend(ti_proxy_storage.IDs, values.proxy_cache);
			
			return values.root_element;
		},
		find: function(query) {
			if(typeof query !== 'string') throw 'The find method of Carbons UI namespace expects an id, type or class as a string. A '+typeof(query) +' was given.';

			
			if(query.lastIndexOf('#', 0) !== 0) {
				throw 'The find method of Carbons UI namespace only accepts IDs for now in the format of: #idtag';
			} else {
				// We are looking for an ID so we can now strip the #
				query = query.substring(1);
				
				if(ti_proxy_storage.IDs[query] !== undefined) {
					return ti_proxy_storage.IDs[query];
				} else {
					return false;
				}
			}
		
			return false;
		},
		addTSS: function(path) {
		  kroll.tssFromPath(path);
		}
	},
	Platform: ti_properties.Platform,

	Obj: {
		extend: object_methods.extend
	},
	S: string_methods.pretty_concat
};

module.exports = main_namespace;