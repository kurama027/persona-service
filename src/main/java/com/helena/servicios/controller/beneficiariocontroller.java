package com.helena.servicios.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.helena.servicios.models.entity.Persona;
import com.helena.servicios.models.entity.beneficiario;
import com.helena.servicios.models.service.beneficiarioService;

@RestController
public class beneficiariocontroller { 
	@Autowired
	private beneficiarioService benservice;
	
	@GetMapping("/listarbeneficiario")
	public ResponseEntity<?> findAll(HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Consulta correcta.");
        result.put("data", benservice.findAll());
        return new ResponseEntity<>(result, HttpStatus.OK);	
	}
	
	@GetMapping("/ver-beneficiario/{id}")
	beneficiario detalle(@PathVariable Long id) { 
		return benservice.findById(id);
	}
	
	@DeleteMapping("/eliminar-beneficiario/{ID_BENEFICIARIO}")
    public ResponseEntity<?> delete(@PathVariable(value = "ID_BENEFICIARIO") Long ID_BENEFICIARIO, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        beneficiario data = benservice.findById(ID_BENEFICIARIO);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + ID_BENEFICIARIO);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            benservice.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            result.put("data", data);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
