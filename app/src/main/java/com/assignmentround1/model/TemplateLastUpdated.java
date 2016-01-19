
package com.assignmentround1.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class TemplateLastUpdated {

    @SerializedName("unixTimestamp")
    @Expose
    private Integer unixTimestamp;
    @SerializedName("dateTime")
    @Expose
    private String dateTime;

    /**
     * 
     * @return
     *     The unixTimestamp
     */
    public Integer getUnixTimestamp() {
        return unixTimestamp;
    }

    /**
     * 
     * @param unixTimestamp
     *     The unixTimestamp
     */
    public void setUnixTimestamp(Integer unixTimestamp) {
        this.unixTimestamp = unixTimestamp;
    }

    /**
     * 
     * @return
     *     The dateTime
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * 
     * @param dateTime
     *     The dateTime
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

}
