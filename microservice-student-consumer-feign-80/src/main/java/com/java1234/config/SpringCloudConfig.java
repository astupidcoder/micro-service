package com.java1234.config;
/** 

* @author 作者: liuyj

* @version 创建时间：2020年4月15日 下午3:20:25 

* SpringCloud相关配置

*/

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class SpringCloudConfig {

    @Bean
    @LoadBalanced  // 引入ribbon负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    
    /**
     * 自定义轮询算法
     * @return
     */
    public IRule myRule() {
        return new RandomRule();
    }
}
