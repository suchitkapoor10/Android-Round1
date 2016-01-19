
package com.assignmentround1.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Terms {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("filePath")
    @Expose
    private String filePath;
    @SerializedName("namespace")
    @Expose
    private String namespace;
    @SerializedName("cache")
    @Expose
    private Boolean cache;
    @SerializedName("params")
    @Expose
    private List<Object> params = new ArrayList<Object>();
    @SerializedName("pageTitle")
    @Expose
    private String pageTitle;
    @SerializedName("templateLastUpdated")
    @Expose
    private TemplateLastUpdated templateLastUpdated;

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The filePath
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * 
     * @param filePath
     *     The filePath
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * 
     * @return
     *     The namespace
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * 
     * @param namespace
     *     The namespace
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * 
     * @return
     *     The cache
     */
    public Boolean getCache() {
        return cache;
    }

    /**
     * 
     * @param cache
     *     The cache
     */
    public void setCache(Boolean cache) {
        this.cache = cache;
    }

    /**
     * 
     * @return
     *     The params
     */
    public List<Object> getParams() {
        return params;
    }

    /**
     * 
     * @param params
     *     The params
     */
    public void setParams(List<Object> params) {
        this.params = params;
    }

    /**
     * 
     * @return
     *     The pageTitle
     */
    public String getPageTitle() {
        return pageTitle;
    }

    /**
     * 
     * @param pageTitle
     *     The pageTitle
     */
    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    /**
     * 
     * @return
     *     The templateLastUpdated
     */
    public TemplateLastUpdated getTemplateLastUpdated() {
        return templateLastUpdated;
    }

    /**
     * 
     * @param templateLastUpdated
     *     The templateLastUpdated
     */
    public void setTemplateLastUpdated(TemplateLastUpdated templateLastUpdated) {
        this.templateLastUpdated = templateLastUpdated;
    }

}
