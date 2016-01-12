package com.kim_yzx.lookhouse.utils;

import android.util.Log;
import com.kim_yzx.house.config.AppConfig;

public class Logger {

    public static void e(String tag, String content) {
        if (AppConfig.DEBUG) {
            Log.e(tag, content);
        }
    }
}
