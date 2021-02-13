package com.drug.mangement.system.drug.service;

import com.drug.mangement.system.drug.entity.Drug;
import com.drug.mangement.system.drug.repository.DrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrugServiceImpl implements DrugService{

    private final DrugRepository repository;

    @Autowired
    public DrugServiceImpl(DrugRepository repository) {
        this.repository = repository;
    }

    @Override
    public Drug addDrug(Drug drug) {
        return repository.save(drug);
    }
}
