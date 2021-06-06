package com.qyq.dao;

import com.qyq.pojo.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CompanyDao  extends JpaRepositoryImplementation<Company,Integer> {
   Company findByid(Integer id);

}
