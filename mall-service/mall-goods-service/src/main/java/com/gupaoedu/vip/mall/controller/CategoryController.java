package com.gupaoedu.vip.mall.controller;


import com.gupao.edu.vip.com.gupaoedu.mall.util.RespResult;
import com.gupaoedu.mall.goods.model.Category;
import com.gupaoedu.vip.mall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 根据分类父ID查询子分类
     */
    public RespResult<List<Category>> findByParentId(@PathVariable("id")Integer id){

        return RespResult.ok(categoryService.findByParentid(id));
    }
}
