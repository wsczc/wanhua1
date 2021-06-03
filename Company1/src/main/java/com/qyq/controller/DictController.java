package com.qyq.controller;

import com.qyq.pojo.Dict;
import com.qyq.pojo.Result;
import com.qyq.service.DictServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/dict")
public class DictController  {
    @Autowired
    private DictServiceImpl dictServiceImpl;

    //数据字典的增加
    @RequestMapping("addDictF")
    public String addDictF(Dict dict){
        if (dict.getPid()==null){
            dict.setData_type(0);
            dict.setData_value("广西省");
            dict.set
        }else{

        }


        dictServiceImpl.addDictF(dict);

        return "";
    }


}
