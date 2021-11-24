package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.entity.User;
import com.example.demo.enums.UserSexEnum;

public interface UserMapper {
	@Insert("INSERT INTO users(user_name, user_sex, nick_name) VALUES(#{userName}, #{userSex}, #{nickName})")
	void insert(User user);
	
	@Select("SELECT * FROM users")
	@Results({
		@Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
		@Result(property = "nickName", column = "nick_name"),
		@Result(property = "userName", column = "user_name")
	})
	List<User> getAll();
	
	@Select("SELECT * FROM users WHERE id = #{id}")
	@Results({
		@Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
		@Result(property = "nickName", column = "nick_name"),
		@Result(property = "userName", column = "user_name")
	})
	User getOne(Long id);

//	@Update("UPDATE users SET user_name=#{userName}, nick_name=#{nickName} WHERE id =#{id}")
	@Update("UPDATE users SET user_name=#{userName}, nick_name=#{nickName}, user_sex=#{userSex} WHERE id =#{id}")
	void update(User user);

	@Delete("DELETE FROM users WHERE id =#{id}")
	void delete(Long id);
	
}