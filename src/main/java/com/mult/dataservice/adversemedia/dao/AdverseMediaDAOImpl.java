package com.mult.dataservice.adversemedia.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mult.dataservice.adversemedia.model.AdverseMedia;
import com.mult.dataservice.common.AbstractDAO;

@Repository
public class AdverseMediaDAOImpl extends AbstractDAO implements IAdverseMediaDAO {

	@Override
	public AdverseMedia findById(Long id) {
		return getSession().find(AdverseMedia.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AdverseMedia> findAll() {
		List<AdverseMedia> mediaList = getSession().createQuery("SELECT r FROM AdverseMedia r ORDER BY r.id ASC")
				.getResultList();
		return mediaList;
	}

	@Override
	public Long saveOrUpdate(AdverseMedia media) {
		if (media.getId() == null) {
			getSession().persist(media);
			getSession().flush();
			return media.getId();
		} else {
			getSession().saveOrUpdate(media);
			return null;
		}

	}

}
