// open a single window
var C = Carbon = require('appersonlabs.carbon');

var win = C.UI.load('ui/table_view.json');
win.addEventListener('open', function() {
  var tableView = C.UI.find('#tableView');
  Ti.API.info("table view is "+tableView);
  tableView.setData([
    { title: 'Apples' },
    { title: 'Bananas' },
    { title: 'Carrots' },
    { title: 'Pears' }
  ]);
  Ti.API.info("set data");
});
win.open();
