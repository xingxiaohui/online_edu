package com.xxh.eduservice.controller;


import com.xxh.eduservice.entity.Teacher;
import com.xxh.eduservice.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xxh
 * @since 2021-02-21
 */
@RestController
@RequestMapping("/eduservice/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("getAll")
    public List<Teacher> getall(){
        List<Teacher> list = teacherService.list();
        return list;
    }


}

