package com.huhst.store.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huhst.common.utils.PageUtils;
import com.huhst.store.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * ÊôÐÔ&ÊôÐÔ·Ö×é¹ØÁª
 *
 * @author panbailiang
 * @email panbailiang@gmail.com
 * @date 2020-11-22 20:46:41
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

