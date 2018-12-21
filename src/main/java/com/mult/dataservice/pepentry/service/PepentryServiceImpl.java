package com.mult.dataservice.pepentry.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mult.dataservice.pepentry.dao.IPepentryDAO;
import com.mult.dataservice.pepentry.model.Pepentry;

@Service("pepentryService")
@Transactional
public class PepentryServiceImpl implements IPepentryService {

	@Autowired
	IPepentryDAO pepentryDao;

	@Override
	public Pepentry findById(Long id) throws Exception {
		return pepentryDao.findById(id);
	}

	@Override
	public List<Pepentry> findAll() throws Exception {
		return pepentryDao.findAll();
	}

	@Override
	public void save(Pepentry pepentry) throws Exception {
		try {
			pepentry.getPersonalInfo().setPepentry(pepentry);
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			pepentry.getAttachment().stream().filter(Objects::nonNull).forEach(r -> r.setPepentry(pepentry));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			pepentry.getPepentryAddressInfo().stream().filter(Objects::nonNull).forEach(r -> r.setPepentry(pepentry));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			pepentry.getPepentryFamilyInfos().stream().filter(Objects::nonNull).forEach(r -> r.setPepentry(pepentry));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			pepentry.getPepentryOfficeInfo().stream().filter(Objects::nonNull).forEach(r -> r.setPepentry(pepentry));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}

		pepentryDao.saveOrUpdate(pepentry);

	}

}
