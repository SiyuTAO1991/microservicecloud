package com.alextao.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {// spring中使用applicationContext.xml作为配置文件，在springboot中没有该文件而是直接使用annotation版本的配置即@Configuration
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
		//等价于注解中的 applicationContext.xml == ConfigBean(@Configuration)
		//<bean id="RestTemplate" class="com.alextao.springcloud.cfgbeans.getRestTemplate">
	}
}
