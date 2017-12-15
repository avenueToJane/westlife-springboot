package com.westlife.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

import com.westlife.demo.controller.UserController;

/**
 * 
 * @author  westlife
 * @date 创建时间：2017年12月15日 下午4:32:07 
 * @version 1.0 
 * @parameter
 * springboot启动器
 */
// 开启缓存
@EnableCaching
@SpringBootApplication
public class Application extends SpringBootServletInitializer {
	protected static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	public static void main(String[] args) {
		logger.info("SpringBoot开始加载");
		SpringApplication.run(Application.class, args);
		logger.info("SpringBoot加载完毕");
	}
}
