package com.gupaoedu.vip.mall.controller;


import com.gupao.edu.vip.com.gupaoedu.mall.util.RespResult;
import com.gupaoedu.mall.goods.model.SkuAttribute;
import com.gupaoedu.vip.mall.service.SkuAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/SkuAttribute")
public class SkuAttributeController {

    @Autowired
    private SkuAttributeService attributeService;

    /***
     * 根据分类ID查询属性集合
     */
    @GetMapping("/category/{id}")
    public RespResult<List<SkuAttribute>> categorySkuAttributeList(@PathVariable(value = "id")Integer id){

        List<SkuAttribute> skuAttributes=attributeService.queryList(id);

        return RespResult.ok(skuAttributes);
    }
}
