package com.tfg.attijarieBank.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tfg.attijarieBank.Models.FicheIntevention;
import com.tfg.attijarieBank.Services.FicheInteventionService;

@RestController

public class FicheInteventionController {
	
	@Autowired
	FicheInteventionService ficheInteventionService; 
	
	/*@GetMapping ("/FicheIntevention/{name}")
	public FicheIntevention getFicheinterventionByName( String name) {
		return ficheInteventionService.findByName(name);
	}*/
	
	@GetMapping ("/FichesIntevention")
	
	

	public List<FicheIntevention> getAllFicheIntervention(){
		return ficheInteventionService.getAllFicheIntervention();
		
	}
	
	
	
	@PostMapping("/createNewFicheIntervention")
	public void addNewFicheIntervention(FicheIntevention ficheIntevention) {
		
		
		ficheInteventionService.addFicheIntervention(ficheIntevention);
		
	}
	

}
