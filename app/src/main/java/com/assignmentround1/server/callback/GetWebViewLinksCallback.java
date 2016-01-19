package com.assignmentround1.server.callback;

import com.assignmentround1.model.WebViewLinksResponse;

/**
 * Created by ttnd on 19/1/16.
 */
public interface GetWebViewLinksCallback {

    void onSuccessfullyFetch(WebViewLinksResponse webViewLinksResponse);

    void onError();

}
