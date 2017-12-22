package com.mybatis.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.stat.TableStat.Name;
import com.mybatis.dao.AccountMapperTwo;
import com.mybatis.entity.Account;

@Service
public class AccountServiceTwo {

	@Autowired
	public AccountMapperTwo accountMapperTwo;

	public List<Account> getAccountList() {
		return accountMapperTwo.findAccountList();
	}

	public int addAccount(Integer id, String name, double money) {
		return accountMapperTwo.addAccount(id, name, money);
	}

	public int deleteAccount(Integer id) {
		return accountMapperTwo.deleteAccount(id);
	}

	public int updateAccount(Integer id, String name) {
		return accountMapperTwo.updateAccount(id, name);
	}
}
