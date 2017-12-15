/**
 * 
 */
package com.westlife.demo.common;

import org.hibernate.validator.constraints.NotEmpty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author  westlife
 * @date 创建时间：2017年12月15日 下午4:33:38 
 * @version 1.0 
 * @parameter
 *
 */
@ApiModel(value = "请求参数", description = "请求参数")
public class RequestDto {
	@NotEmpty(message="数组不能为空!!!")
	private Integer[] ids;
	@ApiModelProperty("数组ID")
	public Integer[] getIds() {
		return ids;
	}

	public void setIds(Integer[] ids) {
		this.ids = ids;
	}

}
