package com.java1234.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java1234.entity.Student;
import com.java1234.service.StudentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/** 

* @author 作者: liuyj

* @version 创建时间：2020年4月15日 下午3:03:15 

* 服务提供者-学生信息控制器

*/
@RestController
@RequestMapping("/student")
public class StudentProviderController {

    @Resource
    private StudentService studentService;
     
    /**
     * 添加或者修改学生信息
     * @param student
     * @return
     */
    @PostMapping(value="/save")
    public boolean save(@RequestBody Student student){
        try{
            studentService.save(student);  
            return true;
        }catch(Exception e){
            return false;
        }
    }
     
    /**
     * 查询学生信息
     * @return
     */
    @GetMapping(value="/list")
    public List<Student> list(){
        System.out.println("list---1003");
        return studentService.list();
    }
     
    /**
     * 根据id查询学生信息
     * @return
     */
    @GetMapping(value="/get/{id}")
    public Student get(@PathVariable("id") Integer id){
        return studentService.findById(id);
    }
     
    /**
     * 根据id删除学生信息
     * @return
     */
    @GetMapping(value="/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        try{
            studentService.delete(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    
//    /**
//     * 获取信息
//     * @return
//     * @throws InterruptedException 
//     */
//    @ResponseBody
//    @GetMapping(value="/getInfo")
//    @HystrixCommand(fallbackMethod="getInfoFallback")
//    public Map<String,Object> getInfo() throws InterruptedException{
//        Thread.sleep(4000);
//        Map<String,Object> map=new HashMap<String,Object>();
//        map.put("code", 200);
//        map.put("info", "业务数据xxxxx");
//        return map;
//    }
//     
//    public Map<String,Object> getInfoFallback() throws InterruptedException{
//        Map<String,Object> map=new HashMap<String,Object>();
//        map.put("code", 500);
//        map.put("info", "系统出错，稍后重试");
//        return map;
//    }
//    
//    
    /**
     * 获取信息
     * @return
     * @throws InterruptedException 
     */
    @ResponseBody
    @GetMapping(value="/getInfo")
    public Map<String,Object> getInfo() throws InterruptedException{
        Thread.sleep(1900);
        return studentService.getInfo();
    }
}
