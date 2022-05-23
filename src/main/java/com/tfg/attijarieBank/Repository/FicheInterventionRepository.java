package com.tfg.attijarieBank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tfg.attijarieBank.Models.FicheIntevention;

public interface FicheInterventionRepository extends JpaRepository<FicheIntevention,   String> {
	
//	@Query("SELECT f FROM FicheIntevention f WHERE g.PROG = name")
	//public FicheIntevention findByName(@Param("PROG") , ;

}
