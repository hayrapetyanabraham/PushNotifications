package com.test.pushnotifications.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.test.pushnotifications.R;
import com.test.pushnotifications.shared.SharedPrefConstants;
import com.test.pushnotifications.shared.SharedPrefUtils;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String fcmToken = SharedPrefUtils.loadStringFromPreference(this, SharedPrefConstants.FIREBASE_TOKEN);
        Log.d(TAG, "token " + fcmToken);

    }
}
