package com.tfg.attijarieBank.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "TFJ")
public class ListeTfj {
	

	
	private String T_TOT;
		
	private String T_HI;
	private Long  NMVT;
	@Id
	private  Date DCO	;
	
	@OneToMany(mappedBy = "listeTFJ")
	private List<ListeDTfj> listeDetailTfj = new ArrayList<>() ;
	


	public ListeTfj(String t_TOT, String t_HI, Long nMVT, Date dCO, Set<ListeDTfj> listeDetailTFJs) {
		super();
		T_TOT = t_TOT;
		T_HI = t_HI;
		NMVT = nMVT;
		DCO = dCO;
	}
	
	public ListeTfj() {
		
	}



	public Date getDCO() {
		return DCO;
	}


	public void setDCO(Date dCO) {
		DCO = dCO;
	}


	public String getT_TOT() {
		return T_TOT;
	}


	public void setT_TOT(String t_TOT) {
		T_TOT = t_TOT;
	}


	public String getT_HI() {
		return T_HI;
	}


	public void setT_HI(String t_HI) {
		T_HI = t_HI;
	}


	public Long getNMVT() {
		return NMVT;
	}


	public void setNMVT(Long nMVT) {
		NMVT = nMVT;
	}
	
	
	
}
