package com.helena.servicios.models.service;

import java.util.List;

import com.helena.servicios.models.entity.TipoDoc;


public interface TipoDocService {
	public List<TipoDoc> findAll();
	public TipoDoc findById(Long id);
	public void delete(TipoDoc tip);


}
