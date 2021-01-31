package com.mk.dubbo.interfaces.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private String userId;
    private String classId;
}
