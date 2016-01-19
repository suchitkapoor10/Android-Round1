package com.assignmentround1.helper;

import android.content.Context;

import com.assignmentround1.R;
import com.assignmentround1.model.Base;
import com.assignmentround1.model.BestPrice;
import com.assignmentround1.model.CannotRedeem;
import com.assignmentround1.model.CityCoverage;
import com.assignmentround1.model.CityPromotion;
import com.assignmentround1.model.CityUnknown;
import com.assignmentround1.model.CreditsEmpty;
import com.assignmentround1.model.CreditsList;
import com.assignmentround1.model.CreditsListExpired;
import com.assignmentround1.model.CreditsListUsed;
import com.assignmentround1.model.CreditsOverview;
import com.assignmentround1.model.Discount;
import com.assignmentround1.model.Faq;
import com.assignmentround1.model.ForcedRegistration;
import com.assignmentround1.model.GuestInfoRequired;
import com.assignmentround1.model.Hotelquickly;
import com.assignmentround1.model.HowDoesItWork;
import com.assignmentround1.model.HowToShare;
import com.assignmentround1.model.Index;
import com.assignmentround1.model.Jobs;
import com.assignmentround1.model.LineDemo;
import com.assignmentround1.model.LocationUnknown;
import com.assignmentround1.model.News;
import com.assignmentround1.model.NoCreditForOrder;
import com.assignmentround1.model.NotificationList;
import com.assignmentround1.model.OfferInfo;
import com.assignmentround1.model.OfferReviews;
import com.assignmentround1.model.OrderCalculation;
import com.assignmentround1.model.OrdersSavings;
import com.assignmentround1.model.PointsOfInterest;
import com.assignmentround1.model.Policy;
import com.assignmentround1.model.PriceGuaranteeDetail;
import com.assignmentround1.model.PriceGuaranteeOverview;
import com.assignmentround1.model.RoomsOfferInfo;
import com.assignmentround1.model.Roomsinfo;
import com.assignmentround1.model.SecurityInfo;
import com.assignmentround1.model.Shaking;
import com.assignmentround1.model.SharingContacts;
import com.assignmentround1.model.SharingDetails;
import com.assignmentround1.model.SharingOverview;
import com.assignmentround1.model.SoldOut;
import com.assignmentround1.model.Support;
import com.assignmentround1.model.Terms;
import com.assignmentround1.model.TermsReferrals;
import com.assignmentround1.model.WebViewLinksResponse;
import com.assignmentround1.model.WebViewListItem;
import com.assignmentround1.model.WhySoFew;

/**
 * Created by ttnd on 19/1/16.
 */
public class Helper {
    private static Helper ourInstance = new Helper();

    public static Helper getInstance() {
        return ourInstance;
    }

    private Helper() {}

    public WebViewListItem getSelectedItem(int position,Context context,WebViewLinksResponse webViewLinksResponse){
        String[] titles = context.getResources().getStringArray(R.array.list_title);
        String title = titles[position];
        WebViewListItem webViewListItem = getSelectedItem(title,context,webViewLinksResponse);
        return webViewListItem;
    }

    private WebViewListItem getSelectedItem(String title,Context context,WebViewLinksResponse webViewLinksResponse) {
        WebViewListItem webViewListItem = new WebViewListItem();
        switch (title){
            case "Base":{
                Base base = webViewLinksResponse.getBase();
                webViewListItem.setPageTitle("Base");
                webViewListItem.setUrl(base.getUrl());
            }
            break;

            case "BestPrice":{
                BestPrice bestPrice = webViewLinksResponse.getBestPrice();
                webViewListItem.setPageTitle("BestPrice");
                webViewListItem.setUrl(bestPrice.getUrl());
            }
            break;

            case "CannotRedeem":{
                CannotRedeem cannotRedeem = webViewLinksResponse.getCannotRedeem();
                webViewListItem.setPageTitle("CannotRedeem");
                webViewListItem.setUrl(cannotRedeem.getUrl());
            }
            break;

            case "CityCoverage":{
                CityCoverage cityCoverage = webViewLinksResponse.getCityCoverage();
                webViewListItem.setPageTitle("CityCoverage");
                webViewListItem.setUrl(cityCoverage.getUrl());
            }
            break;

            case "CityPromotion":{
                CityPromotion cityPromotion = webViewLinksResponse.getCityPromotion();
                webViewListItem.setPageTitle("CityPromotion");
                webViewListItem.setUrl(cityPromotion.getUrl());
            }
            break;

            case "CityUnknown":{
                CityUnknown cityUnknown = webViewLinksResponse.getCityUnknown();
                webViewListItem.setPageTitle("CityUnknown");
                webViewListItem.setUrl(cityUnknown.getUrl());
            }
            break;

            case "CreditsEmpty":{
                CreditsEmpty creditsEmpty = webViewLinksResponse.getCreditsEmpty();
                webViewListItem.setPageTitle("CreditsEmpty");
                webViewListItem.setUrl(creditsEmpty.getUrl());
            }
            break;

            case "CreditsList":{
                CreditsList creditsList = webViewLinksResponse.getCreditsList();
                webViewListItem.setPageTitle("CreditsList");
                webViewListItem.setUrl(creditsList.getUrl());
            }
            break;

            case "CreditsListExpired":{
                CreditsListExpired creditsListExpired = webViewLinksResponse.getCreditsListExpired();
                webViewListItem.setPageTitle("CreditsListExpired");
                webViewListItem.setUrl(creditsListExpired.getUrl());
            }
            break;

            case "CreditsListUsed":{
                CreditsListUsed creditsListUsed = webViewLinksResponse.getCreditsListUsed();
                webViewListItem.setPageTitle("CreditsListUsed");
                webViewListItem.setUrl(creditsListUsed.getUrl());
            }
            break;

            case "CreditsOverview":{
                CreditsOverview creditsOverview = webViewLinksResponse.getCreditsOverview();
                webViewListItem.setPageTitle("CreditsOverview");
                webViewListItem.setUrl(creditsOverview.getUrl());
            }
            break;

            case "Discount":{
                Discount discount = webViewLinksResponse.getDiscount();
                webViewListItem.setPageTitle("Discount");
                webViewListItem.setUrl(discount.getUrl());
            }
            break;

            case "Faq":{
                Faq faq = webViewLinksResponse.getFaq();
                webViewListItem.setPageTitle("Faq");
                webViewListItem.setUrl(faq.getUrl());
            }
            break;

            case "ForcedRegistration":{
                Base base = webViewLinksResponse.getBase();
                webViewListItem.setPageTitle("Base");
                webViewListItem.setUrl(base.getUrl());
            }
            break;

            case "ForHotels":{
                ForcedRegistration forcedRegistration = webViewLinksResponse.getForcedRegistration();
                webViewListItem.setPageTitle("ForcedRegistration");
                webViewListItem.setUrl(forcedRegistration.getUrl());
            }
            break;

            case "GuestInfoRequired":{
                GuestInfoRequired guestInfoRequired = webViewLinksResponse.getGuestInfoRequired();
                webViewListItem.setPageTitle("GuestInfoRequired");
                webViewListItem.setUrl(guestInfoRequired.getUrl());
            }
            break;

            case "Hotelquickly":{
                Hotelquickly hotelquickly = webViewLinksResponse.getHotelquickly();
                webViewListItem.setPageTitle("Hotelquickly");
                webViewListItem.setUrl(hotelquickly.getUrl());
            }
            break;

            case "HowDoesItWork":{
                HowDoesItWork howDoesItWork = webViewLinksResponse.getHowDoesItWork();
                webViewListItem.setPageTitle("HowDoesItWork");
                webViewListItem.setUrl(howDoesItWork.getUrl());
            }
            break;

            case "HowToShare":{
                HowToShare howToShare = webViewLinksResponse.getHowToShare();
                webViewListItem.setPageTitle("HowToShare");
                webViewListItem.setUrl(howToShare.getUrl());
            }
            break;

            case "Index":{
                Index index = webViewLinksResponse.getIndex();
                webViewListItem.setPageTitle("Index");
                webViewListItem.setUrl(index.getUrl());
            }
            break;

            case "Jobs":{
                Jobs jobs = webViewLinksResponse.getJobs();
                webViewListItem.setPageTitle("Jobs");
                webViewListItem.setUrl(jobs.getUrl());
            }
            break;

            case "LineDemo":{
                LineDemo lineDemo = webViewLinksResponse.getLineDemo();
                webViewListItem.setPageTitle("LineDemo");
                webViewListItem.setUrl(lineDemo.getUrl());
            }
            break;

            case "LocationUnknown":{
                LocationUnknown locationUnknown = webViewLinksResponse.getLocationUnknown();
                webViewListItem.setPageTitle("LocationUnknown");
                webViewListItem.setUrl(locationUnknown.getUrl());
            }
            break;

            case "News":{
                News news = webViewLinksResponse.getNews();
                webViewListItem.setPageTitle("News");
                webViewListItem.setUrl(news.getUrl());
            }
            break;

            case "NoCreditForOrder":{
                NoCreditForOrder noCreditForOrder = webViewLinksResponse.getNoCreditForOrder();
                webViewListItem.setPageTitle("NoCreditForOrder");
                webViewListItem.setUrl(noCreditForOrder.getUrl());
            }
            break;

            case "NotificationList":{
                NotificationList notificationList = webViewLinksResponse.getNotificationList();
                webViewListItem.setPageTitle("NotificationList");
                webViewListItem.setUrl(notificationList.getUrl());
            }
            break;

            case "OfferInfo":{
                OfferInfo offerInfo = webViewLinksResponse.getOfferInfo();
                webViewListItem.setPageTitle("OfferInfo");
                webViewListItem.setUrl(offerInfo.getUrl());
            }
            break;

            case "OfferReviews":{
                OfferReviews offerReviews = webViewLinksResponse.getOfferReviews();
                webViewListItem.setPageTitle("OfferReviews");
                webViewListItem.setUrl(offerReviews.getUrl());
            }
            break;

            case "OrderCalculation":{
                OrderCalculation orderCalculation = webViewLinksResponse.getOrderCalculation();
                webViewListItem.setPageTitle("OrderCalculation");
                webViewListItem.setUrl(orderCalculation.getUrl());
            }
            break;

            case "OrdersSavings":{
                OrdersSavings ordersSavings = webViewLinksResponse.getOrdersSavings();
                webViewListItem.setPageTitle("OrdersSavings");
                webViewListItem.setUrl(ordersSavings.getUrl());
            }
            break;

            case "PointsOfInterest":{
                PointsOfInterest pointsOfInterest = webViewLinksResponse.getPointsOfInterest();
                webViewListItem.setPageTitle("PointsOfInterest");
                webViewListItem.setUrl(pointsOfInterest.getUrl());
            }
            break;

            case "Policy":{
                Policy policy = webViewLinksResponse.getPolicy();
                webViewListItem.setPageTitle("Policy");
                webViewListItem.setUrl(policy.getUrl());
            }
            break;

            case "PriceGuaranteeDetail":{
                PriceGuaranteeDetail priceGuaranteeDetail = webViewLinksResponse.getPriceGuaranteeDetail();
                webViewListItem.setPageTitle("PriceGuaranteeDetail");
                webViewListItem.setUrl(priceGuaranteeDetail.getUrl());
            }
            break;

            case "PriceGuaranteeOverview":{
                PriceGuaranteeOverview priceGuaranteeOverview = webViewLinksResponse.getPriceGuaranteeOverview();
                webViewListItem.setPageTitle("PriceGuaranteeOverview");
                webViewListItem.setUrl(priceGuaranteeOverview.getUrl());
            }
            break;

            case "Roomsinfo":{
                Roomsinfo roomsinfo = webViewLinksResponse.getRoomsinfo();
                webViewListItem.setPageTitle("Roomsinfo");
                webViewListItem.setUrl(roomsinfo.getUrl());
            }
            break;

            case "RoomsOfferInfo":{
                RoomsOfferInfo roomsOfferInfo = webViewLinksResponse.getRoomsOfferInfo();
                webViewListItem.setPageTitle("RoomsOfferInfo");
                webViewListItem.setUrl(roomsOfferInfo.getUrl());
            }
            break;

            case "SecurityInfo":{
                SecurityInfo securityInfo = webViewLinksResponse.getSecurityInfo();
                webViewListItem.setPageTitle("SecurityInfo");
                webViewListItem.setUrl(securityInfo.getUrl());
            }
            break;

            case "Shaking":{
                Shaking shaking = webViewLinksResponse.getShaking();
                webViewListItem.setPageTitle("Shaking");
                webViewListItem.setUrl(shaking.getUrl());
            }
                break;

            case "SharingContacts":{
                SharingContacts sharingContacts = webViewLinksResponse.getSharingContacts();
                webViewListItem.setPageTitle("SharingContacts");
                webViewListItem.setUrl(sharingContacts.getUrl());
            }
            break;

            case "SharingDetails":{
                SharingDetails sharingDetails = webViewLinksResponse.getSharingDetails();
                webViewListItem.setPageTitle("SharingDetails");
                webViewListItem.setUrl(sharingDetails.getUrl());
            }
            break;

            case "SharingOverview":{
                SharingOverview sharingOverview = webViewLinksResponse.getSharingOverview();
                webViewListItem.setPageTitle("SharingOverview");
                webViewListItem.setUrl(sharingOverview.getUrl());
            }
            break;

            case "SoldOut":{
                SoldOut soldOut = webViewLinksResponse.getSoldOut();
                webViewListItem.setPageTitle("SoldOut");
                webViewListItem.setUrl(soldOut.getUrl());
            }
            break;

            case "Support":{
                Support support = webViewLinksResponse.getSupport();
                webViewListItem.setPageTitle("Support");
                webViewListItem.setUrl(support.getUrl());
            }
            break;

            case "Terms":{
                Terms terms = webViewLinksResponse.getTerms();
                webViewListItem.setPageTitle("Terms");
                webViewListItem.setUrl(terms.getUrl());
            }
            break;

            case "TermsReferrals":{
                TermsReferrals termsReferrals = webViewLinksResponse.getTermsReferrals();
                webViewListItem.setPageTitle("TermsReferrals");
                webViewListItem.setUrl(termsReferrals.getUrl());
            }
            break;

            case "WhySoFew":{
                WhySoFew whySoFew = webViewLinksResponse.getWhySoFew();
                webViewListItem.setPageTitle("WhySoFew");
                webViewListItem.setUrl(whySoFew.getUrl());
            }
            break;

        }
        return webViewListItem;
    }
}
