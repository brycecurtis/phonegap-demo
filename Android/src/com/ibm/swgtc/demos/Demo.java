
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
        super.appView.clearCache(true);
        //super.addService("Demo", "com.ibm.swgtc.demo.DemoPlugin");
        this.pluginManager.exec("Notification", "activityStart", null, "[\"Wait\",\"Loading Application...\"]", false);
        this.registerForContextMenu(super.appView);
        super.loadUrl("file:///android_asset/www/index.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        int base = Menu.FIRST;
        // Group, item id, order, title
        menu.add(base,base,base,"Demo");
        menu.add(base,base+1,base+1,"item2");
        menu.add(base,base+2,base+2,"item3");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        System.out.println("onPrepareOptionsMenu()");
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo info) {
        System.out.println("onCreateContextMenu()");
        menu.setHeaderTitle("Sample Context Menu");
        menu.add(200, 200, 200, "item1");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        return true;
    }

}
