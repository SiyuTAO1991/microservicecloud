package com.alextao.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class ConfigBean {// spring中使用applicationContext.xml作为配置文件，在springboot中没有该文件而是直接使用annotation版本的配置即@Configuration
	
	@Bean
	@LoadBalanced //在consumer中使用loadBanlanced算法
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
		//等价于注解中的 applicationContext.xml == ConfigBean(@Configuration)
		//<bean id="RestTemplate" class="com.alextao.springcloud.cfgbeans.getRestTemplate">
	}
	
	
//	@Bean 
//	public IRule myRule() {
//		return new RoundRobinRule();//使用显示声明的算法替换掉默认的轮询算法
//	}
}
