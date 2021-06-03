package com.qyq.service;

import com.qyq.pojo.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CompanyService {
     List<Company> findAll();
     Page<Company> findAll(Pageable pageable);
     void addComPany(Company company);
     void updateCompany(Company company);
     Company findByid(Integer id);
     void deleteCompany(Company company);
}
