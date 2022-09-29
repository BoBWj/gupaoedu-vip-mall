package com.gupaoedu.vip.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gupaoedu.mall.goods.model.Brank;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BrandMapper extends BaseMapper<Brank> {

    /**
     * 1.根据分类ID查询品牌ID集合
     * 2.根据品牌id集合查询品牌分类
     *
     */
    @Select("SELECT brand_id FROM category_brand WHERE category_id=#{id}")
    List<Integer> queryBrandIds(Integer id);
}
