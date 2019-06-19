package com.mi.soban.powertest;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiObject2;

import java.util.ArrayList;

public class TC_05_RUN_CAMERA_APP extends InstrumentedTest_Base_class {

    public TC_05_RUN_CAMERA_APP(){
        this.device= device;

    }
    public void launch_camera_app(){
        execute("am start -n com.android.camera/com.android.camera.Camera");


        sleep(6000);


        System.out.printf("msg1");
    }

    public void click_view() throws InterruptedException {
        int i;

        ArrayList<UiObject2> options = (ArrayList<UiObject2>) device.findObjects(By.clazz("android.widget.TextView"));
        for(i=0; i <options.size(); i++) {

            //  if (tab3wnew.get()) String s = tab3wnew.getContentDescription();
            if(options.get(i).isEnabled()){
                options.get(i).click();
                sleep(2000);


            };


        }
        for(i=options.size()-1; i >=0; i--) {

            //  if (tab3wnew.get()) String s = tab3wnew.getContentDescription();
            if(options.get(i).isEnabled()){
                options.get(i).click();
                sleep(2000);
            };


        }

    }
    public void click_pic(){
        int i;
        UiObject2 clck = device.findObject(By.text("Photo").res("com.android.camera:id/text_item_title"));

        if(clck!=null) {
            clck.click();
         for( i=0;i<=10;i++){
             UiObject2 clck1 = device.findObject(By.res("com.android.camera:id/v9_shutter_button_internal"));

                clck1.click();
                sleep(3000);

            }
        }
    }
}



