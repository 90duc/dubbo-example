package com.mk.dubbo.interfaces.service;

import com.mk.dubbo.interfaces.entity.User;

import java.util.List;

public interface IUserService {

    List<User> list(String classId);

    User get(String userId);
}
