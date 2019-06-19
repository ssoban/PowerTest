package com.mi.soban.powertest;

public class TC_09_RUN_MI_BROWSER_APP extends InstrumentedTest_Base_class{
public TC_09_RUN_MI_BROWSER_APP(){
    this.device= device;}

    public void lunch_mi_browser(){
        execute("am start -n com.android.browser/com.android.browser.BrowserActivity");
        sleep(6000);
    }
}
