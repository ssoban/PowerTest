package com.mi.soban.powertest;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiScrollable;
import android.support.test.uiautomator.UiSelector;

import java.util.ArrayList;

public class TC_02_RUN_FACEBOOK_APP extends InstrumentedTest_Base_class {
    int n;

      public TC_02_RUN_FACEBOOK_APP() {

        this.device= device;

       }

      public void launch_facebook() {


      execute("am start -n com.facebook.katana/.LoginActivity");
      sleep(6000);
       }
public void scroll_up_down(){
    // scroll down
    UiScrollable scrollview = new UiScrollable(
            new UiSelector().className("android.support.v4.view.ViewPager"));
    try {
        scrollview.scrollToEnd(19);
        scrollview.scrollToBeginning(20);

    } catch (UiObjectNotFoundException e) {
        e.printStackTrace();
    }
}

    public void click_tabs() {


        //Swipe_Scroll swiping= new Swipe_Scroll();
       // swiping.bottomTopswipe(10000);
       // swiping.topBottomswipe(30000);
       // swiping.leftRightSwipe(20000);
       // swiping.rightLeftSwipe(30000);
         // device.dumpWindowHierarchy("/sdcard/test.txt");
         // device.dumpWindowHierarchy();
        //UiObject2 appViews =new UiObject2(new UiSelector().className("android.view.View"));
       // appViews.swipe(" Left ",10);
       // device.swipe(70, 1012, 900, 1159, 200);
        int i;
        ArrayList<UiObject2> tab3wnew = (ArrayList<UiObject2>) device.findObjects(By.clazz("android.view.View"));
        for(i=0; i <= tab3wnew.size()-1; i++) {

            //  if (tab3wnew.get()) String s = tab3wnew.getContentDescription();
            if(tab3wnew.get(i).isEnabled()){
                tab3wnew.get(i).click();
            };
            sleep(2000);

        }
        /*
        UiObject2 tab2 = device.findObject(By.descContains("Friend Requests12, tab 2 of 6"));

        if (tab2 != null) {
            tab2.click();
            sleep(1000);
        } else {
            UiObject2 tab2F = device.findObject(By.descContains("Friend Requests"));
            if(tab2F!=null) {
                tab2F.click();
                sleep(2000);
            }else{
                UiObject2 tab3fnew = device.findObject(By.descContains("Friend Requests," + " " + n + " " + "new"));
                tab3fnew.click();
                sleep(2000);
            }
        }
        UiObject2 tab3 = device.findObject(By.descContains("Watch, tab 3 of 6"));
        if (tab3 != null) {
            tab3.click();
            sleep(2000);
        } else {
            UiObject2 tab3w = device.findObject(By.descContains("Watch"));
            if (tab3w != null) {
                tab3w.click();
                sleep(2000);
            } else {
               System.out.printf("No object");
                }

        }
        // UiObject2 tab4 = device.findObject(By.descContains("Profile, tab 4 of 6"));
        // tab4.click();
        //sleep(1000);
        UiObject2 tab5 = device.findObject(By.descContains("Notifications, tab 5 of 6"));
        if (tab5 != null) {
            tab5.click();
            sleep(2000);
        } else {
            UiObject2 tab5N = device.findObject(By.descContains("Notifications"));
            if (tab5N != null) {
                tab5N.click();
                sleep(2000);
            } else {
                UiObject2 tab5Nnew = device.findObject(By.descContains("Notifications" + "," + " " + n + " " + "new"));
                tab5Nnew.click();
                sleep(2000);
            }
        }
        UiObject2 tab6 = device.findObject(By.descContains("More, tab 6 of 6"));
        if (tab6 != null) {
            tab6.click();
            sleep(2000);
        } else {
            UiObject2 tab6M = device.findObject(By.descContains("More"));
            if (tab6M != null) {
                tab6M.click();
                sleep(2000);
            } else {
                UiObject2 tab6Nnew = device.findObject(By.descContains("More" + "," + " " + n + " " + "new"));

                tab6Nnew.click();
                sleep(2000);
            }
        }
        UiObject2 tab = device.findObject(By.descContains("News Feed, tab 1 of 6"));
        if (tab != null) {
            tab.click();
            sleep(2000);
        } else {
            UiObject2 tabNEws = device.findObject(By.descContains("News Feed"));
            if (tabNEws != null) {
                tabNEws.click();
                sleep(2000);
            } else {
                UiObject2 tabnew = device.findObject(By.descContains("More" + "," + " " + n + " " + "new"));
                tabnew.click();
                sleep(2000);
            }
        }*/

    }
    public void sharephoto() {

        UiObject2 explore = device.findObject(By.descContains("Photo"));

        explore.click();
        sleep(2000);
        UiObject2 cameratab = device.findObject(By.descContains("Camera"));
        cameratab.click();
        sleep(6000);
        UiObject2 cameratab1 = device.findObject(By.descContains("Take photo or hold for video"));
        cameratab1.click();
        sleep(2000);
        UiObject2 sharebttn = device.findObject(By.descContains("Share on next screen"));
        sharebttn.click();
        sleep(2000);
        UiObject2 edittext123 = device.findObject(By.clazz("android.widget.EditText"));
        edittext123.setText("Hi ......................................This is robooooooooo");
        sleep(2000);
        UiObject2 sharebttn1 = device.findObject(By.descContains("SHARE"));
        sharebttn1.click();
        sleep(2000);
        UiObject2 sharebttn2 = device.findObject(By.descContains("SHARE NOW"));
        sharebttn2.click();
        sleep(2000);
    }

}
