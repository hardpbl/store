package com.huhst.store.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huhst.common.utils.PageUtils;
import com.huhst.store.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * ÉÌÆ·ÆÀ¼Û»Ø¸´¹ØÏµ
 *
 * @author panbailiang
 * @email panbailiang@gmail.com
 * @date 2020-11-22 20:46:41
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

