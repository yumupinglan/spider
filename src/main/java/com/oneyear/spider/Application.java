/***********************************************************
 * 
 * @Copyright: 2017 One Year Studio All rights reserved. 
 *
 ***********************************************************/
package com.oneyear.spider;

import java.io.IOException;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName Aplication
 * @Description: TODO
 * @author willie
 * @Date: 2017年6月18日 
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.oneyear.spider")
@MapperScan(basePackages = "com.oneyear.spider.mapper")
public class Application {
	
	private static final String URL = "http://blog.csdn.net/sinyu890807/article/list/2";

	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		Spider spider = context.getBean(Spider.class);
		spider.getArticle(URL);
	}

}
