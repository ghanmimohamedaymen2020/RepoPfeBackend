package com.tfg.attijarieBank.Models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "D_TFJ")
public class ListeDTfj {
	
	@Id
    private String	PROG ;
	
	private Date DCO ;	
	private Date DATD ;	
	private String  HEURD ;	
	private Date DATF ;	
	private String HEURF ;	
	private String DUREE ;	
	private Boolean ETAPE ;
	
@ManyToOne()
@JoinColumn(name = "ListeTfj_id" )

private ListeTfj listeTFJ ;
	
	
	
	public ListeDTfj(String pROG, Date dCO, Date dATD, String hEURD, Date dATF, String hEURF, String dUREE,
			Boolean eTAPE ) {
		super();
		PROG = pROG;
		DCO = dCO;
		DATD = dATD;
		HEURD = hEURD;
		DATF = dATF;
		HEURF = hEURF;
		DUREE = dUREE;
		ETAPE = eTAPE;
		
	}
	
	public ListeTfj getListeTFJ() {
		return listeTFJ;
	}

	public void setListeTFJ(ListeTfj listeTFJ) {
		this.listeTFJ = listeTFJ;
	}

	public ListeDTfj() {
		
	}

	public String getPROG() {
		return PROG;
	}

	public void setPROG(String pROG) {
		PROG = pROG;
	}

	public Date getDCO() {
		return DCO;
	}

	public void setDCO(Date dCO) {
		DCO = dCO;
	}

	public Date getDATD() {
		return DATD;
	}

	public void setDATD(Date dATD) {
		DATD = dATD;
	}

	public String getHEURD() {
		return HEURD;
	}

	public void setHEURD(String hEURD) {
		HEURD = hEURD;
	}

	public Date getDATF() {
		return DATF;
	}

	public void setDATF(Date dATF) {
		DATF = dATF;
	}

	public String getHEURF() {
		return HEURF;
	}

	public void setHEURF(String hEURF) {
		HEURF = hEURF;
	}

	public String getDUREE() {
		return DUREE;
	}

	public void setDUREE(String dUREE) {
		DUREE = dUREE;
	}

	public Boolean getETAPE() {
		return ETAPE;
	}

	public void setETAPE(Boolean eTAPE) {
		ETAPE = eTAPE;
	}
	

}
