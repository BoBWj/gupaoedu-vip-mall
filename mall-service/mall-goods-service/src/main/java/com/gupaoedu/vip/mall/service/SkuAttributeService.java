package com.gupaoedu.vip.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gupaoedu.mall.goods.model.SkuAttribute;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SkuAttributeService extends IService<SkuAttribute> {

    /**
     * 根据分类ID查询属性集合
     */
    List<SkuAttribute> queryList(Integer id);
}
