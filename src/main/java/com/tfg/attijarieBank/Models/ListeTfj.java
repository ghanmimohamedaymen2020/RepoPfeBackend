package com.tfg.attijarieBank.Models;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "TFJ")
public class ListeTfj {
	

	
	private java.sql.Time T_TOT;
		
	private java.sql.Time  T_HI;
	private Long  NMVT;
	@Id
	@JsonFormat(pattern="yyyy-MM-dd")
	private  java.sql.Date DCO	;
	
	@OneToMany(mappedBy = "listeTFJ")
	private List<ListeDTfj> listeDetailTfj = new ArrayList<>() ; 
	


	public ListeTfj(Time t_TOT, Time t_HI, Long nMVT, java.sql.Date dCO, Set<ListeDTfj> listeDetailTFJs) {
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


	public void setDCO(java.sql.Date dCO) {
		DCO = dCO;
	}


	public Time getT_TOT() {
		return T_TOT;
	}


	public void setT_TOT(Time t_TOT) {
		T_TOT = t_TOT;
	}


	public Time getT_HI() {
		return T_HI;
	}


	public void setT_HI(Time t_HI) {
		T_HI = t_HI;
	}


	public Long getNMVT() {
		return NMVT;
	}


	public void setNMVT(Long nMVT) {
		NMVT = nMVT;
	}
	
	
	
}
