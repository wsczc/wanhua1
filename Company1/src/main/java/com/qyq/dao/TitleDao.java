package com.qyq.dao;

import com.qyq.pojo.Title;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;


@Component
public class TitleDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void addTitle(Title title) {
        mongoTemplate.save(title);
    }



}
