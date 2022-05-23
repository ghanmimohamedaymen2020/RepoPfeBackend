package com.tfg.attijarieBank.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FicheIntevention")
public class FicheIntevention {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
private java.lang.String	PROG ;

private String Constats  ;
private String DetailInvestigations ;
private String CauseIncident ;
private String ConsequencesIncident ;
private String DureeIncident ;
private String actionsRealisees ;
private String StatutResolution ;






public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public FicheIntevention(  int id ,String pROG, String constats, String detailInvestigations, String causeIncident,
		String consequencesIncident, String dureeIncident, String actionsRealisees, String statutResolution
		) {

    this.id = id ;
	PROG = pROG;
	Constats = constats;
	DetailInvestigations = detailInvestigations;
	CauseIncident = causeIncident;
	ConsequencesIncident = consequencesIncident;
	DureeIncident = dureeIncident;
	this.actionsRealisees = actionsRealisees;
	StatutResolution = statutResolution;
}

public FicheIntevention() {
	
}


public String getPROG() {
	return PROG;
}

public void setPROG(String pROG) {
	PROG = pROG;
}

public String getConstats() {
	return Constats;
}

public void setConstats(String constats) {
	Constats = constats;
}

public String getDetailInvestigations() {
	return DetailInvestigations;
}

public void setDetailInvestigations(String detailInvestigations) {
	DetailInvestigations = detailInvestigations;
}

public String getCauseIncident() {
	return CauseIncident;
}

public void setCauseIncident(String causeIncident) {
	CauseIncident = causeIncident;
}

public String getConsequencesIncident() {
	return ConsequencesIncident;
}

public void setConsequencesIncident(String consequencesIncident) {
	ConsequencesIncident = consequencesIncident;
}

public String getDureeIncident() {
	return DureeIncident;
}

public void setDureeIncident(String dureeIncident) {
	DureeIncident = dureeIncident;
}

public String getActionsRealisees() {
	return actionsRealisees;
}

public void setActionsRealisees(String actionsRealisees) {
	this.actionsRealisees = actionsRealisees;
}

public String getStatutResolution() {
	return StatutResolution;
}

public void setStatutResolution(String statutResolution) {
	StatutResolution = statutResolution;
}











}
  