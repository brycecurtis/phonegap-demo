
package com.ibm.swgtc.demo;

import android.os.Bundle;
import com.phonegap.*;
import android.webkit.WebView;

public class Demo extends DroidGap {

    /**
     * Constructor
     */
    public Demo() {
        super();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    	// Init webview
    	this.init();
    	
    	// Set our own WebViewClient so we can see webview events
    	//this.setWebViewClient(this.appView, new DemoViewClient(this));
    	
    	// Set error url that gets called if there is an error loading any url page
    	//this.setStringProperty("errorUrl", "file:///android_asset/www/config.html?error=true");
    	
    	// Clear our cache (this is used mainly during development - comment out for production)
    	this.clearCache();
    	// Show splashscreen
        this.setIntegerProperty("splashscreen", R.drawable.sandy);
        // Load our app
    	this.loadUrl("file:///android_asset/www/index.html", 3000);
    }
    
    /**
     * This class can be used to override the GapViewClient and receive notification of webview events.
     */
    public class DemoViewClient extends GapViewClient {

		public DemoViewClient(DroidGap arg0) {
			super(arg0);
		}
    	
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
        	System.out.println("DEMO.shouldOverrideUrlLoading("+url+")");
        	return super.shouldOverrideUrlLoading(view, url);
        }
        
        @Override
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        	System.out.println("DEMO.onReceivedError: Error code="+errorCode+" Description="+description+" URL="+failingUrl);
        	super.onReceivedError(view, errorCode, description, failingUrl);
        }
    }
}
