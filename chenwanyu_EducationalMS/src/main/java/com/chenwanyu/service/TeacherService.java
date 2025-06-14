package com.chenwanyu.service;

import com.chenwanyu.po.TeacherCustom;

import java.util.List;

/**
 * Teacher老师Service层
 */
public interface TeacherService {

    //根据id更新老师信息
    void updateById(Integer id, TeacherCustom teacherCustom) throws Exception;

    //根据id删除老师信息
    void removeById(Integer id) throws Exception;

    //获取分页查询老师信息
    List<TeacherCustom> findByPaging(Integer page, Integer pageSize) throws Exception;

    //保存老师信息
    Boolean save(TeacherCustom teacherCustom) throws Exception;

    //获取老师总数
    int getCountTeacher() throws Exception;

    //根据id查询
    TeacherCustom findById(Integer id) throws Exception;

    //根据名字查询
    List<TeacherCustom> findByName(String name, Integer page, Integer pageSize) throws Exception;

    //获取全部教师
    List<TeacherCustom> findAll() throws Exception;
}
