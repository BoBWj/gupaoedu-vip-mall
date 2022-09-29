package com.gupaoedu.vip.mall.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.gupaoedu.mall.goods.model.Category;

import java.util.List;

public interface CategoryService extends IService<Category> {

    /**
     *  根据父类id查询所有子类
     */

    List<Category> findByParentid(Integer pid);

}
