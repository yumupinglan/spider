package com.oneyear.spider.model;

public class Article {
    private String oid;

    private String articletitle;

    private String articletags;

    private String articleauthorid;

    private Integer articlecommentcount;

    private Integer articleviewcount;

    private Integer articlerewardpoint;

    private String articlepermalink;

    private Long articlecreatetime;

    private Long articleupdatetime;

    private Long articlelatestcmttime;

    private String articlelatestcmtername;

    private Double articlerandomdouble;

    private String articlecommentable;

    private String syncwithsymphonyclient;

    private String clientarticleid;

    private String clientarticlepermalink;

    private Integer articleeditortype;

    private Integer articlestatus;

    private Integer articletype;

    private Integer articlegoodcnt;

    private Integer articlebadcnt;

    private Integer articlecollectcnt;

    private Integer articlewatchcnt;

    private Double redditscore;

    private String articlecity;

    private String articleip;

    private String articleua;

    private Long articlestick;

    private Integer articleanonymous;

    private Integer articleperfect;

    private Integer articleanonymousview;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public String getArticletitle() {
        return articletitle;
    }

    public void setArticletitle(String articletitle) {
        this.articletitle = articletitle == null ? null : articletitle.trim();
    }

    public String getArticletags() {
        return articletags;
    }

    public void setArticletags(String articletags) {
        this.articletags = articletags == null ? null : articletags.trim();
    }

    public String getArticleauthorid() {
        return articleauthorid;
    }

    public void setArticleauthorid(String articleauthorid) {
        this.articleauthorid = articleauthorid == null ? null : articleauthorid.trim();
    }

    public Integer getArticlecommentcount() {
        return articlecommentcount;
    }

    public void setArticlecommentcount(Integer articlecommentcount) {
        this.articlecommentcount = articlecommentcount;
    }

    public Integer getArticleviewcount() {
        return articleviewcount;
    }

    public void setArticleviewcount(Integer articleviewcount) {
        this.articleviewcount = articleviewcount;
    }

    public Integer getArticlerewardpoint() {
        return articlerewardpoint;
    }

    public void setArticlerewardpoint(Integer articlerewardpoint) {
        this.articlerewardpoint = articlerewardpoint;
    }

    public String getArticlepermalink() {
        return articlepermalink;
    }

    public void setArticlepermalink(String articlepermalink) {
        this.articlepermalink = articlepermalink == null ? null : articlepermalink.trim();
    }

    public Long getArticlecreatetime() {
        return articlecreatetime;
    }

    public void setArticlecreatetime(Long articlecreatetime) {
        this.articlecreatetime = articlecreatetime;
    }

    public Long getArticleupdatetime() {
        return articleupdatetime;
    }

    public void setArticleupdatetime(Long articleupdatetime) {
        this.articleupdatetime = articleupdatetime;
    }

    public Long getArticlelatestcmttime() {
        return articlelatestcmttime;
    }

    public void setArticlelatestcmttime(Long articlelatestcmttime) {
        this.articlelatestcmttime = articlelatestcmttime;
    }

    public String getArticlelatestcmtername() {
        return articlelatestcmtername;
    }

    public void setArticlelatestcmtername(String articlelatestcmtername) {
        this.articlelatestcmtername = articlelatestcmtername == null ? null : articlelatestcmtername.trim();
    }

    public Double getArticlerandomdouble() {
        return articlerandomdouble;
    }

    public void setArticlerandomdouble(Double articlerandomdouble) {
        this.articlerandomdouble = articlerandomdouble;
    }

    public String getArticlecommentable() {
        return articlecommentable;
    }

    public void setArticlecommentable(String articlecommentable) {
        this.articlecommentable = articlecommentable == null ? null : articlecommentable.trim();
    }

    public String getSyncwithsymphonyclient() {
        return syncwithsymphonyclient;
    }

    public void setSyncwithsymphonyclient(String syncwithsymphonyclient) {
        this.syncwithsymphonyclient = syncwithsymphonyclient == null ? null : syncwithsymphonyclient.trim();
    }

    public String getClientarticleid() {
        return clientarticleid;
    }

    public void setClientarticleid(String clientarticleid) {
        this.clientarticleid = clientarticleid == null ? null : clientarticleid.trim();
    }

    public String getClientarticlepermalink() {
        return clientarticlepermalink;
    }

    public void setClientarticlepermalink(String clientarticlepermalink) {
        this.clientarticlepermalink = clientarticlepermalink == null ? null : clientarticlepermalink.trim();
    }

    public Integer getArticleeditortype() {
        return articleeditortype;
    }

    public void setArticleeditortype(Integer articleeditortype) {
        this.articleeditortype = articleeditortype;
    }

    public Integer getArticlestatus() {
        return articlestatus;
    }

    public void setArticlestatus(Integer articlestatus) {
        this.articlestatus = articlestatus;
    }

    public Integer getArticletype() {
        return articletype;
    }

    public void setArticletype(Integer articletype) {
        this.articletype = articletype;
    }

    public Integer getArticlegoodcnt() {
        return articlegoodcnt;
    }

    public void setArticlegoodcnt(Integer articlegoodcnt) {
        this.articlegoodcnt = articlegoodcnt;
    }

    public Integer getArticlebadcnt() {
        return articlebadcnt;
    }

    public void setArticlebadcnt(Integer articlebadcnt) {
        this.articlebadcnt = articlebadcnt;
    }

    public Integer getArticlecollectcnt() {
        return articlecollectcnt;
    }

    public void setArticlecollectcnt(Integer articlecollectcnt) {
        this.articlecollectcnt = articlecollectcnt;
    }

    public Integer getArticlewatchcnt() {
        return articlewatchcnt;
    }

    public void setArticlewatchcnt(Integer articlewatchcnt) {
        this.articlewatchcnt = articlewatchcnt;
    }

    public Double getRedditscore() {
        return redditscore;
    }

    public void setRedditscore(Double redditscore) {
        this.redditscore = redditscore;
    }

    public String getArticlecity() {
        return articlecity;
    }

    public void setArticlecity(String articlecity) {
        this.articlecity = articlecity == null ? null : articlecity.trim();
    }

    public String getArticleip() {
        return articleip;
    }

    public void setArticleip(String articleip) {
        this.articleip = articleip == null ? null : articleip.trim();
    }

    public String getArticleua() {
        return articleua;
    }

    public void setArticleua(String articleua) {
        this.articleua = articleua == null ? null : articleua.trim();
    }

    public Long getArticlestick() {
        return articlestick;
    }

    public void setArticlestick(Long articlestick) {
        this.articlestick = articlestick;
    }

    public Integer getArticleanonymous() {
        return articleanonymous;
    }

    public void setArticleanonymous(Integer articleanonymous) {
        this.articleanonymous = articleanonymous;
    }

    public Integer getArticleperfect() {
        return articleperfect;
    }

    public void setArticleperfect(Integer articleperfect) {
        this.articleperfect = articleperfect;
    }

    public Integer getArticleanonymousview() {
        return articleanonymousview;
    }

    public void setArticleanonymousview(Integer articleanonymousview) {
        this.articleanonymousview = articleanonymousview;
    }
}