package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.drug.Drug;
@Repository
public interface DrugRepository extends JpaRepository<Drug, Long> {

}
