package com.gupaoedu.vip.mall.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.gupaoedu.mall.goods.model.Brank;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BrankService extends IService<Brank> {

    /**
     *  多条件查下
     */

    List<Brank> queryList(Brank brand);

    /**
     * 分页查询
     */
    Page<Brank> queryPageList(Long currentPage, Long size, Brank brank);

    /**
     * 根据分类ID查询相对应的品牌jige
     */
    List<Brank> queryBrankByCategoryId(Integer id);
}
