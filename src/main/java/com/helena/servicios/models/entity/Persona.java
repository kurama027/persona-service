package com.helena.servicios.models.entity;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "tma_persona")
public class Persona {

	@Id
	// auto incremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PERSONA")
	private long ID_PERSONA;

	@Column(name = "NO_PERSONA")
	private String NO_PERSONA;

	@Column(name = "AP_PATERNO")
	private String AP_PATERNO;

	@Column(name = "AP_MATERNO")
	private String AP_MATERNO;

	@Column(name = "NU_TELEFONO")
	private String NU_TELEFONO;

	@Column(name = "NU_DNI")
	private String NU_DNI;

	@Column(name = "TI_SEXO")
	private Boolean TI_SEXO;
	@Column(name = "DI_PERSONA")
	private String DI_PERSONA;

	@Column(name = "ES_PERSONA")
	private String ES_PERSONA;
	
	 
	@Temporal(TemporalType.DATE)
	@Column(name = "FE_NAC")
	private Date FE_NAC;  
	
;



	public long getID_PERSONA() {
		return ID_PERSONA;
	}

	public void setID_PERSONA(long iD_PERSONA) {
		ID_PERSONA = iD_PERSONA;
	}

	public String getNO_PERSONA() {
		return NO_PERSONA;
	}

	public void setNO_PERSONA(String nO_PERSONA) {
		NO_PERSONA = nO_PERSONA;
	}

	public String getAP_PATERNO() {
		return AP_PATERNO;
	}

	public void setAP_PATERNO(String aP_PATERNO) {
		AP_PATERNO = aP_PATERNO;
	}

	public String getAP_MATERNO() {
		return AP_MATERNO;
	}

	public void setAP_MATERNO(String aP_MATERNO) {
		AP_MATERNO = aP_MATERNO;
	}

	public String getNU_TELEFONO() {
		return NU_TELEFONO;
	}

	public void setNU_TELEFONO(String nU_TELEFONO) {
		NU_TELEFONO = nU_TELEFONO;
	}

	public String getNU_DNI() {
		return NU_DNI;
	}

	public void setNU_DNI(String nU_DNI) {
		NU_DNI = nU_DNI;
	}

	public Boolean getTI_SEXO() {
		return TI_SEXO;
	}

	public void setTI_SEXO(Boolean tI_SEXO) {
		TI_SEXO = tI_SEXO;
	}

	public String getDI_PERSONA() {
		return DI_PERSONA;
	}

	public void setDI_PERSONA(String dI_PERSONA) {
		DI_PERSONA = dI_PERSONA;
	}

	public String getES_PERSONA() {
		return ES_PERSONA;
	}

	public void setES_PERSONA(String eS_PERSONA) {
		ES_PERSONA = eS_PERSONA;
	}

	public Date getFE_NAC() {
		return FE_NAC;
	}

	public void setFE_NAC(Date fE_NAC) {
		FE_NAC = fE_NAC;
	}
	
	  @PrePersist
	    public void prePersist() {
	        FE_NAC = new Date();
	    }
	

}
