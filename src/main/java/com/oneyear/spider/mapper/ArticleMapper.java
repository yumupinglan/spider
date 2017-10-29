package com.oneyear.spider.mapper;

import com.oneyear.spider.model.Article;
import com.oneyear.spider.model.ArticleWithBLOBs;

public interface ArticleMapper {
    int deleteByPrimaryKey(String oid);

    int insert(ArticleWithBLOBs record);

    int insertSelective(ArticleWithBLOBs record);

    ArticleWithBLOBs selectByPrimaryKey(String oid);

    int updateByPrimaryKeySelective(ArticleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ArticleWithBLOBs record);

    int updateByPrimaryKey(Article record);
}