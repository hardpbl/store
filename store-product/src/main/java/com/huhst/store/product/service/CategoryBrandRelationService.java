package com.huhst.store.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huhst.common.utils.PageUtils;
import com.huhst.store.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * Æ·ÅÆ·ÖÀà¹ØÁª
 *
 * @author panbailiang
 * @email panbailiang@gmail.com
 * @date 2020-11-22 20:46:41
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

