/***********************************************************
 * 
 * @Copyright: 2017 One Year Studio All rights reserved. 
 *
 ***********************************************************/
package com.oneyear.spider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.oneyear.spider.mapper.ArticleMapper;
import com.oneyear.spider.mapper.TagArticleMapper;
import com.oneyear.spider.model.ArticleWithBLOBs;
import com.oneyear.spider.model.TagArticle;
import com.oneyear.spider.model.utils.Ids;
import com.oneyear.spider.parser.CSDNParser;

/**
 * @ClassName Spider
 * @Description: TODO
 * @author wei
 * @Date: 2017年10月16日 
 */
@Component
public class Spider {
	
	private static Logger logger = Logger.getLogger(Spider.class);

	@Autowired
	private ArticleMapper am;
	
	@Autowired
	private TagArticleMapper tam;
	/**
	 * 
	* @Title: getDocument  
	* @Description: get HTML Document bu url
	* @param @param url
	* @param @return
	* @return Document
	* @throws
	 */
	public Document getDocument(String url) {
		 Document doc = null;
		 Connection conn = Jsoup.connect(url)    //博客首页的url地址
	                .userAgent("Mozilla/5.0 (Windows NT 6.1; rv:47.0) Gecko/20100101 Firefox/47.0") //http请求的浏览器设置
	                .timeout(5000)   //http连接时长
	                .method(Connection.Method.GET);  //请求类型是get请求，http请求还是post,delete等方式
	        
	        try {
	        	//获取页面的html文档
	        	doc = conn.get();
			} catch (IOException e) {
				e.printStackTrace();
			}
	        return doc;
	}
	
	/**  
	* @Title: getArticle  
	* @Description: TODO
	* @param @throws IOException
	* @return void
	* @throws  
	*/
	public void getArticle(String URL) throws IOException {
		//获取url地址的http链接Connection
        Connection conn = Jsoup.connect(URL)    //博客首页的url地址
                .userAgent("Mozilla/5.0 (Windows NT 6.1; rv:47.0) Gecko/20100101 Firefox/47.0") //http请求的浏览器设置
                .timeout(5000)   //http连接时长
                .method(Connection.Method.GET);  //请求类型是get请求，http请求还是post,delete等方式
        //获取页面的html文档
        Document doc = conn.get();
        Element body = doc.body();

        //将爬取出来的文章封装到Artcle中，并放到ArrayList里面去
        List<Article> resultList = new ArrayList<Article>();

        Element articleListDiv = body.getElementById("article_list");
        Elements articleList = articleListDiv.getElementsByClass("list_item");
        for(Element article : articleList){
            Article articleEntity = new Article();
            Element linkNode = (article.select("div h1 a")).get(0);         
            Element desptionNode = (article.getElementsByClass("article_description")).get(0);
            Element articleManageNode = (article.getElementsByClass("article_manage")).get(0);

            articleEntity.setAddress(linkNode.attr("href"));
            articleEntity.setTitle(linkNode.text());
            articleEntity.setDesption(desptionNode.text());
            articleEntity.setTime(articleManageNode.select("span:eq(0").text());

            resultList.add(articleEntity);
        }

        //遍历输出ArrayList里面的爬取到的文章
        for(int i = 2; i < resultList.size(); i++) {
        	Article article = resultList.get(i);
        	String url = "http://blog.csdn.net"+ article.getAddress();
        	logger.info(""+article.getTitle()+", 文章绝对路劲地址:http://blog.csdn.net" + article.getAddress());
            Document aDoc = getDocument(url);
            CSDNParser parser = new CSDNParser();
            String content = parser.parse(aDoc);
            logger.info("*****************article content start************************");
            logger.info(content);
            ArticleWithBLOBs newArticle = new ArticleWithBLOBs();
            String oldId = Ids.genTimeMillisId();
            newArticle.setOid(oldId);
            newArticle.setArticletitle(article.getTitle());
            newArticle.setArticletags("java");
            newArticle.setArticleauthorid("1506253856288");
            newArticle.setArticlecontent(content);
            newArticle.setArticlepermalink("/article/"+oldId);
            newArticle.setArticlecreatetime(System.currentTimeMillis());
            newArticle.setArticleupdatetime(System.currentTimeMillis());
            newArticle.setArticlerandomdouble( Math.random());
            newArticle.setArticlecommentcount(0);
            newArticle.setArticleviewcount(0);
            newArticle.setArticlerewardpoint(0);
            newArticle.setArticlelatestcmttime(System.currentTimeMillis());
            newArticle.setArticlelatestcmtername("");
            newArticle.setSyncwithsymphonyclient("");
            newArticle.setArticleeditortype(0);
            newArticle.setArticlestatus(0);
            newArticle.setArticleeditortype(0);
            newArticle.setArticlegoodcnt(0);
            newArticle.setArticlebadcnt(0);
            newArticle.setArticlecollectcnt(0);
            newArticle.setArticlewatchcnt(0);
            newArticle.setRedditscore(0.0);
            newArticle.setArticlestick(0L);
            newArticle.setArticleanonymous(0);
            newArticle.setArticleperfect(0);
            newArticle.setArticleanonymousview(0);
            newArticle.setArticlecommentable("1");
            newArticle.setClientarticleid(oldId);
            newArticle.setArticleip("116.227.134.216");
            newArticle.setArticleua("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36");
            newArticle.setArticletype(0);
            newArticle.setArticlecity("");
            newArticle.setArticlerewardcontent("");
            newArticle.setArticleaudiourl("");
            newArticle.setClientarticlepermalink("");
            
            TagArticle ta = new TagArticle();
            ta.setOid(Ids.genTimeMillisId());
            ta.setArticleOid(oldId);
            ta.setTagOid("1506426490907");
            ta.setArticlecommentcount(0);
            ta.setArticlelatestcmttime(System.currentTimeMillis());
            ta.setArticleperfect(0);
            ta.setRedditscore(0.0);
//            am.insert(newArticle);
//            tam.insert(ta);
        }
	}
	
}
