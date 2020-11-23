package com.huhst.store.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ÊôÐÔ&ÊôÐÔ·Ö×é¹ØÁª
 * 
 * @author panbailiang
 * @email panbailiang@gmail.com
 * @date 2020-11-22 20:46:41
 */
@Data
@TableName("pms_attr_attrgroup_relation")
public class AttrAttrgroupRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ÊôÐÔid
	 */
	private Long attrId;
	/**
	 * ÊôÐÔ·Ö×éid
	 */
	private Long attrGroupId;
	/**
	 * ÊôÐÔ×éÄÚÅÅÐò
	 */
	private Integer attrSort;

}
