package com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.DrugDao;
import com.drug.*;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping(value = "/drug-module")
@Slf4j
public class DrugCntroller {
	
     @Autowired
	private DrugDao dao;
     
     @GetMapping("/drugs")
	public List<Drug> findAllDrug(){
		return dao.getAllDrug();
	}
     @GetMapping("/drugs/{drugId}")
 	public List<Drug> findDrug(@PathVariable int drugId){
 return null;
 	}
     @PostMapping("/drugs")
     
     public ResponseEntity<Drug> addDrug(@RequestBody Drug drug){
    	// log.info("Calling Controller:");
    	 Drug response = dao.addDrug(drug);
     	return new ResponseEntity<Drug>(response, HttpStatus.CREATED);
     }
}
