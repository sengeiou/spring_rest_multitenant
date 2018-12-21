package com.mult.dataservice.adversemedia.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mult.dataservice.adversemedia.dao.IAdverseMediaDAO;
import com.mult.dataservice.adversemedia.model.AdverseMedia;

@Service("adverseMediaService")
@Transactional
public class AdverseMediaServiceImpl implements IAdverseMediaService {

	@Autowired
	IAdverseMediaDAO adverseMediaDao;

	@Override
	public AdverseMedia findById(Long id) throws Exception {
		return adverseMediaDao.findById(id);
	}

	@Override
	public List<AdverseMedia> findAll() throws Exception {
		return adverseMediaDao.findAll();
	}

	@Override
	public Long save(AdverseMedia media) throws Exception {
		try {
			media.getPersonalInfo().setAdverseMedia(media);
		} catch (NullPointerException ex) {
			ex.getMessage();
		}

		try {
			media.getUser().setAdverseMedia(media);
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			media.getAdverseAddressInfo().stream().filter(Objects::nonNull).forEach(r -> r.setAdverseMedia(media));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			media.getAdverseFamilyInfo().stream().filter(Objects::nonNull).forEach(r -> r.setAdverseMedia(media));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			media.getAdverseOfficeInfo().stream().filter(Objects::nonNull).forEach(r -> r.setAdverseMedia(media));
		} catch (

		NullPointerException ex) {
			ex.getMessage();
		}
		try {
			media.getAttachment().stream().filter(Objects::nonNull).forEach(r -> r.setAdverseMedia(media));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		
		return adverseMediaDao.saveOrUpdate(media);

	}

}
