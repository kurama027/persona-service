package com.helena.servicios.models.service;

import java.util.List;

import com.helena.servicios.models.entity.beneficiario;



public interface beneficiarioService {
	public List<beneficiario> findAll();
	public beneficiario findById(Long id);
	public beneficiario save(beneficiario bene); 
	public void delete(beneficiario bene);

}
