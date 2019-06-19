package com.mi.soban.powertest;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;

import java.io.IOException;

public class TC_01_RUN_MESSENGER_APP extends InstrumentedTest_Base_class{

//    public TC_01_RUN_MESSENGER_APP(UiDevice device) {
//
//        this.device= InstrumentedTest_Base_class.device;
//
//       }



    public void launch_messenger_app() throws IOException {

        execute("am start -n com.android.mms/.ui.NewMessageActivity");
     Logger.i("PASS" );




        this.sleep(3000);




    }
      public void enter_number(){
        sleep(3000);
        UiObject2 number = device.findObject(By.res("com.android.mms:id/recipients_editor"));
        number.setText("9611146914");
          sleep(5000);
       }

    public void confirm_number(){
        sleep(5000);
        UiObject2 confnumber = device.findObject(By.res("com.android.mms:id/confirm_recipient"));
        confnumber.click();
    }
    public void enter_text() {
        sleep(3000);
        UiObject2 smsobj = device.findObject(By.res("com.android.mms:id/embedded_text_editor"));
        smsobj.setText("hi text1");
        sleep(3000);
    }
    public void setSendbttn(){
       UiObject2 sendbttn = device.findObject(By.res("com.android.mms:id/send_button"));
       sendbttn.click();
       sleep(1000);
}




}
