package com.gupaoedu.vip.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gupaoedu.mall.goods.model.Product;
import com.gupaoedu.mall.goods.model.Spu;
import com.gupaoedu.vip.mall.mapper.SpuMapper;
import com.gupaoedu.vip.mall.service.SpuService;
import org.springframework.stereotype.Service;

@Service
public class SpuServiceImpl extends ServiceImpl<SpuMapper, Spu> implements SpuService {


    /***
     *  产品保存
     */
    @Override
    public void saveProduct(Product product) {

    }
}
