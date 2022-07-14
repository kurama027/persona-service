package com.helena.servicios.models.service;

import java.util.List;

import com.helena.servicios.models.entity.identidad;

public interface identidadService {
	public List<identidad>findAll();
	public identidad findById(Long id);
	public void delete(identidad ide);

}
