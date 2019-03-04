package com.bs.mall.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bs.mall.dao.ExpressDao;
import com.bs.mall.mapper.ExpressMapper;
import com.bs.mall.pojo.Express;
@Repository
public class ExpressDaoImpl implements ExpressDao {
	@Autowired
	private ExpressMapper em;
	
	@Override
	public List<Express> referExpress() {
		return em.selectExpress();
	}
	
}
