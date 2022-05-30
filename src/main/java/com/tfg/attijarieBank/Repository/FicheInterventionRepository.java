package com.tfg.attijarieBank.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tfg.attijarieBank.Models.FicheIntevention;

public interface FicheInterventionRepository extends  JpaRepository<FicheIntevention, Integer> {
	
public FicheIntevention findByPROG(String PROG); 

}
