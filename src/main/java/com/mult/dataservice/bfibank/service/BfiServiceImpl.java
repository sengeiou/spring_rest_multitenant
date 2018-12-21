package com.mult.dataservice.bfibank.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mult.dataservice.bfibank.dao.IBfiDAO;
import com.mult.dataservice.bfibank.model.Bfi;

@Service("bfiService")
@Transactional
public class BfiServiceImpl implements IBfiService {

	@Autowired
	IBfiDAO bfiDao;

	@Override
	public Bfi findById(Long id) throws Exception {
		return bfiDao.findById(id);
	}

	@Override
	public List<Bfi> findAll() throws Exception {
		return bfiDao.findAll();
	}

	@Override
	public void saveOrUpdate(Bfi bfi) throws Exception {
		try {
			bfi.getBfiInfo().setBfi(bfi);
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			bfi.getBfiAddress().stream().filter(Objects::nonNull).forEach(r -> r.setBfi(bfi));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			bfi.getBfiContact().stream().filter(Objects::nonNull).forEach(r -> r.setBfi(bfi));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			bfi.getBfiEmail().stream().filter(Objects::nonNull).forEach(r -> r.setBfi(bfi));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}

		bfiDao.saveOrUpdate(bfi);

	}

}
