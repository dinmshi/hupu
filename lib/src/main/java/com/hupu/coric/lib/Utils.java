package com.hupu.coric.lib;

import android.text.TextUtils;

/**
 * Created by coric on 21/01/2018.
 */

public class Utils {
    public static boolean isNull(String... args) {
        if (args == null) return true;
        for (String item : args) {
            if (TextUtils.isEmpty(item)) return true;
        }
        return false;
    }
}
