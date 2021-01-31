package com.mk.dubbo.provider.service;

import com.mk.dubbo.interfaces.entity.ClassInfo;
import com.mk.dubbo.interfaces.entity.User;
import com.mk.dubbo.interfaces.service.IClassService;
import com.mk.dubbo.interfaces.service.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@org.apache.dubbo.config.annotation.Service
@Service
public class ClassService implements IClassService {

    @Reference(check = false)
    private IUserService userService;

    @Override
    public List<User> listAll(String classId){

        return userService.list(classId);
    }

    @Override
    public ClassInfo get(String classId) {
        ClassInfo classInfo = new ClassInfo();
        classInfo.setClassId(classId);
        classInfo.setClassName(this.getClass().getSimpleName());
        return classInfo;
    }
}
