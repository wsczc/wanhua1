package com.qyq.controller;

import com.qyq.dao.CompanyDao;
import com.qyq.pojo.Company;
import com.qyq.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("company")
public class CompanyController {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private CompanyService companyService;

    @RequestMapping("/findAll")
    public String findAll() {
        List<Company> companyList = companyService.findAll();
        for (Company company : companyList) {
            System.out.println(company);
        }
        return "成了";
    }

    @RequestMapping("/findAll2")
    public String findAll2(Integer pageIndex, Integer pageSize) {
        pageIndex = 0;
        pageSize = 5;
        Pageable pageable = PageRequest.of(pageIndex, pageSize);
        Page<Company> companyList = companyService.findAll(pageable);
        // companyList.getTotalElements();//总行数
        //companyList.getTotalPages();//总页数
        for (Company company : companyList) {
            System.out.println(company);
        }
        return "成了";
    }

    @RequestMapping("/addCompany")
    public String addCompany(Model model, Company company, HttpServletRequest request, HttpServletResponse response) {
        company.setCreate_date(new Date());
        company.setCity_id(13);
        company.setFull_name("广西金嗓子喉片制药2");
        company.setShort_name("金嗓子");
        company.setIs_famous(1);
        company.setCity_id(13);
        //company.setIndustry_id(8);
        companyService.addComPany(company);
//
        return "ok";
    }

    @RequestMapping("uadateCompany")
    public String updateCompany(Model model, Integer id, HttpServletRequest request, HttpServletResponse response) {
        id=2;
        Company company1 = companyService.findByid(id);
        System.out.println(company1);
        //  company.setId(2);
        company1.setFull_name("广西嗓snag子金喉片");
        companyService.updateCompany(company1);

        return "";
    }
//
    @RequestMapping("uadateCompanyState")
    public String updateCompanyState(Model model,Integer id, HttpServletRequest request, HttpServletResponse response) {
        id=2;
        Company company1 = companyService.findByid(id);
        System.out.println(company1);
        //  company.setId(2);、、、、
        Integer state1 = company1.getState();
        if (state1==0){
            company1.setState(1);
        }else {
            company1.setState(0);
        }

        company1.setFull_name("广西嗓snag子金喉片");
        companyService.updateCompany(company1);

        return "";
    }

    @RequestMapping("deleteCompany")
    public String deleteCompany(Company company,Integer id, HttpServletRequest request, HttpServletResponse response){
        id=4;
        Company company1 = companyService.findByid(id);
        companyService.deleteCompany(company1);

        return "";
    }
}
