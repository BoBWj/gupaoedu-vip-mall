package com.gupaoedu.vip.mall.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gupao.edu.vip.com.gupaoedu.mall.util.RespResult;
import com.gupaoedu.mall.goods.model.Brank;
import com.gupaoedu.mall.goods.model.Category;
import com.gupaoedu.vip.mall.service.BrankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/brank")
public class BrankController {

    @Autowired
    private BrankService brankService;

    /*8
    增加方法
     */
    @PostMapping ()
    public RespResult add(@RequestBody Brank brank){

        return RespResult.ok();
    }

    /**
     * 修改方法
     */
    @PutMapping
    public RespResult update(@RequestBody Brank brank){

        brankService.updateById(brank);

        return RespResult.ok();


    }

    /**
     * 删除方法
     */
    @DeleteMapping("/{id}")
    public RespResult delete(@PathVariable(value = "id") String id ){

        brankService.removeById(id);
        return RespResult.ok();
    }

    /****
     * 条件查询
     */

    @PostMapping(value = "/list")
    public RespResult<List<Brank>> listRespResult(@RequestBody(required = false) Brank brank){

        List<Brank> list=brankService.queryList(brank);

        return RespResult.ok(list);

    }

    /****
     * 条件分页查询
     */

    @PostMapping(value = "list/{page}/{size}")
    public RespResult<Page<Brank>> pageInfo(@PathVariable(value = "page")Long currentPage,
                                            @PathVariable(value = "size")Long size,
                                            @RequestBody(required = false) Brank brand){

        Page<Brank> pageInfo=brankService.queryPageList(currentPage, size, brand);

        return RespResult.ok(pageInfo);


    }

    /**
     * 根据分类id查询品牌集合
     */
    @GetMapping("/category/{pid}")
    public RespResult<List<Category>> categoryBrands (@PathVariable(value = "pid") Integer pid){

        List<Brank> branks=brankService.queryBrankByCategoryId(pid);
        return RespResult.ok(branks);

    }
}
