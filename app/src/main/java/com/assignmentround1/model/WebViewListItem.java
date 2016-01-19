package com.assignmentround1.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ttnd on 19/1/16.
 */
public class WebViewListItem implements Parcelable{

    private String url;

    private String pageTitle;

    public WebViewListItem(){

    }

    protected WebViewListItem(Parcel in) {
        url = in.readString();
        pageTitle = in.readString();
    }

    public static final Creator<WebViewListItem> CREATOR = new Creator<WebViewListItem>() {
        @Override
        public WebViewListItem createFromParcel(Parcel in) {
            return new WebViewListItem(in);
        }

        @Override
        public WebViewListItem[] newArray(int size) {
            return new WebViewListItem[size];
        }
    };

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(url);
        dest.writeString(pageTitle);
    }
}
