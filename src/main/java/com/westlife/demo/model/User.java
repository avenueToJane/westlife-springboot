package com.westlife.demo.model;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "用户信息", description = "用户信息")
public class User implements Serializable{
	private static final long serialVersionUID = 1492973623389075081L;
	@NotEmpty(message="id不能为空!!!")
    private Integer id;
	
	@NotEmpty(message="username不能为空!!!")
    private String username;
	
	@NotEmpty(message="password不能为空!!!")
    private String password;
	
	@NotEmpty(message="email不能为空!!!")
    private String email;

    /**
     * 是否可用(0禁用,1可用)
     */
	@NotEmpty(message="useable不能为空!!!")
    private Integer useable;

    /**
     * 创建时间
     */
	@NotEmpty(message="addtime不能为空!!!")
    private String addtime;

    /**
     * 登陆时间
     */
	@NotEmpty(message="logintime不能为空!!!")
    private String logintime;

    /**
     * 登陆IP
     */
	@NotEmpty(message="loginip不能为空!!!")
    private String loginip;

    /**
     * @return id
     */
	@ApiModelProperty("唯一id")
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return username
     */
    @ApiModelProperty("用户名称")
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    @ApiModelProperty("登陆密码")
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return email
     */
    @ApiModelProperty("邮箱")
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取是否可用(0禁用,1可用)
     *
     * @return useable - 是否可用(0禁用,1可用)
     */
    @ApiModelProperty("状态是否可用(0禁用,1可用)")
    public Integer getUseable() {
        return useable;
    }

    /**
     * 设置是否可用(0禁用,1可用)
     *
     * @param useable 是否可用(0禁用,1可用)
     */
    public void setUseable(Integer useable) {
        this.useable = useable;
    }

    /**
     * 获取创建时间
     *
     * @return addtime - 创建时间
     */
    @ApiModelProperty("创建时间")
    public String getAddtime() {
        return addtime;
    }

    /**
     * 设置创建时间
     *
     * @param addtime 创建时间
     */
    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    /**
     * 获取登陆时间
     *
     * @return logintime - 登陆时间
     */
    @ApiModelProperty("登陆时间")
    public String getLogintime() {
        return logintime;
    }

    /**
     * 设置登陆时间
     *
     * @param logintime 登陆时间
     */
    public void setLogintime(String logintime) {
        this.logintime = logintime;
    }

    /**
     * 获取登陆IP
     *
     * @return loginip - 登陆IP
     */
    @ApiModelProperty("登陆Ip")
    public String getLoginip() {
        return loginip;
    }

    /**
     * 设置登陆IP
     *
     * @param loginip 登陆IP
     */
    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }
}