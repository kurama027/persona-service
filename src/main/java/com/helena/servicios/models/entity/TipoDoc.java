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
import javax.persistence.Table;

@Entity
@Table(name = "tma_direccion")
public class TipoDoc implements Serializable {

	@Id
	// auto incremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TIPO_DOC")
	private long ID_TIPO_DOC;
	@Column(name = "NO_DOCUMENTO")
	private String NO_DOCUMENTO;
	@Column(name = "NO_TIPO_DOC")
	private String NO_TIPO_DOC; 
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_TI_DOC")
	private identidad iden;

	public identidad getIden() {
		return iden;
	}

	public void setIden(identidad iden) {
		this.iden = iden;
	}

	public long getID_TIPO_DOC() {
		return ID_TIPO_DOC;
	}

	public void setID_TIPO_DOC(long iD_TIPO_DOC) {
		ID_TIPO_DOC = iD_TIPO_DOC;
	}

	public String getNO_DOCUMENTO() {
		return NO_DOCUMENTO;
	}

	public void setNO_DOCUMENTO(String nO_DOCUMENTO) {
		NO_DOCUMENTO = nO_DOCUMENTO;
	}

	public String getNO_TIPO_DOC() {
		return NO_TIPO_DOC;
	}

	public void setNO_TIPO_DOC(String nO_TIPO_DOC) {
		NO_TIPO_DOC = nO_TIPO_DOC;
	}

}
