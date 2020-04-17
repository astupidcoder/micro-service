package com.java1234.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.java1234.entity.Student;

/** 

* @author 作者: liuyj

* @version 创建时间：2020年4月15日 下午3:00:27 

* /**
 * 学生Repository接口
 * @author Administrator
 *
 */

public interface StudentRepository extends JpaRepository<Student, Integer>,JpaSpecificationExecutor<Student>{

}
