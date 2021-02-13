package com.drug.mangement.system.drug.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "drug_table")
public class Drug {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "drug_id", nullable = false)
    private Long id;
    @Column(name = "drug_name")
    @NotEmpty(message = "can't be null")
    private String name;
    @Column(name = "drug_specification")
    private String specification;
}
