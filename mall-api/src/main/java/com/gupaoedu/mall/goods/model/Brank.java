package com.gupaoedu.mall.goods.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Brank {

    //主键id
    @TableId(type = IdType.AUTO,value = "id")
    private Integer id;
    //品牌名字
    private String name;
    //品牌图片
    private String image;
    //品牌首字母
    private String initial;
    //排序
    private Integer sort;


}
