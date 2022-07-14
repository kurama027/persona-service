package com.helena.servicios.models.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tma_beneficiario")
public class beneficiario {

	@Id
	//auto incremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_BENEFICIARIO")
	private long ID_BENEFICIARIO;
	@Column(name = "DE_BENEFICIARIO")
	private String DE_BENEFICIARIO;
	@Column(name = "TI_BENEFICIARIO")
	private String TI_BENEFICIARIO;
	@Column(name = "IS_DISCAPACIAD")
	private String IS_DISCAPACIDAD;
	@Column(name = "NU_FAMILIARES")
	private String NU_FAMILIARES; 
	@Column(name = "ID_POBLACION") 
	private long ID_POBLACION; 
	@Column(name = "ID_CASERIO")
	private long ID_CASERIO; 
	@Column(name = "ID_TALLER")
	private long ID_TALLER;
	@Column(name = "ES_BENEFICIARIO")
	private String ES_BENEFICIARIO;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn( name="ID_BENE_PER")
	private Persona persona;
	
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	public long getID_BENEFICIARIO() {
		return ID_BENEFICIARIO;
	}
	public void setID_BENEFICIARIO(long iD_BENEFICIARIO) {
		ID_BENEFICIARIO = iD_BENEFICIARIO;
	}
	public String getDE_BENEFICIARIO() {
		return DE_BENEFICIARIO;
	}
	public void setDE_BENEFICIARIO(String dE_BENEFICIARIO) {
		DE_BENEFICIARIO = dE_BENEFICIARIO;
	}
	public String getTI_BENEFICIARIO() {
		return TI_BENEFICIARIO;
	}
	public void setTI_BENEFICIARIO(String tI_BENEFICIARIO) {
		TI_BENEFICIARIO = tI_BENEFICIARIO;
	}
	public String getIS_DISCAPACIDAD() {
		return IS_DISCAPACIDAD;
	}
	public void setIS_DISCAPACIDAD(String iS_DISCAPACIDAD) {
		IS_DISCAPACIDAD = iS_DISCAPACIDAD;
	}
	public String getNU_FAMILIARES() {
		return NU_FAMILIARES;
	}
	public void setNU_FAMILIARES(String nU_FAMILIARES) {
		NU_FAMILIARES = nU_FAMILIARES;
	}
	public long getID_POBLACION() {
		return ID_POBLACION;
	}
	public void setID_POBLACION(long iD_POBLACION) {
		ID_POBLACION = iD_POBLACION;
	}
	public long getID_CASERIO() {
		return ID_CASERIO;
	}
	public void setID_CASERIO(long iD_CASERIO) {
		ID_CASERIO = iD_CASERIO;
	}
	public long getID_TALLER() {
		return ID_TALLER;
	}
	public void setID_TALLER(long iD_TALLER) {
		ID_TALLER = iD_TALLER;
	}
	public String getES_BENEFICIARIO() {
		return ES_BENEFICIARIO;
	}
	public void setES_BENEFICIARIO(String eS_BENEFICIARIO) {
		ES_BENEFICIARIO = eS_BENEFICIARIO;
	} 
	
	

}
