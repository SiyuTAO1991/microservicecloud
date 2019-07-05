package com.alextao.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alextao.springcloud.entities.Dept;
import com.alextao.springcloud.service.DeptClientService;

public class DeptController_Feign {
	
	@Autowired
	private DeptClientService service = null;
	
	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return this.service.get(id);
	}

	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list() {
		return this.service.list();
	}

	@RequestMapping(value = "/consumer/dept/add")
	public Object add(Dept dept) {
		return this.service.add(dept);
	}
}
