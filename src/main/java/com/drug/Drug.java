package com.drug;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;


@Entity
@Table(name = "Drug")
@Slf4j
@Getter
@Setter
public class Drug {
	@Id
	private Long drugId;
	private String drugName;
	private String specification;
	
	
	
	public Drug() {
		super();
	}
	public Long getDrugId() {
		return drugId;
	}
	public void setDrugId(Long drugId) {
		this.drugId = drugId;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	

}
