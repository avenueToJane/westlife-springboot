package com.westlife.demo.mapper;

import java.util.List;

import com.westlife.demo.common.RequestUser;
import com.westlife.demo.model.User;

public interface UserMapper {

	List<User> queryList();

	void save(RequestUser requestUser);

	void batchDelete(Integer[] ids);

	void update(RequestUser requestUser);

}
