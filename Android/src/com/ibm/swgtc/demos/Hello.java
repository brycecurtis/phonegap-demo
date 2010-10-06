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
public class Hello extends Plugin {

    /**
     * Constructor.
     */
    public Hello() {
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
            if (action.equals("hello")) {
                String s = this.hello(args.getString(0));
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
     * Return name with Hello in front.
     *
     * @param name
     */
    public String hello(String name) {
        return "Hello, " + name + "!";
    }

}
