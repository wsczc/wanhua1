package com.qyq.controller;

import com.qyq.pojo.Catalog;
import com.qyq.pojo.Result;
import com.qyq.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("catalog")
public class CatalogController {
    @Autowired
    private CatalogService catalogService;

    @RequestMapping("setStatus")
    public Result setStatus(Catalog catalog) {
        Integer status = catalog.getStatus();
        if (status==0){
            catalog.setStatus(1);
            catalogService.save(catalog);
            return new Result(true,200,"OK");
        }else{
            catalog.setStatus(0);
            catalogService.save(catalog);
            return new Result(true,200,"OK");
        }
    }

    @RequestMapping("findByNameCatalog")
    public Result findByNameCatalog(String name) {
        name="spring";
        Catalog byNameCatalog = catalogService.findByNameCatalog(name);


        return new Result(true,200,"OK",byNameCatalog);
    }


    @RequestMapping("addCatalog")
    public Result addCourse( Catalog catalog) {
        catalog.setName("spring");
        catalogService.save(catalog);

        return new Result(true,200,"OK");
    }

    @RequestMapping("updateCatalog")
    public String updateCourse(Integer id,Catalog catalog) {
        id =22;
        Catalog catalog1 = catalogService.findByid(id);
        catalog1.setName("spring");
        catalogService.save(catalog1);
        return "ok";
    }

    @RequestMapping("deleteCatalog")
    public String updateCourse(Catalog catalog) {
        catalog.setId(22);
        Catalog course1 = catalogService.findByid(catalog.getId());
        catalogService.delete(course1);

        return "ok";
    }
}
