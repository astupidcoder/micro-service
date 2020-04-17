package com.java1234.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java1234.entity.Student;
import com.java1234.repository.StudentRepository;
import com.java1234.service.StudentService;

/** 

* @author 作者: liuyj

* @version 创建时间：2020年4月15日 下午3:02:23 

* 学生信息Service实现类

*/
@Service("studentService")
public class StudentServiceImpl implements StudentService{

    @Resource
    private StudentRepository studentRepository;
     
    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }
 
    @Override
    public Student findById(Integer id) {
        return studentRepository.findOne(id);
    }
 
    @Override
    public List<Student> list() {
        return studentRepository.findAll();
    }
 
    @Override
    public void delete(Integer id) {
        studentRepository.delete(id);
    }
    
    @Override
    public Map<String, Object> getInfo() {
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("code", 200);
        map.put("info", "业务数据xxxxx");
        return map;
    }
}
