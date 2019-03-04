package com.bs.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.mall.dao.ExpressDao;
import com.bs.mall.pojo.Express;
import com.bs.mall.service.ExpressService;
@Service
public class ExpressServiceImpl implements ExpressService {
	@Autowired
	private ExpressDao ed;

	@Override
	public List<Express> selectExpress() {
		return ed.referExpress();
	}

	


}
