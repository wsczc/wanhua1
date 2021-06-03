package com.qyq.service.impl;

import com.qyq.dao.CompanyDao;
import com.qyq.pojo.Company;
import com.qyq.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyDao companyDao;
    @Override
public List<Company> findAll(){
   return companyDao.findAll();
}

    @Override
    public Page<Company> findAll(Pageable pageable) {
        return companyDao.findAll(pageable);
    }

    @Override
    public void addComPany(Company company) {
        company.setState(0);
        companyDao.save(company);

    }

    @Override
    public void updateCompany(Company company) {
        companyDao.save(company);
    }

    @Override
    public Company findByid(Integer id) {
        return companyDao.findByid(id);
    }

    @Override
    public void deleteCompany(Company company) {
        companyDao.delete(company);
    }


}
