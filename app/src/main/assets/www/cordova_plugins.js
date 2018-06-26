cordova.define('cordova/plugin_list', function(require, exports, module) {
module.exports = [
  {
    "id": "cordova-plugin-setting.SettingPlugin",
    "file": "plugins/cordova-plugin-setting/www/SettingPlugin.js",
    "pluginId": "cordova-plugin-setting",
    "clobbers": [
      "navigator.setting"
    ]
  }
];
module.exports.metadata = 
// TOP OF METADATA
{
  "cordova-plugin-whitelist": "1.3.3",
  "cordova-plugin-setting": "1.0.0"
};
// BOTTOM OF METADATA
});