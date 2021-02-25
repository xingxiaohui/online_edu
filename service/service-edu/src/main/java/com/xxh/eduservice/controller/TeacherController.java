package com.xxh.eduservice.controller;


import com.xxh.commonutils.result.PageResult;
import com.xxh.eduservice.entity.Teacher;
import com.xxh.eduservice.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public PageResult getall(){
        List<Teacher> list = teacherService.list();
        return PageResult.success().data("list",list);
    }
    @DeleteMapping("delete/{id}")
    public PageResult deleteTeacherById(@PathVariable String id){
        boolean res = teacherService.removeById(id);
        if(res){
           return PageResult.success();
        }
        return PageResult.error();
    }

}

