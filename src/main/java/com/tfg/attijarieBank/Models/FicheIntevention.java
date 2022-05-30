package com.tfg.attijarieBank.Models;

import javax.persistence.Column;
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


@Column(name = "PROG", nullable = false, unique = true)
private String	PROG ;
private String actionsRealisees ;
private String Constats  ;
private String DetailInvestigations ;
private String CauseIncident ;
private String ConsequencesIncident ;
private String DureeIncident ;
private String StatutResolution ;






public FicheIntevention() {
	
}



public FicheIntevention(int id, String pROG, String constats, String detailInvestigations, String causeIncident,
		String consequencesIncident, String dureeIncident, String actionsRealisees, String statutResolution) {
	this.id = id;
	this.PROG = pROG;
	this.Constats = constats;
	this.DetailInvestigations = detailInvestigations;
	this.CauseIncident = causeIncident;
	this.ConsequencesIncident = consequencesIncident;
	this.DureeIncident = dureeIncident;
	this.actionsRealisees = actionsRealisees;
	this.StatutResolution = statutResolution;
}



@Override
public String toString() {
	return "FicheIntevention [id=" + id + ", PROG=" + PROG + ", actionsRealisees=" + actionsRealisees + ", Constats="
			+ Constats + ", DetailInvestigations=" + DetailInvestigations + ", CauseIncident=" + CauseIncident
			+ ", ConsequencesIncident=" + ConsequencesIncident + ", DureeIncident=" + DureeIncident
			+ ", StatutResolution=" + StatutResolution + "]";
}



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public java.lang.String getPROG() {
	return PROG;
}



public void setPROG(java.lang.String pROG) {
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
  