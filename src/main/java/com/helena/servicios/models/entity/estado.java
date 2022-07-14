package com.helena.servicios.models.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tma_estado_civil")
public class estado {
	@Id
	//auto incremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ESTADO_CIVIL")
	private long ID_ESTADO_CIVIL; 
	@Column(name = "TI_ESTADO_CIVIL")
	private String TI_ESTADO_CIVIL;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ID_ES_CI_PER")
	private Persona persona;
	
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public long getID_ESTADO_CIVIL() {
		return ID_ESTADO_CIVIL;
	}
	public void setID_ESTADO_CIVIL(long iD_ESTADO_CIVIL) {
		ID_ESTADO_CIVIL = iD_ESTADO_CIVIL;
	}
	public String getTI_ESTADO_CIVIL() {
		return TI_ESTADO_CIVIL;
	}
	public void setTI_ESTADO_CIVIL(String tI_ESTADO_CIVIL) {
		TI_ESTADO_CIVIL = tI_ESTADO_CIVIL;
	}

	
}
