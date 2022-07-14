package com.helena.servicios.models.service;

import java.util.List;

import com.helena.servicios.models.entity.direccion;


public interface direccionService {
	public List<direccion> findAll();
	public direccion findById(Long id);
	public void delete(direccion di);

}
