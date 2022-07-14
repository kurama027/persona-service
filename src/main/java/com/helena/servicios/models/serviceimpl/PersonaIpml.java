package com.helena.servicios.models.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.helena.servicios.models.entity.Persona;
import com.helena.servicios.models.repository.Personarepository;
import com.helena.servicios.models.service.PersonaService;

@Service
public class PersonaIpml implements PersonaService{
	@Autowired
	private Personarepository perstory;

	@Override
	@Transactional(readOnly = true)
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return (List<Persona>)perstory.findAll();
	}

	@Override
	public Persona findById(Long id) {
		// TODO Auto-generated method stub
		return perstory.findById(id).orElse(null);
	}

	@Override
	public Persona save(Persona per) {
		// TODO Auto-generated method stub
		return perstory.save(per);
	}

	@Override
	public void delete(Persona per) {
		// TODO Auto-generated method stub
		perstory.delete(per);
	}



}
