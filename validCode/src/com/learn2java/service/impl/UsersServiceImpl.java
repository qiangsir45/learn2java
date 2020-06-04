package com.learn2java.service.impl;

import com.learn2java.mapper.UsersMapper;
import com.learn2java.pojo.Users;
import com.learn2java.service.UsersService;

public class UsersServiceImpl implements UsersService {
    private UsersMapper usersMapper;

    public UsersMapper getUsersMapper() {
        return usersMapper;
    }

    public void setUsersMapper(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @Override
    public Users login(Users users) {
        return usersMapper.selByUsersPwd(users);
    }
}
