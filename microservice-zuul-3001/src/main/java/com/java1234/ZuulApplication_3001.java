package com.java1234;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/** 

* @author 作者: liuyj

* @version 创建时间：2020年4月17日 上午11:20:33 

* 类说明 

*/
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@EnableZuulProxy
public class ZuulApplication_3001 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication_3001.class, args);
    }
}
