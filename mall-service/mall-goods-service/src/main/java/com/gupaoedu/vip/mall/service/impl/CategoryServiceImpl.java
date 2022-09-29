package com.gupaoedu.vip.mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gupaoedu.mall.goods.model.Category;
import com.gupaoedu.vip.mall.mapper.CategpryMapper;
import com.gupaoedu.vip.mall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategpryMapper, Category> implements CategoryService {

    @Autowired
    private CategpryMapper categpryMapper;


    /**
     *  根据父类id查询所有子类
     */
    @Override
    public List<Category> findByParentid(Integer pid) {

        QueryWrapper<Category> queryWrapper=new QueryWrapper<Category>();
        queryWrapper.eq("parent_id",pid);
        return categpryMapper.selectList(queryWrapper);
    }
}
