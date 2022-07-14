package com.helena.servicios.models.service;

import java.util.List;

import com.helena.servicios.models.entity.Persona;


public interface PersonaService {
	public List<Persona> findAll();
	public Persona findById(Long id);
	public Persona save(Persona per); 
	public void delete(Persona per);

}
