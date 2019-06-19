package com.mi.soban.powertest;

import android.os.Bundle;
import android.support.test.InstrumentationRegistry;

/**
 * null
 *
 * @author yumiao
 * @version 3.0.0
 * @since API Level 21
 */

public final class Config {
    public static final String LOG_TAG = "MARMOT";
    public static final String ROOT_PATH = "mnt/sdcard/adbsoban.txt"; //Auto test workspace.

    protected static String CASE_PATH = "/sdcard/"; //Current case folder to save screenshots and logs.
    protected static Boolean SAVE_LOGCAT = true;
    protected static Boolean SAVE_SCREENSHOT = true;

    public static long LAUNCHAPP_TIMEOUT = 5000;
    public static long SCREENDHOT_TIMEOUT = 3000;
    public static long STEP_WAITTIME = 500;
    public static int SWIPE_STEPS = 10;

    public static void getCommandLineArgumentsAndInitSwitchers() {
        String commandlineSaveLogKey = "log";
        String commandLineSaveScreenshotKey = "screenshot";
        Bundle arguments = InstrumentationRegistry.getArguments();

        if (arguments.containsKey(commandlineSaveLogKey)) {
            boolean saveLogSwitcher = arguments.getBoolean(commandlineSaveLogKey);
            if (saveLogSwitcher == true) {
                SAVE_LOGCAT = true;
            }
        }

        if (arguments.containsKey(commandLineSaveScreenshotKey)) {
            boolean saveScreenshotSwitcher = arguments.getBoolean(commandLineSaveScreenshotKey);
            if (saveScreenshotSwitcher == true) {
                SAVE_SCREENSHOT = true;
            }
        }

    }

    public static void setSaveScreenshot(Boolean switcher) {
        SAVE_LOGCAT = switcher;
    }

    public static String getCaseWorkPath() {
        return CASE_PATH;
    }

}

