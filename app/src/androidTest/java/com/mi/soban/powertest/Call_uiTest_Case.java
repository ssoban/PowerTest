package com.mi.soban.powertest;
import android.os.RemoteException;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;


import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.Date;


/**
 *
 */
@RunWith(AndroidJUnit4.class)
public class Call_uiTest_Case extends InstrumentedTest_Base_class {
   public Call_uiTest_Case(){

       this.device= device;
   }

    long startTime = System.currentTimeMillis();
    long elapsedTime = 0L;


    @Test
    public void mi_messenger_app() throws IOException {

        while (elapsedTime < 60 * 1000) {

            TC_01_RUN_MESSENGER_APP msgr = new TC_01_RUN_MESSENGER_APP();
            msgr.launch_messenger_app(); //executing adb command to launch

            msgr.enter_number();
            msgr.confirm_number();
            msgr.enter_text();
            msgr.setSendbttn();
            sleep(3000);
            elapsedTime = (new Date()).getTime() - startTime;
        }


    }

    @Test
    public void open_whatsapp() {
        while (elapsedTime < 1 * 60 * 1000) {

            TC_03_RUN_WHATSAPP whtapp = new TC_03_RUN_WHATSAPP(device);
            whtapp.launch_app();
            whtapp.search_number();
            whtapp.enter_no();
            whtapp.ent_txt();
            whtapp.ent_txt();
            sleep(2000);
            elapsedTime = (new Date()).getTime() - startTime;
        }
    }


    @Test
    public void open_facebook() {
        TC_02_RUN_FACEBOOK_APP fb = new TC_02_RUN_FACEBOOK_APP();
        fb.launch_facebook();
        fb.scroll_up_down();
        fb.click_tabs();
       // fb.sharephoto();

    }


    @Test
    public void open_game_app() {

        TC_04_RUN_GAME_APP asphalt = new TC_04_RUN_GAME_APP();
        asphalt.launch_game_app();
        while (elapsedTime < 1 * 60 * 1000) {
            //nothing to do
            elapsedTime = (new Date()).getTime() - startTime;

        }
    }

    @Test
    public void open_camera_app() throws IOException, InterruptedException {

        TC_05_RUN_CAMERA_APP cmra=new TC_05_RUN_CAMERA_APP();
        cmra.launch_camera_app();
        cmra.click_view();
        while (elapsedTime < 1 * 60 * 1000) {
            //nothing to do
            cmra.click_pic();
            elapsedTime = (new Date()).getTime() - startTime;

        }

    }

    @Test
    public void open_music_app() {
        TC_06_RUN_MI_MUSIC_APP musiapp= new TC_06_RUN_MI_MUSIC_APP();
        musiapp.launchmusic_app();
        while (elapsedTime < 1 * 60 * 1000) {
            //nothing to do
            elapsedTime = (new Date()).getTime() - startTime;

        }
    }

    @Test
    public void open_video_app() {
        TC_07_RUN_MI_VIDEO_APP vid = new TC_07_RUN_MI_VIDEO_APP();
        vid.launch_video_app();
        while (elapsedTime < 1 * 60 * 1000) {
            //nothing to do
            elapsedTime = (new Date()).getTime() - startTime;

        }
    }

    @Test
    public void open_call_app() {

        TC_08_RUN_DIALER_APP call=new TC_08_RUN_DIALER_APP();
        call.launch_dialer();

        while (elapsedTime < 1 * 60 * 1000) {
            //nothing to do
            elapsedTime = (new Date()).getTime() - startTime;

        }

    }

    @Test
    public void open_browser_app() {

        TC_09_RUN_MI_BROWSER_APP mib= new TC_09_RUN_MI_BROWSER_APP();
        mib.lunch_mi_browser();
        while (elapsedTime < 1 * 60 * 1000) {
            //nothing to do
            elapsedTime = (new Date()).getTime() - startTime;

        }

    }






    @Test
    public void clrbackground() throws RemoteException {
        device.pressHome();
        try {
            sleep(2000);
            device.pressRecentApps();
            sleep(4000);
            UiObject2 clrbckgrnd = device.findObject(By.res("com.android.systemui:id/clearAnimView").clazz("android.view.View"));
            clrbckgrnd.click();
        } catch (RemoteException e1) {
            e1.printStackTrace();
        }
    }









}

