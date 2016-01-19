package com.assignmentround1.server;

import retrofit.RestAdapter;
import retrofit.android.AndroidLog;

/**
 * Created by ttnd on 19/1/16.
 */
public class ApiClient {

    public static String BASE_URL = "http://appcontent.hotelquickly.com/en/1/android";
    private static ApiInterface sAppService;

    public static ApiInterface getApiClient() {
        if (sAppService == null) {
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint(BASE_URL)
                    .setLogLevel(RestAdapter.LogLevel.FULL)
                    .setLog(new AndroidLog("LogLevel_FULL"))
                    .build();

            sAppService = restAdapter.create(ApiInterface.class);
        }
        return sAppService;
    }
}
