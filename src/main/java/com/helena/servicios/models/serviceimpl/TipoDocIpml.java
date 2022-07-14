package com.helena.servicios.models.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helena.servicios.models.entity.TipoDoc;
import com.helena.servicios.models.repository.TipoDocRepository;
import com.helena.servicios.models.service.TipoDocService;
@Service
public class TipoDocIpml implements TipoDocService{
	@Autowired
	private TipoDocRepository tipr;
	
	@Override
	public List<TipoDoc> findAll() {
		// TODO Auto-generated method stub
		return (List<TipoDoc>)tipr.findAll();
	}

	@Override
	public TipoDoc findById(Long id) {
		// TODO Auto-generated method stub
		return tipr.findById(id).orElse(null);
	}

	@Override
	public void delete(TipoDoc tip) {
		// TODO Auto-generated method stub
		tipr.delete(tip);
	}

}
