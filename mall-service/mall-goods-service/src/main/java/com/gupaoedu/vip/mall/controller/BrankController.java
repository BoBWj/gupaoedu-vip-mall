package com.gupaoedu.vip.mall.controller;


import com.gupao.edu.vip.com.gupaoedu.mall.util.RespResult;
import com.gupaoedu.mall.goods.model.Brank;
import com.gupaoedu.vip.mall.service.BrankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
