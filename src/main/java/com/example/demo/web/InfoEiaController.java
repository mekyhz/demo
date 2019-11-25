
package com.example.demo.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/info")
public class InfoEiaController  {

	/**
	* 自定义分页 信息档案-环评信息
	*/
	@GetMapping("/page")
	public String page() {

		return "web 3";
	}





}
