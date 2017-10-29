package com.oneyear.spider.model;

public class TagArticle {
    private String oid;

    private String articleOid;

    private String tagOid;

    private Integer articlecommentcount;

    private Long articlelatestcmttime;

    private Double redditscore;

    private Integer articleperfect;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public String getArticleOid() {
        return articleOid;
    }

    public void setArticleOid(String articleOid) {
        this.articleOid = articleOid == null ? null : articleOid.trim();
    }

    public String getTagOid() {
        return tagOid;
    }

    public void setTagOid(String tagOid) {
        this.tagOid = tagOid == null ? null : tagOid.trim();
    }

    public Integer getArticlecommentcount() {
        return articlecommentcount;
    }

    public void setArticlecommentcount(Integer articlecommentcount) {
        this.articlecommentcount = articlecommentcount;
    }

    public Long getArticlelatestcmttime() {
        return articlelatestcmttime;
    }

    public void setArticlelatestcmttime(Long articlelatestcmttime) {
        this.articlelatestcmttime = articlelatestcmttime;
    }

    public Double getRedditscore() {
        return redditscore;
    }

    public void setRedditscore(Double redditscore) {
        this.redditscore = redditscore;
    }

    public Integer getArticleperfect() {
        return articleperfect;
    }

    public void setArticleperfect(Integer articleperfect) {
        this.articleperfect = articleperfect;
    }
}