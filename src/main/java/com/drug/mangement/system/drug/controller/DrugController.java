package com.drug.mangement.system.drug.controller;

import com.drug.mangement.system.drug.entity.Drug;
import com.drug.mangement.system.drug.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotEmpty;

@RestController
@RequestMapping(value = "/drug-module")
public class DrugController {

    private final DrugService service;

    @Autowired
    public DrugController(DrugService service) {
        this.service = service;
    }

    @PostMapping(value = "/drug")
    public ResponseEntity<Drug> addDrug(@RequestBody @NotEmpty Drug drug){
        Drug response = service.addDrug(drug);
        if(response!=null)
             return new ResponseEntity<Drug>(response, HttpStatus.CREATED);
        else
            return new ResponseEntity<Drug>((Drug) null, HttpStatus.BAD_REQUEST);
    }
}
