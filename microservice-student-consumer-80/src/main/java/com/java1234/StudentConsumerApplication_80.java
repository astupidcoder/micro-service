package com.java1234;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/** 

* @author 作者: liuyj

* @version 创建时间：2020年4月15日 下午3:53:40 

* 类说明 

*/
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class StudentConsumerApplication_80 {

    public static void main(String[] args) {
        SpringApplication.run(StudentConsumerApplication_80.class, args);
    }
}
