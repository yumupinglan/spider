/***********************************************************
 * 
 * @Copyright: 2017 One Year Studio All rights reserved. 
 *
 ***********************************************************/
package com.oneyear.spider.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.oneyear.spider.Application;
import com.oneyear.spider.model.ArticleWithBLOBs;

/**
 * @ClassName ArticleMapperTest
 * @Description: TODO
 * @author wei
 * @Date: 2017年10月28日 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@Transactional
@SpringBootTest(classes = Application.class)
public class ArticleMapperTest {
	@Autowired
	private ArticleMapper am;
	
	@Test
	public void testSelectByPrimaryKey() {
		ArticleWithBLOBs article = am.selectByPrimaryKey("1506428153616");
		System.out.println(article);
	}
}
