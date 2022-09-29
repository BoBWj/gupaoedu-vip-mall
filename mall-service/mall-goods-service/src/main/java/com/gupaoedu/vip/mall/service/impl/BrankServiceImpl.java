package com.gupaoedu.vip.mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gupaoedu.mall.goods.model.Brank;
import com.gupaoedu.vip.mall.mapper.BrandMapper;
import com.gupaoedu.vip.mall.service.BrankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;


@Service
public class BrankServiceImpl extends ServiceImpl<BrandMapper, Brank> implements BrankService {

    @Autowired
    private  BrandMapper brandMapper;

    /****
     * 多条件查询S
     * @param brand
     * @return
     */
    @Override
    public List<Brank> queryList(Brank brand) {

        QueryWrapper<Brank> queryWrapper =new QueryWrapper<Brank>();
        if (!StringUtils.isEmpty(brand.getName())){
            queryWrapper.like("name",brand.getName());
        }

        if (!StringUtils.isEmpty(brand.getInitial())){
            queryWrapper.like("initial",brand.getInitial());
        }
        return brandMapper.selectList(queryWrapper);
    }

    /***
     * 分页查询
     * @param brank
     * @return
     */

    @Override
    public Page<Brank> queryPageList(Long currentPage, Long size, Brank brank) {

        Page<Brank> page = brandMapper.selectPage(
                new Page<Brank>(currentPage, size),
                new QueryWrapper<Brank>()
                        .like("name", brank.getName()));
        return page;
    }

    /**
     * 根据分类ID查询品牌集合
     * @param id(分类id)
     * @return
     */
    @Override
    public List<Brank> queryBrankByCategoryId(Integer id) {
        //根据分类ID查询品牌ID集合
        List<Integer> brandIds=brandMapper.queryBrandIds(id);
        //根据品牌ID查询品牌集合
        if (brandIds !=null &&brandIds.size()>0){
            return brandMapper.selectList(new QueryWrapper<Brank>().in("id",brandIds));
        }
        //
        return null;
    }
}
