// open a single window
var C = Carbon = require('appersonlabs.carbon');

var win = C.UI.load('ui/table_view.json');
win.addEventListener('open', function() {
  var tableView = C.UI.find('#tableView');
  tableView.setData([
    { className: 'class1', title: 'Apples' },
    { className: 'class2', title: 'Bananas', subtitle: 'A healthy treat that is full of potassium', image: 'img/bananas.jpg' },
    { className: 'class1', title: 'Carrots' },
    { className: 'class2', title: 'Pears', subtitle: 'Bartlett or Bosc, take your pick', image: 'img/pears.jpg' }
  ]);
});
win.open();
