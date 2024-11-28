
var data = `
{"menu": {
  "id": "file",
  "value": "File",
  "popup": {
    "menuitem": [
      {"value": "New", "onclick": "CreateNewDoc()"},
      {"value": "Open", "onclick": "OpenDoc()"},
      {"value": "Close", "onclick": "CloseDoc()"}
    ]
  }
}}`;
var temp = JSON.parse(data);

var container = document.getElementsByTagName("js-lab-12")[0];
console.log("Container: " + container);

container.innerHTML = `${temp.menu.value} - ${temp.menu.popup.menuitem[0].value}`;