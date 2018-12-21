package com.mult.dataservice.hotlist.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mult.dataservice.common.AbstractDAO;
import com.mult.dataservice.hotlist.model.HotList;

@Repository
public class HotListDAOImpl extends AbstractDAO implements IHotListDAO{
	


	@Override
	public HotList findById(Long id) {
		return getSession().find(HotList.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HotList> findAll() {
		List<HotList> hotList = getSession().createQuery("SELECT r FROM HotList r ORDER BY r.id ASC").getResultList();
		return hotList;
	}

	
	@Override
	public Long saveOrUpdate(HotList hotList) {
		if(hotList.getId() == null){
			getSession().persist(hotList);
			getSession().flush();
			return hotList.getId();
		}else{
			getSession().saveOrUpdate(hotList);
			return null;
		}
		
	}
	

}
