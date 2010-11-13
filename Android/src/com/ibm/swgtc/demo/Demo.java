
package com.ibm.swgtc.demo;

import android.app.Activity;
import android.os.Bundle;
import com.phonegap.*;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;

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
        this.setProperty("loadingDialog", "Wait,Loading Demo...");
        //super.setProperty("hideLoadingDialogOnPageLoad", true);
        //this.setProperty("splashscreen", R.drawable.sandy);
        this.setProperty("errorUrl", "file:///android_asset/www/error.html");
        this.setProperty("loadUrlTimeoutValue", 5000);
        this.init();
        //this.appView.clearCache(true);
        this.loadSplashScreen("file:///android_asset/www/splash.html");
        this.loadUrl("file:///android_asset/www/index.html", 3000);
    }
}
