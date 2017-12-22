package com.mybatis.controller;

import java.util.List;

import org.slf4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mybatis.SpringMybatisApplication;
import com.mybatis.entity.Account;
import com.mybatis.service.AccountServiceTwo;

@RestController
@RequestMapping("/accountMybatisTwo")
@MapperScan("com.mybatis.dao")
public class AccountControllerTwo {

	@Autowired
	AccountServiceTwo accountServiceTwo;

	private static final Logger logger = LoggerFactory.getLogger(SpringMybatisApplication.class.getName());

	// 查询所有
	@RequestMapping(value = "/accounts", method = RequestMethod.GET)
	public List<Account> getAccounts() {

		logger.debug("This is a debug message");
		logger.info("This is an info message");
		logger.warn("This is a warn message");
		logger.error("This is an error message");

		return accountServiceTwo.getAccountList();
	}

	// 增加
	@RequestMapping(value = "/account", method = RequestMethod.POST)
	public int addAccount(@RequestParam(value = "id", required = true) Integer id,
			@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "money", required = true) double money) {
		logger.info("增加");
		return accountServiceTwo.addAccount(id, name, money);
	}

	// 删除 
	@RequestMapping(value = "/account", method = RequestMethod.DELETE)
	public int deleteAccount(@RequestParam(value = "id", required = true) Integer id) {
		logger.info("删除");
		return accountServiceTwo.deleteAccount(id);
	}

	// 更新
	@RequestMapping(value = "/account", method = RequestMethod.PATCH)
	public int updateAccount(@RequestParam(value = "id", required = true) Integer id,
			@RequestParam(value = "name", required = true) String name) {
		logger.info("更新");
		return accountServiceTwo.updateAccount(id, name);
	}

}
