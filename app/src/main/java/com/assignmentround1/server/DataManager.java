package com.assignmentround1.server;

import android.content.Context;

import com.assignmentround1.model.WebViewLinksResponse;
import com.assignmentround1.server.callback.GetWebViewLinksCallback;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by ttnd on 19/1/16.
 */
public class DataManager {

    private ApiInterface mApiInterface;
    private Context mContext;
    private static DataManager sInstance;

    public static DataManager getInstance(Context context) {
        if (sInstance == null)
            sInstance = new DataManager(context);
        return sInstance;
    }

    private DataManager(Context context) {
        // initialize the api client
        mApiInterface = ApiClient.getApiClient();

        mContext = context;

    }

    public void getWebViewLinksDetail(final GetWebViewLinksCallback getWebViewLinksCallback){
        mApiInterface.getWebViewLinks(new Callback<WebViewLinksResponse>() {
            @Override
            public void success(WebViewLinksResponse webViewLinksResponse, Response response) {
                getWebViewLinksCallback.onSuccessfullyFetch(webViewLinksResponse);
            }

            @Override
            public void failure(RetrofitError error) {
                getWebViewLinksCallback.onError();
                if (error.isNetworkError()) {
                }
            }
        });
    }
}
