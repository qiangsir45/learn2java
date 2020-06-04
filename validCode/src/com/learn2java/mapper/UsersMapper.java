package com.learn2java.mapper;

import com.learn2java.pojo.Users;
import org.apache.ibatis.annotations.Select;

public interface UsersMapper {
    @Select("select * from users where username=#{username} and password=#{password}")
    Users selByUsersPwd(Users users);
}
