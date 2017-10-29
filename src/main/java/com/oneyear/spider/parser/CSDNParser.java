/***********************************************************
 * 
 * @Copyright: 2017 One Year Studio All rights reserved. 
 *
 ***********************************************************/
package com.oneyear.spider.parser;

import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

/**
 * @ClassName CSDNParser
 * @Description: parse CSDN article to I am coder
 * @author wei
 * @Date: 2017年10月16日 
 */
public class CSDNParser {

	public String parse(Document doc) {
		
		StringBuffer sb = new StringBuffer();
		
		Element body = doc.body();
		Element articleBody = body.getElementById("article_content");
		//Element contents = articleBody.getElementsByClass("markdown_views").first();
		return parseElement(articleBody);
	}
	
	private String parseElement(Element element) {
		
		StringBuffer sb = new StringBuffer();
		
		switch(element.tag().getName()) {
		case "p":
			sb.append(parsePElement(element));
			sb.append("\n");
			break;
		case "a":
			sb.append(parseAElement(element));
			break;
		default:
			List<Node> nodes = element.childNodes();
			for(Node node : nodes) {
				if(node instanceof TextNode) {
					TextNode text = (TextNode) node;
					sb.append(text.getWholeText());
				}
				if(node instanceof Element) {
					sb.append(parseElement((Element) node));
				}
			}
		}				
		return sb.toString();
	}
	
	private String parsePElement(Element element) {
		StringBuffer sb = new StringBuffer();
		List<Node> nodes = element.childNodes();
		for(Node node : nodes) {
			if(node instanceof TextNode) {
				TextNode text = (TextNode) node;
				sb.append(text.getWholeText());
			}
			if(node instanceof Element) {
				sb.append(parseElement((Element) node));
			}
		}
		return sb.toString();
	}
	
	private String parseAElement(Element element) {
		StringBuffer sb = new StringBuffer();
		List<Node> nodes = element.childNodes();
		for(Node node : nodes) {
			if(node instanceof TextNode) {
				TextNode text = (TextNode) node;
				sb.append("[");
				sb.append(text.getWholeText());
				sb.append("]");
				sb.append("(");
				sb.append(element.attr("href"));
				sb.append(")");
			}
			if(node instanceof Element) {
				sb.append(parseElement((Element) node));
			}
		}
		return sb.toString();
	}
}
