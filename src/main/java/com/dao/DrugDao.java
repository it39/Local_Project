package com.dao;

import java.util.List;

import com.drug.Drug;

public interface DrugDao {
	public List<Drug> getAllDrug();
   // public Optional<Drug> getDrugById(Long drugId);
    public Drug getDrugByName(String name);
    public Drug addDrug(Drug drug);
    public Drug updateDrug(Drug drug);
    public Drug deleteDrugrById(Long drugId);
}
