package com.helena.servicios.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.helena.servicios.models.entity.Persona;

public interface Personarepository extends CrudRepository<Persona, Long>{

}