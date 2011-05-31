/**
 * Hello service class provides access to Hello service.
 */
function HelloPlugin() {
}

/**
 * Call hello.
 *
 * @param {String} name                 The name
 * @param {Function} successCallback    The function to call with the returned string.
 * @param {Function} errorCallback      The function to call when there is an error. (OPTIONAL)
 */
HelloPlugin.prototype.hello = function(name, successCallback, errorCallback) {
    PhoneGap.exec(successCallback, errorCallback, "HelloPlugin", "hello", [name]);
};

/**
 * Register service.
 */
PhoneGap.addConstructor(function() {
	PluginManager.addService("HelloPlugin", "com.ibm.swgtc.plugins.HelloPlugin");
});