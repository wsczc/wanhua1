package com.qyq.controller;

import com.qyq.dao.TitleDao;
import com.qyq.pojo.Result;
import com.qyq.pojo.Title;
import com.qyq.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.UntypedExampleMatcher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/title")
public class TitleController {
    @Autowired
    private TitleService titleService;

    @RequestMapping("addTitle")
    public String addTitle(Title title) {
        title.setId(6);
        title.setTltleName("嘻嘻嘻");
        title.setTitleValue("哈哈哈");
        titleService.save(title);
        //titleDao.addTitle(title);
        return "ok";
    }

    @RequestMapping("/findAll")
    public Result findAll() {
        List<Title> all = titleService.findAll();
        return new Result(true, 200, "ok", all);
    }

    @RequestMapping("/findAllPage")
    public Result findAllPage(Integer pageIndex, Integer pageSize) {
        pageIndex = 0;
        pageSize = 4;
        Pageable pageable = PageRequest.of(pageIndex, pageSize);
        Page<Title> all = titleService.findAll(pageable);
        for (Title title : all) {
            System.out.println(title);
        }
        return new Result(true, 200, "ok", all);
    }

    @RequestMapping("findByname")
    public List<Title> findByname(String name) {
        name = "嘻嘻嘻";
        List<Title> titles = titleService.selectByName(name);
        return titles;
    }

    @RequestMapping("updateTitle")
    public String updateTitle(Title title) {
        Example<Title> titleExample = Example.of(title, UntypedExampleMatcher.matchingAny());
        Optional<Title> findOne = titleService.findOne(titleExample);
        Title findByName = titleService.findBytitleName(title.getTltleName());
        Title updae = findOne.get();
        if (updae != null) {
            updae.setTltleName("啊这");
            titleService.save(updae);
        }
        return "ok";
    }

    @RequestMapping("deleteTitle")
    public String deleteTitle(Integer id) {
        Optional<Title> byId = titleService.findById(id);
        System.out.println(0);
        return "ok";
    }

}
