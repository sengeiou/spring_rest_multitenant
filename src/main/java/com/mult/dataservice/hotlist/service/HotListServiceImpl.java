package com.mult.dataservice.hotlist.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mult.dataservice.hotlist.dao.IHotListDAO;
import com.mult.dataservice.hotlist.model.HotList;

@Service("hotListServiceO")
@Transactional
public class HotListServiceImpl implements IHotListService{
	
	@Autowired
	IHotListDAO hotListDao;

	@Override
	public HotList findById(Long id) throws Exception {
		return hotListDao.findById(id);
	}

	@Override
	public List<HotList> findAll() throws Exception {
		return hotListDao.findAll();
	}

	@Override
	public Long save(HotList hotList) throws Exception {
		try{
			hotList.getPersonalInfo().setHotList(hotList);
		}catch(NullPointerException ex){
			ex.getMessage();
		}
		try{
			hotList.getUser().setHotList(hotList);
		}catch(NullPointerException ex){
			ex.getMessage();
		}
		try{
		
		hotList.getAttachment().stream().filter(Objects::nonNull).forEach(r -> r.setHotList(hotList));
		}catch(NullPointerException ex){
			ex.getMessage();
		}
		try{
		hotList.getHotListAddressInfo().stream().filter(Objects::nonNull).forEach(r -> r.setHotList(hotList));
		}catch(NullPointerException ex){
			ex.getMessage();
		}
		try{
		hotList.getHotListFamilyInfos().stream().filter(Objects::nonNull).forEach(r -> r.setHotList(hotList));
		}catch(NullPointerException ex){
			ex.getMessage();
		}
		try{
		hotList.getHotListOfficeInfo().stream().filter(Objects::nonNull).forEach(r -> r.setHotList(hotList));
		}catch(NullPointerException ex){
			ex.getMessage();
		}
		try{
		hotList.getInvestigationMediaInfo().stream().filter(Objects::nonNull).forEach(r -> r.setHotList(hotList));
		}catch(NullPointerException ex){
			ex.getMessage();
		}
		
		return hotListDao.saveOrUpdate(hotList);
	
		
	}

}
