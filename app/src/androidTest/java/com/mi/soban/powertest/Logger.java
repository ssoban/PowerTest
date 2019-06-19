package com.mi.soban.powertest;
import android.util.Log;

import static android.util.Log.*;

public class Logger {
    /**
     * Record common info,such as basic operations
     */
    public static void i(String msg) {
     Log.i(Config.LOG_TAG, msg);
       // new Log(msg);
    }

    /**
     * Record info with error
     */
    public static void e(String errorMsg) {
       Log.e(Config.LOG_TAG, errorMsg);
      // new Log(errorMsg);
    }
}

