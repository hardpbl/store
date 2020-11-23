package com.huhst.store.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huhst.common.utils.PageUtils;
import com.huhst.store.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spuÍ¼Æ¬
 *
 * @author panbailiang
 * @email panbailiang@gmail.com
 * @date 2020-11-22 20:46:41
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

