package com.helena.servicios.models.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helena.servicios.models.entity.estado;
import com.helena.servicios.models.repository.estadorepository;
import com.helena.servicios.models.service.estadoService;
@Service
public class estadoIpml implements estadoService{
	@Autowired
	private estadorepository estadore;
	@Override
	public List<estado> findAll() {
		// TODO Auto-generated method stub
		return (List<estado>)estadore.findAll();
	}

	@Override
	public estado findById(Long id) {
		// TODO Auto-generated method stub
		return estadore.findById(id).orElse(null);
	}

	@Override
	public void delete(estado es) {
		// TODO Auto-generated method stub
		estadore.delete(es);
	}

}
