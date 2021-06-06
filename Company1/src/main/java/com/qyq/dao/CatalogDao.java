package com.qyq.dao;

import com.qyq.pojo.Catalog;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface CatalogDao extends JpaRepositoryImplementation<Catalog,Integer> {
    Catalog findByName(String name);

    Catalog findByid(Integer id);
}
