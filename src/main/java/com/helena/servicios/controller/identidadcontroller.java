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

import com.helena.servicios.models.entity.identidad;
import com.helena.servicios.models.service.identidadService;

@RestController
public class identidadcontroller {
	@Autowired
	private identidadService ideser;
	
	@GetMapping("/listar-identidad")
	public ResponseEntity<?> findAll(HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Consulta correcta.");
        result.put("data", ideser.findAll());
        return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	@GetMapping("/ver-identidad/{id}")
	identidad detalle(@PathVariable Long id) { 
		return ideser.findById(id);
	}
	
	@DeleteMapping("/eliminar-identidad/{ID_DOC_IDENTIDAD}")
    public ResponseEntity<?> delete(@PathVariable(value = "ID_DOC_IDENTIDAD") Long ID_DOC_IDENTIDAD, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        identidad data = ideser.findById(ID_DOC_IDENTIDAD);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + ID_DOC_IDENTIDAD);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            ideser.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            result.put("data", data);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
