package com.qyq.service;

import com.qyq.dao.DictDao;
import com.qyq.pojo.Dict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictServiceImpl {

    @Autowired
    private DictDao dictDao;

    public Dict findByid(Integer id) {return dictDao.findByid(id);}
    public void  addDict(Dict dict){
        dictDao.save(dict);
    }
    public void updateDict(Dict dict){dictDao.save(dict);}
    public void deleteDict(Dict dict){dictDao.delete(dict);}
    public List<Dict> findAllF(Integer pid) {return dictDao.findBypid(pid);}

    public List<Dict> findAllFZ(Integer pid) {
        return dictDao.findBypidz(pid);
    }

    public List<Dict> findAllByTagDict(Integer tagid) {
        return dictDao.findBydatatag(tagid);
    }

    public void deleteBytag(Integer tagid) {
        dictDao.deleteBydatatag(tagid);
    }
}
