package com.test.pushnotifications.services;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.test.pushnotifications.shared.SharedPrefConstants;
import com.test.pushnotifications.shared.SharedPrefUtils;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private static final String TAG = MyFirebaseMessagingService.class.getSimpleName();

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d(TAG, "token " + "I MESSAGE");
        if (remoteMessage.getData() != null && remoteMessage.getData().get("message") != null) {
            String message = remoteMessage.getData().get("message");
            Log.d(TAG, message);
        }
    }

    @Override
    public void onNewToken(String token) {
        SharedPrefUtils.storeStringInPreference(getApplicationContext(), SharedPrefConstants.FIREBASE_TOKEN, token);
        Log.d(TAG, "token " + token);
    }
}
