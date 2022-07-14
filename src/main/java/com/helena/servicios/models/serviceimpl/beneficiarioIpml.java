package com.helena.servicios.models.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helena.servicios.models.entity.beneficiario;
import com.helena.servicios.models.repository.beneficiariorepository;
import com.helena.servicios.models.service.beneficiarioService;
@Service
public class beneficiarioIpml implements beneficiarioService{
	@Autowired
	private beneficiariorepository benstory;
	
	@Override
	public List<beneficiario> findAll() {
		// TODO Auto-generated method stub
		return (List<beneficiario>)benstory.findAll();
	}

	@Override
	public beneficiario findById(Long id) {
		// TODO Auto-generated method stub
		return benstory.findById(id).orElse(null);
	}

	@Override
	public beneficiario save(beneficiario bene) {
		// TODO Auto-generated method stub
		return benstory.save(bene);
	}

	@Override
	public void delete(beneficiario bene) {
		// TODO Auto-generated method stub
		benstory.delete(bene);
	}

}
