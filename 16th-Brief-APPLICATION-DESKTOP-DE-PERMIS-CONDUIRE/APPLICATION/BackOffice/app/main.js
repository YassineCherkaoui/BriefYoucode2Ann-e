const {
  BrowserWindow
} = require("electron");

function createWindow() {
  const win = new BrowserWindow({
    width: 1925,
    height: 900,
    webPreferences: {
      nodeIntegration: false
    }
  });

  win.loadFile("app/index.html");
}

module.exports = {
  createWindow
};
