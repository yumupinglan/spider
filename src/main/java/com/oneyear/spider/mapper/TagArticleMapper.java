package com.oneyear.spider.mapper;

import com.oneyear.spider.model.TagArticle;

public interface TagArticleMapper {
    int deleteByPrimaryKey(String oid);

    int insert(TagArticle record);

    int insertSelective(TagArticle record);

    TagArticle selectByPrimaryKey(String oid);

    int updateByPrimaryKeySelective(TagArticle record);

    int updateByPrimaryKey(TagArticle record);
}