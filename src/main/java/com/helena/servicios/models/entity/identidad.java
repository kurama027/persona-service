package com.helena.servicios.models.entity;

import java.io.Serializable;

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
@Table(name = "tma_doc_identidad")
public class identidad implements Serializable {
	@Id
//auto incremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DOC_IDENTIDAD")
	private long ID_DOC_IDENTIDAD;
	@Column(name = "DE_DOCUMENTO")
	private String DE_DOCUMENTO;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_DOC_IDEN_PER")
	private Persona persona;
	
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public long getID_DOC_IDENTIDAD() {
		return ID_DOC_IDENTIDAD;
	}

	public void setID_DOC_IDENTIDAD(long iD_DOC_IDENTIDAD) {
		ID_DOC_IDENTIDAD = iD_DOC_IDENTIDAD;
	}

	public String getDE_DOCUMENTO() {
		return DE_DOCUMENTO;
	}

	public void setDE_DOCUMENTO(String dE_DOCUMENTO) {
		DE_DOCUMENTO = dE_DOCUMENTO;
	}


}
