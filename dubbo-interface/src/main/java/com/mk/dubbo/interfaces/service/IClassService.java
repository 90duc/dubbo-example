package com.mk.dubbo.interfaces.service;

import com.mk.dubbo.interfaces.entity.ClassInfo;
import com.mk.dubbo.interfaces.entity.User;

import java.util.List;

public interface IClassService {


    List<User> listAll(String classId);

    ClassInfo get(String classId);
}
