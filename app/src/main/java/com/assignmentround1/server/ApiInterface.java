package com.assignmentround1.server;

import com.assignmentround1.model.WebViewLinksResponse;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by ttnd on 19/1/16.
 */
public interface ApiInterface {

    @GET("/index.json")
    void getWebViewLinks(Callback<WebViewLinksResponse> webViewLinksResponseCallback);

}
