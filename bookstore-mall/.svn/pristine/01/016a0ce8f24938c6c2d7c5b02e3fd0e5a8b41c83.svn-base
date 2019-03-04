package com.bs.mall.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bs.mall.pojo.Express;
import com.bs.mall.service.ExpressService;

@Controller
public class ExpressController {
	@Autowired
	private ExpressService es;

	@GetMapping("/getExpressWay")
	public @ResponseBody List<Express> selectExpress() {
		return es.selectExpress();
	}
	
}
