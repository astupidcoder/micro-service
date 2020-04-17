package com.java1234;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/** 

* @author 作者: liuyj

* @version 创建时间：2020年4月16日 下午5:04:26 

* 类说明 

*/

    @SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
    @EnableHystrixDashboard
    public class StudentConsumerDashBoardApplication_90 {
     
        public static void main(String[] args) {
            SpringApplication.run(StudentConsumerDashBoardApplication_90.class, args);
        }
    }

