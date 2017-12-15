package com.westlife.demo.controller;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
/*import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;*/
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.westlife.demo.common.AjaxResult;
import com.westlife.demo.common.GeneralException;
import com.westlife.demo.common.RequestDto;
import com.westlife.demo.common.RequestUser;
import com.westlife.demo.model.User;
import com.westlife.demo.service.RedisService;
import com.westlife.demo.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

//@Controller
@Api(value = "测试Swagger2",description="简单的API")
@RestController
@EnableScheduling//定时任务的注解
public class UserController
{
	protected static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;
	
	private ConcurrentHashMap<String, Object> pool = new ConcurrentHashMap<>();

	@Autowired
	private RedisTemplate   redisTemplate;//注入redisService类
	 
	@Autowired
    private StringRedisTemplate stringRedisTemplate;
	
	@Autowired
	private RedisService redisService;
	
	@ApiOperation(value = "查询用户", notes = "根据所有用户") 
	@RequestMapping(value="/queryList", method = RequestMethod.POST)
	public List<User> queryList(){
		List<User> list=userService.queryList();
		pool.put("list", list);
		redisService.setObj("listRedis", list);
		pool.put("listMap", list);
		return list;
	}
	@ApiOperation(value = "查询ConcurrentHashMap的list缓存", notes = "缓存obj") 
	@RequestMapping(value="/queryMapList", method = RequestMethod.POST)
	public Object queryMapList(){
		
		return pool.get("listMap");//从缓存map中拿数据;
	}
	
	@ApiOperation(value = "查询Redis的list缓存", notes = "缓存obj") 
	@RequestMapping(value="/queryRedisList", method = RequestMethod.POST)
	public Object queryRedisList(){
		return redisService.getObj("listRedis");//从缓存redis中拿数据;
	}
	
	@ApiOperation(value = "添加用户", notes = "添加单个用户") 
	@RequestMapping(value="/addUser", method = RequestMethod.POST)
	public AjaxResult addUser(@RequestBody(required = true) @Valid RequestUser requestUser,
			BindingResult bindingResult) throws GeneralException{
		if (bindingResult.hasErrors()) {
			List<FieldError> fieldErrors = bindingResult.getFieldErrors();
			throw new GeneralException("5001", fieldErrors.get(0).getDefaultMessage());
		}
		AjaxResult ajaxResult=new AjaxResult();
		userService.save(requestUser);
		return ajaxResult;
	}
	
	
	@ApiOperation(value = "删除用户", notes = "删除多个用户") 
	@RequestMapping(value="/delUser", method = RequestMethod.POST)
	public AjaxResult delUser(@RequestBody(required = true) RequestDto requestDto){
		return userService.batchDelete(requestDto.getIds());
	}
	
	@ApiOperation(value = "更改用户", notes = "更改单个用户") 
	@RequestMapping(value="/updateUser", method = RequestMethod.POST)
	public AjaxResult updateUser(@RequestBody(required = true) @Valid RequestUser requestUser,
			BindingResult bindingResult) throws GeneralException{
		if (bindingResult.hasErrors()) {
			List<FieldError> fieldErrors = bindingResult.getFieldErrors();
			throw new GeneralException("5001", fieldErrors.get(0).getDefaultMessage());
		}
		return userService.update(requestUser);
	}
	
	// 每1分钟执行一次
		@Scheduled(cron = "0 0/1 * * * ? ")
		public void timer() {
			redisService.flushDB();//清空所有redis数据
		}
}
