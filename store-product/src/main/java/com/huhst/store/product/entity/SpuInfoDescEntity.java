package com.huhst.store.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spuÐÅÏ¢½éÉÜ
 * 
 * @author panbailiang
 * @email panbailiang@gmail.com
 * @date 2020-11-22 20:46:41
 */
@Data
@TableName("pms_spu_info_desc")
public class SpuInfoDescEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ÉÌÆ·id
	 */
	@TableId
	private Long spuId;
	/**
	 * ÉÌÆ·½éÉÜ
	 */
	private String decript;

}
