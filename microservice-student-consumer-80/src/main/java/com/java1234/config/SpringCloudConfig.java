package com.java1234.config;
/** 

* @author 作者: liuyj

* @version 创建时间：2020年4月15日 下午3:20:25 

* SpringCloud相关配置

*/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SpringCloudConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
