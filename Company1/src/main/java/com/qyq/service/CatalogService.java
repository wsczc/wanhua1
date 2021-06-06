package com.qyq.service;

import com.qyq.dao.CatalogDao;
import com.qyq.pojo.Catalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogService {
    @Autowired
    private CatalogDao catalogDao;



    public Catalog findByNameCatalog(String name) {
       return catalogDao.findByName(name);
    }

    public void save(Catalog catalog) {
        catalogDao.save(catalog);
    }

    public Catalog findByid(Integer id) {
        return catalogDao.findByid(id);
    }

    public void delete(Catalog course1) {
        catalogDao.delete(course1);
    }
}
