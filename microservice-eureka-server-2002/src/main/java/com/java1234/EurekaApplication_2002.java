package com.java1234;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/** 

* @author 作者: liuyj

* @version 创建时间：2020年4月15日 下午8:08:49 

* 类说明 

*/
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication_2002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication_2002.class, args);
    }
}
