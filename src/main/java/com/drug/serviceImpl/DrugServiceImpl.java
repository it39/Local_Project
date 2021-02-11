package com.drug.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DrugDao;
import com.drug.Drug;
import com.repository.DrugRepository;
@Service
public class DrugServiceImpl implements DrugDao{
@Autowired
	private DrugRepository drugRepository;
	
	
	@Override
	public List<Drug> getAllDrug() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Drug getDrugByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Drug addDrug(Drug drug) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Drug updateDrug(Drug drug) {
		// TODO Auto-generated method stub
		return drugRepository.save(drug);
	}

	@Override
	public Drug deleteDrugrById(Long drugId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
