package com.java1234;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/** 

* @author 作者: liuyj

* @version 创建时间：2020年4月15日 下午3:04:20 

* 启动类

*/
@SpringBootApplication
@EnableEurekaClient
public class StudentProviderApplication_1003 {

    public static void main(String[] args) {
        SpringApplication.run(StudentProviderApplication_1003.class, args);
    }
}
