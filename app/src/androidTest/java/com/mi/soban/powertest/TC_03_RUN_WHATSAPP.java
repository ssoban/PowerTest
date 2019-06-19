package com.mi.soban.powertest;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;

public class TC_03_RUN_WHATSAPP extends InstrumentedTest_Base_class {
    public TC_03_RUN_WHATSAPP(UiDevice device) {

        this.device = InstrumentedTest_Base_class.device;
    }

    public void launch_app() {
        execute("am start -n com.whatsapp/.HomeActivity");
        sleep(2000);
    }

    public void search_number() {
        UiObject2 srch = device.findObject(By.res("com.whatsapp:id/menuitem_search"));
        srch.click();
    }

    public void enter_no() {
        sleep(2000);
        UiObject2 srch2 = device.findObject(By.res("com.whatsapp:id/search_src_text"));
        srch2.setText("7290903438");
        sleep(2000);
    }

    public void select() {
        UiObject2 srchresult = device.findObject(By.res("com.whatsapp:id/conversations_row_contact_name"));
        srchresult.click();
        sleep(2000);
    }

    public void ent_txt() {


        UiObject2 textset = device.findObject(By.res("com.whatsapp:id/entry"));
        textset.setText("shghsghg");
        sleep(2000);
    }
    public void Send_text() {
        UiObject2 sendtext = device.findObject(By.res("com.whatsapp:id/send"));
        sendtext.click();
    }
 }
