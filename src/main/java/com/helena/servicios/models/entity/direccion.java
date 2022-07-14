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
@Table(name = "tma_direccion")
public class direccion {
	@Id
	//auto incremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DIRECCION")
	private long ID_DIRECCION;
	@Column(name = "NO_DIRECCION")
	private String NO_DIRECCION;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ID_DI_PER")
	private Persona persona;
	
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public long getID_DIRECCION() {
		return ID_DIRECCION;
	}
	public void setID_DIRECCION(long iD_DIRECCION) {
		ID_DIRECCION = iD_DIRECCION;
	}
	public String getNO_DIRECCION() {
		return NO_DIRECCION;
	}
	public void setNO_DIRECCION(String nO_DIRECCION) {
		NO_DIRECCION = nO_DIRECCION;
	} 
	
	
}
