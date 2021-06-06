package com.qyq.controller;

import com.qyq.pojo.Dict;
import com.qyq.pojo.Result;
import com.qyq.service.DictServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dict")
public class DictController  {
    @Autowired
    private DictServiceImpl dictServiceImpl;

    //数据字典的增加
    @RequestMapping("addDict")
    @ResponseBody
    public String addDict(Dict dict){
        dict.setPid(18);
        if (dict.getPid()==null){
            dict.setData_type(0);
            dict.setData_value("广西省");
            dict.setData_tag(0);
            dictServiceImpl.addDict(dict);
            return "ok";
        }else{
            dict.setData_type(1);
            dict.setData_value("桂林");
            dict.setData_tag(1);
            dictServiceImpl.addDict(dict);
            return "ok";
        }


    }

    @RequestMapping("updateDict")
    @ResponseBody
    public String updateDict(Dict dict){
        dict.setId(20);
        Dict dict1 = dictServiceImpl.findByid(dict.getId());
        System.out.println(dict1);
        dict1.setData_value("柳州");
        dictServiceImpl.updateDict(dict1);
        System.out.println(dict1);
        return "ok";
    }
    @RequestMapping("deleteDict")
    @ResponseBody
    public String deleteDict(Dict dict){
        dict.setId(20);
        Dict dict1 = dictServiceImpl.findByid(dict.getId());
        if (dict1.getPid()!=null){
            dictServiceImpl.deleteDict(dict1);
            return "ok";
        }else{

            return "子节点尚存";
        }

    }

    @RequestMapping("findAllFDict")
    @ResponseBody
    public String findAllF(Integer pid){

        pid=1;
        List<Dict> all = dictServiceImpl.findAllF(pid);
        System.out.println(all);
        return "ok";
    }

    @RequestMapping("findAllFZDict")
    @ResponseBody
    public String findAllFZ(Integer pid){

        pid=1;
        List<Dict> all = dictServiceImpl.findAllFZ(pid);
        for (Dict dict : all) {
            System.out.println(dict);
        }
        return "ok";
    }

    @RequestMapping("findAllByTagDict")
    @ResponseBody
    public String findAllByTagDict(Integer tagid){

        tagid=1;
        List<Dict> all = dictServiceImpl.findAllByTagDict(tagid);
        for (Dict dict : all) {
            System.out.println(dict);
        }
        return "ok";
    }

    @RequestMapping("deleteDictfaZ")
    @ResponseBody
    public String deleteDictFaZ(Dict dict){
            dict.setId(18);
        Dict dictp = dictServiceImpl.findByid(dict.getId());
        System.out.println(dictp.getId());
        List<Dict> allFZ = dictServiceImpl.findAllFZ(dictp.getId());
        for (Dict dict1 : allFZ) {
            System.out.println(dict1);
            dictServiceImpl.deleteDict(dict1);
        }
        dictServiceImpl.deleteDict(dictp);

        return "ok";
    }


    @RequestMapping("deleteDictBytag")
    @ResponseBody
    public String deleteDictBytag(Integer tagid){
        tagid=3;
        List<Dict> allByTagDict = dictServiceImpl.findAllByTagDict(tagid);
        for (Dict dict : allByTagDict) {
            System.out.println(dict);
            if (dict.getPid()!=null){
                dictServiceImpl.deleteDict(dict);
            }else{

            }
        }
        return "ok";
    }
}
