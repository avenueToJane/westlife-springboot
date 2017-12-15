package com.westlife.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.westlife.demo.common.AjaxResult;
import com.westlife.demo.common.RequestUser;
import com.westlife.demo.controller.UserController;
import com.westlife.demo.mapper.UserMapper;
import com.westlife.demo.model.User;

@Service
public class UserService {
	protected static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserMapper userMapper;
	
	public List<User> queryList() {
		List<User> list = userMapper.queryList();
		return list;
	}

	public AjaxResult save(RequestUser requestUser) {
		userMapper.save(requestUser);
		return new AjaxResult();
	}

	public AjaxResult batchDelete(Integer[] ids) {
		userMapper.batchDelete(ids);
		return new AjaxResult();
	}

	public AjaxResult update(RequestUser requestUser) {
		userMapper.update(requestUser);
		return new AjaxResult();
	}

}
