package com.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import com.mybatis.entity.Account;

@Mapper
public interface AccountMapperTwo {

	List<Account> findAccountList();

	@Insert("INSERT INTO account(ID, NAME, MONEY) VALUES(#{id}, #{name}, #{money})")
	int addAccount(@Param("id") Integer id, @Param("name") String name, @Param("money") double money);

	@Delete("DELETE FROM account where id = #{id}")
	int deleteAccount(@Param("id") Integer id);

	@Update("UPDATE account SET name = #{name} WHERE id = #{id}")
	int updateAccount(@Param("id") Integer id, @Param("name") String name);

}
