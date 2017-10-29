package com.oneyear.spider.model;

public class ArticleWithBLOBs extends Article {
    private String articlecontent;

    private String articlerewardcontent;

    private String articleaudiourl;

    public String getArticlecontent() {
        return articlecontent;
    }

    public void setArticlecontent(String articlecontent) {
        this.articlecontent = articlecontent == null ? null : articlecontent.trim();
    }

    public String getArticlerewardcontent() {
        return articlerewardcontent;
    }

    public void setArticlerewardcontent(String articlerewardcontent) {
        this.articlerewardcontent = articlerewardcontent == null ? null : articlerewardcontent.trim();
    }

    public String getArticleaudiourl() {
        return articleaudiourl;
    }

    public void setArticleaudiourl(String articleaudiourl) {
        this.articleaudiourl = articleaudiourl == null ? null : articleaudiourl.trim();
    }

	@Override
	public String toString() {
		return "ArticleWithBLOBs [getArticlecontent()=" + getArticlecontent() + ", getArticlerewardcontent()="
				+ getArticlerewardcontent() + ", getArticleaudiourl()=" + getArticleaudiourl() + ", getOid()="
				+ getOid() + ", getArticletitle()=" + getArticletitle() + ", getArticletags()=" + getArticletags()
				+ ", getArticleauthorid()=" + getArticleauthorid() + ", getArticlecommentcount()="
				+ getArticlecommentcount() + ", getArticleviewcount()=" + getArticleviewcount()
				+ ", getArticlerewardpoint()=" + getArticlerewardpoint() + ", getArticlepermalink()="
				+ getArticlepermalink() + ", getArticlecreatetime()=" + getArticlecreatetime()
				+ ", getArticleupdatetime()=" + getArticleupdatetime() + ", getArticlelatestcmttime()="
				+ getArticlelatestcmttime() + ", getArticlelatestcmtername()=" + getArticlelatestcmtername()
				+ ", getArticlerandomdouble()=" + getArticlerandomdouble() + ", getArticlecommentable()="
				+ getArticlecommentable() + ", getSyncwithsymphonyclient()=" + getSyncwithsymphonyclient()
				+ ", getClientarticleid()=" + getClientarticleid() + ", getClientarticlepermalink()="
				+ getClientarticlepermalink() + ", getArticleeditortype()=" + getArticleeditortype()
				+ ", getArticlestatus()=" + getArticlestatus() + ", getArticletype()=" + getArticletype()
				+ ", getArticlegoodcnt()=" + getArticlegoodcnt() + ", getArticlebadcnt()=" + getArticlebadcnt()
				+ ", getArticlecollectcnt()=" + getArticlecollectcnt() + ", getArticlewatchcnt()="
				+ getArticlewatchcnt() + ", getRedditscore()=" + getRedditscore() + ", getArticlecity()="
				+ getArticlecity() + ", getArticleip()=" + getArticleip() + ", getArticleua()=" + getArticleua()
				+ ", getArticlestick()=" + getArticlestick() + ", getArticleanonymous()=" + getArticleanonymous()
				+ ", getArticleperfect()=" + getArticleperfect() + ", getArticleanonymousview()="
				+ getArticleanonymousview() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
    
}