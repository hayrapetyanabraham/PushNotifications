package com.test.pushnotifications.shared;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefUtils {

    private static SharedPreferences getPreferences(Context context, String sharedPrefName) {
        return context.getSharedPreferences(sharedPrefName, 0);
    }

    public static void storeStringInPreference(Context context, String key, String value) {
        SharedPreferences mySharedPreferences = getPreferences(context, SharedPrefUtils.class.getSimpleName());
        SharedPreferences.Editor editor = mySharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static String loadStringFromPreference(Context context, String key) {
        SharedPreferences mySharedPreferences = getPreferences(context, SharedPrefUtils.class.getSimpleName());
        return mySharedPreferences.getString(key, "");
    }
}
