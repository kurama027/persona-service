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

import com.helena.servicios.models.entity.direccion;
import com.helena.servicios.models.service.direccionService;

@RestController
public class direccioncontroller {
	@Autowired
	private direccionService direcser;
	
	@GetMapping("/listar-direccion")
	public ResponseEntity<?> findAll(HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Consulta correcta.");
        result.put("data", direcser.findAll());
        return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	@GetMapping("/ver-direccion/{id}")
	public direccion detalle(@PathVariable Long id) { 
		return direcser.findById(id);
	}
	
	@DeleteMapping("/eliminar-direccion/{ID_DIRECCION}")
    public ResponseEntity<?> delete(@PathVariable(value = "ID_DIRECCION") Long ID_DIRECCION, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        direccion data = direcser.findById(ID_DIRECCION);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + ID_DIRECCION);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            direcser.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            result.put("data", data);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
