package com.helena.servicios.models.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.helena.servicios.models.entity.direccion;
import com.helena.servicios.models.repository.direccionrepository;
import com.helena.servicios.models.service.direccionService;

@Service
public class direccionIpml implements direccionService{
	@Autowired
	private direccionrepository direc;

	@Override
	@Transactional(readOnly = true)
	public List<direccion> findAll() {
		// TODO Auto-generated method stub
		return (List<direccion>)direc.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public direccion findById(Long id) {
		// TODO Auto-generated method stub
		return direc.findById(id).orElse(null);
	}

	@Override
	public void delete(direccion di) {
		// TODO Auto-generated method stub
		direc.delete(di);
	}

}
