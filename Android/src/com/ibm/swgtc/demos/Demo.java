
package com.ibm.swgtc.demo;

import android.app.Activity;
import android.os.Bundle;
import com.phonegap.*;

public class Demo extends DroidGap
{

    /**
     * Constructor
     */
    public Demo() {
        super();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.appView.clearCache(true);
        //super.addService("HelloPlugin", "com.ibm.swgtc.plugins.HelloPlugin");
        super.loadUrl("file:///android_asset/www/index.html");
    }
}
