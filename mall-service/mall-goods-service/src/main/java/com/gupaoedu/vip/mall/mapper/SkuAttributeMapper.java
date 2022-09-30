package com.gupaoedu.vip.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gupaoedu.mall.goods.model.SkuAttribute;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SkuAttributeMapper extends BaseMapper<SkuAttribute> {

    /******
     *  1.根据分类ID查询属性ID集合
     *  2.根据属性ID查询属性集合
     */
    @Select("select *from sku_attribute where id (select attr_id from catrfory_attr shere category_id=#{id})")
    List<SkuAttribute> queryByCategoryId(Integer id);
}
