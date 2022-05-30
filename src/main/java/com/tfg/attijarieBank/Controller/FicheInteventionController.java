package com.tfg.attijarieBank.Controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tfg.attijarieBank.Models.FicheIntevention;
import com.tfg.attijarieBank.Repository.FicheInterventionRepository;
import com.tfg.attijarieBank.exception.ResourceNotFoundException;

@RestController
@CrossOrigin(origins = "*")

public class FicheInteventionController {
	
	@Autowired
	private FicheInterventionRepository ficheInterventionRepository ;
	
	
/*	public FicheIntevention findByName(String PROG) {
	
		
		return this.ficheInterventionRepository.findByName(PROG) ;
	}
	
	*/
	@GetMapping("/ListOfFichesInterventions")
	public List<FicheIntevention> getAllFicheIntervention(){
		System.out.println(ficheInterventionRepository);
		return this.ficheInterventionRepository.findAll();
		
	}
	
	@PostMapping("/addNewFicheIntervention")
	public FicheIntevention addFicheIntervention(@RequestBody FicheIntevention ficheIntervention) {
		return this.ficheInterventionRepository.save(ficheIntervention);
		
		
		
	}
	
	 @DeleteMapping("/ficheIntervention/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteficheIntervention(@PathVariable int id){
		
		 FicheIntevention ficheIntervention = ficheInterventionRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("user with this id is not found : "+ id));
		
		ficheInterventionRepository.delete(ficheIntervention);
		Map<String,Boolean> response = new HashMap<>();
		response.put("deleted",Boolean.TRUE);
		return ResponseEntity.ok(response);
	
}
	 
	 
	 

		@PutMapping("/ficheIntervention/{id}")
		public ResponseEntity<FicheIntevention> FichInterventioneUser(@PathVariable int id,@RequestBody FicheIntevention fichDetaits){
			FicheIntevention ficheIntevention = ficheInterventionRepository.findById(id)
					.orElseThrow(()->new ResourceNotFoundException("Fiche Intervention with this id is not found please enter valid id "));
			
			if (fichDetaits.getActionsRealisees() != null) {
				ficheIntevention.setActionsRealisees(fichDetaits.getActionsRealisees());
				
			}
			
			
			if (fichDetaits.getCauseIncident() != null) {
				ficheIntevention.setCauseIncident(fichDetaits.getCauseIncident());
				
			}
			
			if (fichDetaits.getConstats() != null) {
				ficheIntevention.setConstats(fichDetaits.getConstats());
				
			}
			
			if (fichDetaits.getCauseIncident() != null) {
				ficheIntevention.setConsequencesIncident(fichDetaits.getConsequencesIncident());
				
			}
			
			if (fichDetaits.getDetailInvestigations() != null) {
				ficheIntevention.setDetailInvestigations(fichDetaits.getDetailInvestigations());
				
			}
			
			if (fichDetaits.getDureeIncident() != null) {
				ficheIntevention.setDureeIncident(fichDetaits.getDureeIncident());
				
			}
			
			if (fichDetaits.getPROG() != null) {
				ficheIntevention.setPROG(fichDetaits.getPROG());
				
			}
			
			
			if (fichDetaits.getStatutResolution() != null) {
				ficheIntevention.setStatutResolution(fichDetaits.getStatutResolution());
				
			}
			
			FicheIntevention updateFicheIntervention = ficheInterventionRepository.save(ficheIntevention);
			
			return ResponseEntity.ok(updateFicheIntervention) ;
		}
	 
		
		
		
		
		@DeleteMapping("/FicheIntervention/{id}")
		public ResponseEntity<Map<String, Boolean>> deleteFicheIntervention(@PathVariable int id){
			
			FicheIntevention ficheIntevention = ficheInterventionRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("fiche d'Intevention with this id is not found : "+ id));
			
			ficheInterventionRepository.delete(ficheIntevention);
			Map<String,Boolean> response = new HashMap<>();
			response.put("deleted",Boolean.TRUE);
			return ResponseEntity.ok(response);
			
			
		}
		
		@GetMapping("/filterByPROG/{PROG}")
		public FicheIntevention getFicheInterventionByPROG(@PathVariable String PROG) {
			
			return this.ficheInterventionRepository.findByPROG(PROG) ;
		}
		
		
	 
}