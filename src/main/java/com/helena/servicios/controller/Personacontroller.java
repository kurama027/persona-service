package com.helena.servicios.controller;


import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.helena.servicios.models.entity.Persona;
import com.helena.servicios.models.service.PersonaService;

import io.swagger.annotations.ApiOperation;



@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class Personacontroller {
	
	@Autowired
	private PersonaService perservice; 
	
    @GetMapping("/listar-persona")
    public ResponseEntity<?> findAll(HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Consulta correcta.");
        result.put("data", perservice.findAll());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
	
	@GetMapping("/ver-persona/{id}")
	public Persona detalle(@PathVariable Long id) { 
		return perservice.findById(id);
	}

	@DeleteMapping("/eliminar-persona/{ID_PERSONA}")
    public ResponseEntity<?> delete(@PathVariable(value = "ID_PERSONA") Long ID_PERSONA, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        Persona data = perservice.findById(ID_PERSONA);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + ID_PERSONA);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            perservice.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            result.put("data", data);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
}
