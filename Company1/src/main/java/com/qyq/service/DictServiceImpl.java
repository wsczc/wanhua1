package com.qyq.service;

import com.qyq.dao.DictDao;
import com.qyq.pojo.Dict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictServiceImpl {

    @Autowired
    private DictDao dictDao;

    public void  addDictF(Dict dict){
        dictDao.save(dict);
    }


}
