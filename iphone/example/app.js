// open a single window
var C = Carbon = require('appersonlabs.carbon');

C.UI.addTSS('ui/test1.tss');

var result = Carbon.UI.load('ui/test1.json', { bar_title_1: 'test', bar_title_2: 'test 2'});
result.open();

var button = Carbon.UI.create({"Button": {
  id: "testButton2",
  title: "red button is red",
  backgroundColor: "red",
  width: 300,
  height: 100
}});

result.add(button);


// basic test
var testButton = C.UI.find('#testButton');

// var testButton = C.UI.find('#testButton');
// testButton.addEventListener('click', function(e) {
//     alert('hello!');
// });
setTimeout(function() {
    testButton.title = 'Click me now!';
    
    testButton.addEventListener('click', function(e) {
      alert('hello!');
    });
}, 10000);


/*
var result = UI.build('ui/nonexistant.json');
var result = UI.build('ui/syntax_error.json');
*/