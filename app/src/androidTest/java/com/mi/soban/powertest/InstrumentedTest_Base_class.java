package com.mi.soban.powertest;

import android.app.Instrumentation;
import android.content.Context;
import android.provider.SyncStateContract;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiDevice;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class InstrumentedTest_Base_class {
    public static UiDevice device;
    Instrumentation instrumentation;

     //   InstrumentationRegistry.getInstrumentation().getUiAutomation().executeShellCommand("pm clear " +SyncStateContract.Constants.PACKAGE_NAME);
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.mi.soban.powertest", appContext.getPackageName());
  // InstrumentationRegistry.getInstrumentation().getUiAutomation().executeShellCommand("pm clear " + appContext.getPackageName());
    }

    @Before
    public void setUp() {
        instrumentation = InstrumentationRegistry.getInstrumentation();
        device = UiDevice.getInstance(instrumentation);

    }//end of setup

    public String execute(String strCmd) {
        String str="";
        try {
            str=device.executeShellCommand(strCmd);
            // Runtime.getRuntime().exec(strCmd);


        } catch (IOException e) {
            e.printStackTrace();
        }

        return str;
    }


    public void sleep(int n) {
        try {
            Thread.sleep(n);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//sleep function end
}
