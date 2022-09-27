package com.gupaoedu.vip.mall.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gupaoedu.mall.goods.model.Brank;
import com.gupaoedu.vip.mall.mapper.BrandMapper;
import com.gupaoedu.vip.mall.service.BrankService;
import org.springframework.stereotype.Service;


@Service
public class BrankServiceImpl extends ServiceImpl<BrandMapper, Brank> implements BrankService {
}
