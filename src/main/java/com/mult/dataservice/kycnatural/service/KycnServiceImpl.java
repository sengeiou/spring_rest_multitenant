package com.mult.dataservice.kycnatural.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mult.dataservice.kycnatural.dao.IKycnBaseDAO;
import com.mult.dataservice.kycnatural.model.KycnBase;
import com.mult.dataservice.kycnatural.model.KycnPersonalInfo;

@Service("kycnService")
@Transactional
public class KycnServiceImpl implements IKycnService {

	@Autowired
	IKycnBaseDAO kycnDao;

	@Override
	public KycnBase findById(Long id) throws Exception {
		return kycnDao.findById(id);
	}

	@Override
	public List<KycnBase> findAllKycn() throws Exception {
		return kycnDao.findAllKycn();
	}

	@Override
	public Long save(KycnBase kycnBase) throws Exception {

		try {
			kycnBase.getKycnAccountsInfo().stream().filter(Objects::nonNull)
					.forEach(info -> info.setKycnBase(kycnBase));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			kycnBase.getKycnAddressInfo().stream().filter(Objects::nonNull).forEach(r -> r.setKycnBase(kycnBase));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			kycnBase.getKycnEducationInfo().stream().filter(Objects::nonNull).forEach(r -> r.setKycnBase(kycnBase));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			kycnBase.getKycnFinancialInfo().stream().filter(Objects::nonNull).forEach(r -> r.setKycnBase(kycnBase));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			kycnBase.getKycnIdentificationInfo().stream().filter(Objects::nonNull)
					.forEach(r -> r.setKycnBase(kycnBase));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			kycnBase.getKycnInvolvementInfo().stream().filter(Objects::nonNull).forEach(r -> r.setKycnBase(kycnBase));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			kycnBase.getKycnObservationInfo().stream().filter(Objects::nonNull).forEach(r -> r.setKycnBase(kycnBase));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			kycnBase.getKycnRelatedEntityInfo().stream().filter(Objects::nonNull).forEach(r -> r.setKycnBase(kycnBase));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			kycnBase.getKycnRelatedPersonInfo().stream().filter(Objects::nonNull).forEach(r -> r.setKycnBase(kycnBase));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}
		try {
			kycnBase.getKycnRelationInfo().stream().filter(Objects::nonNull).forEach(r -> r.setKycnBase(kycnBase));
		} catch (NullPointerException ex) {
			ex.getMessage();
		}

		if (kycnBase.getKycnPersonalInfo() != null) {
			KycnPersonalInfo info = kycnBase.getKycnPersonalInfo();
			info.setKycnBase(kycnBase);
			if (info.getUser() != null)
				info.getUser().setPersonalInfo(kycnBase.getKycnPersonalInfo());

		}
		
		return kycnDao.saveOrUpdate(kycnBase);

	}

}
