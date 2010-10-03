package com.ibm.swgtc.demo;

import org.json.JSONArray;
import org.json.JSONException;
import com.phonegap.api.Plugin;
import com.phonegap.api.PluginResult;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import com.phonegap.*;

/**
 * This class provides a service.
 */
public class Hello implements Plugin {

    WebView webView;                    // WebView object
    DroidGap ctx;                       // DroidGap object

    /**
     * Constructor.
     */
    public Hello() {
    }

    /**
     * Sets the context of the Command. This can then be used to do things like
     * get file paths associated with the Activity.
     *
     * @param ctx The context of the main Activity.
     */
    public void setContext(DroidGap ctx) {
        this.ctx = ctx;
    }

    /**
     * Sets the main View of the application, this is the WebView within which
     * a PhoneGap app runs.
     *
     * @param webView The PhoneGap WebView
     */
    public void setView(WebView webView) {
        this.webView = webView;
    }

    /**
     * Executes the request and returns CommandResult.
     *
     * @param action The command to execute.
     * @param args JSONArry of arguments for the command.
     * @return A CommandResult object with a status and message.
     */
    public PluginResult execute(String action, JSONArray args) {
        PluginResult.Status status = PluginResult.Status.OK;
        String result = "";

        try {
            if (action.equals("hello")) {
                String s = this.hello(args.getString(0));
                return new PluginResult(status, s);
            }
            return new PluginResult(status, result);
        } catch (JSONException e) {
            return new PluginResult(PluginResult.Status.JSON_EXCEPTION);
        }
    }

    /**
     * Identifies if action to be executed returns a value and should be run synchronously.
     *
     * @param action    The action to execute
     * @return          T=returns value
     */
    public boolean isSynch(String action) {
        return false;
    }

    /**
     * Called when the system is about to start resuming a previous activity.
     */
    public void onPause() {
    }

    /**
     * Called when the activity will start interacting with the user.
     */
    public void onResume() {
    }

    /**
     * Called by AccelBroker when listener is to be shut down.
     * Stop listener.
     */
    public void onDestroy() {
    }

    /**
     * Called when an activity you launched exits, giving you the requestCode you started it with,
     * the resultCode it returned, and any additional data from it.
     *
     * @param requestCode       The request code originally supplied to startActivityForResult(),
     *                          allowing you to identify who this result came from.
     * @param resultCode        The integer result code returned by the child activity through its setResult().
     * @param data              An Intent, which can return result data to the caller (various data can be attached to Intent "extras").
     */
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
    }

    //--------------------------------------------------------------------------
    // LOCAL METHODS
    //--------------------------------------------------------------------------

    /**
     * Return name with Hello in front.
     *
     * @param name
     */
    public String hello(String name) {
        return "Hello, " + name + "!";
    }

}
