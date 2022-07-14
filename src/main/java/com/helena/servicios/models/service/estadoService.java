package com.helena.servicios.models.service;

import java.util.List;

import com.helena.servicios.models.entity.estado;


public interface estadoService {

	public List<estado> findAll();
	public estado findById(Long id);
	public void delete(estado es);
}
