package com.assignmentround1.ui;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.assignmentround1.R;
import com.assignmentround1.adapter.MainListAdapter;
import com.assignmentround1.helper.AppProgressDialog;
import com.assignmentround1.helper.DialogHelper;
import com.assignmentround1.helper.Helper;
import com.assignmentround1.model.WebViewLinksResponse;
import com.assignmentround1.model.WebViewListItem;
import com.assignmentround1.server.DataManager;
import com.assignmentround1.server.callback.GetWebViewLinksCallback;
import com.assignmentround1.util.AppConstant;
import com.assignmentround1.util.AppLog;
import com.assignmentround1.util.NetworkConnection;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;

    private WebViewLinksResponse mWebViewLinksResponse;

    private ProgressDialog mProgressDialog;

    private AlertDialog mAlertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.listview_main);

        if(NetworkConnection.isNetworkAvailable(this)){
            hitApi();
        } else {
            mAlertDialog = new DialogHelper().showOneButtonDialog(AppConstant.NETWORK_RETRY,this);
        }

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                WebViewListItem webViewListItem = Helper.getInstance().getSelectedItem(position,MainActivity.this,mWebViewLinksResponse);
                Intent intent = new Intent(MainActivity.this,WebViewActivity.class);
                intent.putExtra(AppConstant.WEBVIEW_DETAIL,webViewListItem);
                startActivity(intent);
            }
        });
    }

    public void hitApi(){
        if(mAlertDialog != null && mAlertDialog.isShowing())
            mAlertDialog.dismiss();
        mProgressDialog = AppProgressDialog.getInstance().showProgressDialog("Loading...",this);
        DataManager.getInstance(this).getWebViewLinksDetail(mGetWebViewLinksCallback);
    }

    private GetWebViewLinksCallback mGetWebViewLinksCallback =
            new GetWebViewLinksCallback() {
                @Override
                public void onSuccessfullyFetch(WebViewLinksResponse webViewLinksResponse) {
                    mProgressDialog.dismiss();
                    AppLog.d("success","fetch");
                    mWebViewLinksResponse = webViewLinksResponse;
                    MainListAdapter adapter = new MainListAdapter(MainActivity.this);
                    mListView.setAdapter(adapter);
                }

                @Override
                public void onError() {
                    mProgressDialog.dismiss();
                    AppLog.d("fail","fetch");
                }
            };
}
