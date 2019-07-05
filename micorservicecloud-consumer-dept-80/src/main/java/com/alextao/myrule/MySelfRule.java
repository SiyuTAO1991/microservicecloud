package com.alextao.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class MySelfRule {

	@Bean 
	public IRule myRule() {
		//return new RandomRule();//使用随机算法替换掉默认的轮询算法
		return new RandomRule_ZY();//我自定义为每个机器被访问5次
	}
}
