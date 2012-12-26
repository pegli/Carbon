// open a single window
var C = Carbon = require('appersonlabs.carbon');

C.UI.addTSS('ui/test1.tss');

var result = Carbon.UI.load('ui/test_android.json', {
  button_title: 'this button should work in a moment...',
  label_text: 'I am a label, hurrah!',
  alabel_text: 'this is a label on tab 1'
});
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