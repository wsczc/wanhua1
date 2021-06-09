package com.qyq.dao;

import com.qyq.pojo.Title;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TitleDao extends MongoRepository<Title,Integer> {
   /* @Query(value = "select * from titlee where titleName like?")
    List<Title> selectByName(String name);

    Title findByTitleName(String tltleName);
*/
    /*@Autowired
    private MongoTemplate mongoTemplate;

    public void addTitle(Title title) {
        mongoTemplate.save(title);
    }*/



}
