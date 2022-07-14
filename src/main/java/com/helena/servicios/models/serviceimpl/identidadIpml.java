package com.helena.servicios.models.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helena.servicios.models.entity.identidad;
import com.helena.servicios.models.repository.identidadRepository;
import com.helena.servicios.models.service.identidadService;
@Service
public class identidadIpml implements identidadService{
	@Autowired
	private identidadRepository idere;
	@Override
	public List<identidad> findAll() {
		// TODO Auto-generated method stub
		return (List<identidad>)idere.findAll();
	}

	@Override
	public void delete(identidad ide) {
		// TODO Auto-generated method stub
		idere.delete(ide);
	}

	@Override
	public identidad findById(Long id) {
		// TODO Auto-generated method stub
		return idere.findById(id).orElse(null);
	}

	
}
