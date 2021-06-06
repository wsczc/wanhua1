package com.qyq.controller;

import com.qyq.dao.TitleDao;
import com.qyq.pojo.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/title")
public class TitleController {
    @Autowired
    private TitleDao titleDao;
    @RequestMapping("addTitle")
    public String addTitle(Title title) {
        title.setId(1);
        title.setTltleName("正经");
        title.setTitleValue("UC正经不");
        
     titleDao.addTitle(title);
        return "ok";
    }
}
