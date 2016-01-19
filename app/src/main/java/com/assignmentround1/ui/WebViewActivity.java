package com.assignmentround1.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.URLUtil;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.assignmentround1.R;
import com.assignmentround1.helper.DialogHelper;
import com.assignmentround1.model.WebViewListItem;
import com.assignmentround1.util.AppConstant;
import com.assignmentround1.util.NetworkConnection;

/**
 * Created by ttnd on 19/1/16.
 */
public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        if(NetworkConnection.isNetworkAvailable(this)){
        WebViewListItem webViewListItem = getIntent().getParcelableExtra(AppConstant.WEBVIEW_DETAIL);
        setTitle(webViewListItem.getPageTitle());
        WebView webView = (WebView) findViewById(R.id.webview);
        webView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webView.setWebViewClient(new CustomWebViewClient());
        webView.loadUrl(appendUrl(webViewListItem.getUrl()));
        } else {
            new DialogHelper().showOneButtonDialog(AppConstant.FINISH_WEBVIEW_ACTIVITY,this);
        }

    }

    private class CustomWebViewClient extends WebViewClient {

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);

        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            if (!URLUtil.isValidUrl(url)) {
                new DialogHelper().showOneButtonDialog(AppConstant.FINISH_ACTIVITY, WebViewActivity.this);
            }
        }
    }

    private String appendUrl(String url) {
        String appendUrl;
        if (!url.contains("?")) {
            appendUrl = url + "?";
        } else {
            appendUrl = url;
        }
        String append = "&userId=276" +
                "&appSecretKey=gvx32RFZLNGhmzYrfDCkb9jypTPa8Q" +
                "currencyCode=USD" +
                "offerId=10736598" +
                "selectedVouchers=[]";
        appendUrl = appendUrl + append;
        return appendUrl;
    }
}
