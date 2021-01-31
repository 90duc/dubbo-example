package com.mk.dubbo.consumer.controller;

import com.mk.dubbo.interfaces.entity.ClassInfo;
import com.mk.dubbo.interfaces.entity.User;
import com.mk.dubbo.interfaces.service.IClassService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/class")
public class ClassController {

    @Reference(check = false)
    private IClassService classService;


    @GetMapping("/listClassmate")
    public List<User> listClassmate(@RequestParam String classId){

        return classService.listAll(classId);
    }

    @GetMapping("/getClass")
    public ClassInfo getClass(@RequestParam String classId){

        return classService.get(classId);
    }

}
