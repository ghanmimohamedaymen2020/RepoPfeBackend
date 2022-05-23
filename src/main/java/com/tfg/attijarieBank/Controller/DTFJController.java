package com.tfg.attijarieBank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tfg.attijarieBank.Models.ListeDTfj;
import com.tfg.attijarieBank.Repository.RepositoryDTFJ;

@RestController

public class DTFJController {
	
	
	@Autowired
	RepositoryDTFJ repositoryDTFJ ;

	
	@GetMapping("/DTFJ")
	public  List<ListeDTfj> getAllUser(){
		return repositoryDTFJ.findAll();
		
	}
	
	

}
