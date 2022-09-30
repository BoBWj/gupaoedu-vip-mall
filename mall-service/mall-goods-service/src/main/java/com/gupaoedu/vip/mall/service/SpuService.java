package com.gupaoedu.vip.mall.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.gupaoedu.mall.goods.model.Product;
import com.gupaoedu.mall.goods.model.Spu;

public interface SpuService extends IService<Spu> {


    /***
     *  产品保存
     */
    void  saveProduct(Product product);
}
