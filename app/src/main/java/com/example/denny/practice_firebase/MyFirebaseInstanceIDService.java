package com.example.denny.practice_firebase;

import android.support.annotation.Nullable;
import android.support.annotation.StringDef;
import android.util.Log;

import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.iid.zzd;

import java.io.IOException;

/**
 * Created by Denny on 2016/8/9.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private final static String TAG = "MY FCM PRACTICE";

    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        // TODO: Implement this method to send any registration to your app's servers.
        sendRegistrationToServer(refreshedToken);
    }

    private void sendRegistrationToServer(String refreshedToken) {
    }

}


