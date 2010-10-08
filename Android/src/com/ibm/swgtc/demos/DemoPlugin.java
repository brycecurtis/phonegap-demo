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
public class DemoPlugin extends Plugin {

    /**
     * Constructor.
     */
    public DemoPlugin() {
    }

    /**
     * Executes the request and returns PluginResult.
     *
     * @param action        The action to execute.
     * @param args          JSONArry of arguments for the plugin.
     * @param callbackId    The callback id used when calling back into JavaScript.
     * @return              A PluginResult object with a status and message.
     */
    public PluginResult execute(String action, JSONArray args, String callbackId) {
        PluginResult.Status status = PluginResult.Status.OK;
        String result = "";

        try {
            if (action.equals("echo")) {
                String s = this.echo(args.getString(0));
                return new PluginResult(status, s);
            }
            return new PluginResult(status, result);
        } catch (JSONException e) {
            return new PluginResult(PluginResult.Status.JSON_EXCEPTION);
        }
    }

    //--------------------------------------------------------------------------
    // LOCAL METHODS
    //--------------------------------------------------------------------------

    /**
     * Return string.
     *
     * @param text
     */
    public String echo(String text) {
        return "Echo: " + text;
    }

}
