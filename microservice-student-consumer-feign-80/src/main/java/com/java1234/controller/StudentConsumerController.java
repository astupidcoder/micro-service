package com.java1234.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java1234.entity.Student;
import com.java1234.service.StudentClientService;

/** 

* @author 作者: liuyj

* @version 创建时间：2020年4月15日 下午3:23:03 

* 服务消费者--学生信息控制器

*/
@RestController
@RequestMapping("/student")
public class StudentConsumerController {

    @Autowired
    private StudentClientService studentClientService;
    
    @PostMapping(value="/save")
    private boolean save(Student student){
        return studentClientService.save(student);
    }
    
    /**
     * 查询学生信息
     * @return
     */
    @GetMapping(value="/list")
    public List<Student> list(){
        return studentClientService.list();
    }
    /**
     * 根据id查询学生信息
     * @return
     */
    @GetMapping(value="/get/{id}")
    public Student get(@PathVariable("id") Integer id){
        return studentClientService.get(id);
    }
     
    /**
     * 根据id删除学生信息
     * @return
     */
    @GetMapping(value="/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        try{
            studentClientService.delete(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    
    /**
     * 获取信息
     * @return
     *
     */
    @GetMapping(value="/getInfo")
    @ResponseBody
    public Map<String,Object> getInfo() {
       
        return studentClientService.getInfo();
    }
}
