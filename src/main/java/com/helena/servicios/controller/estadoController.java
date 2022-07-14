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

import com.helena.servicios.models.entity.estado;
import com.helena.servicios.models.service.estadoService;

@RestController
public class estadoController {
	@Autowired
	private estadoService estadoser;
	
	@GetMapping("/listar-estado")
	public ResponseEntity<?> findAll(HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Consulta correcta.");
        result.put("data", estadoser.findAll());
        return new ResponseEntity<>(result, HttpStatus.OK);	
	}
	
	@GetMapping("/ver-estado/{id}")
	public estado detalle(@PathVariable Long id) { 
		return estadoser.findById(id);
	}
	
	@DeleteMapping("/eliminar-estado/{ID_ESTADO_CIVIL}")
    public ResponseEntity<?> delete(@PathVariable(value = "ID_ESTADO_CIVIL") Long ID_ESTADO_CIVIL, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        estado data = estadoser.findById(ID_ESTADO_CIVIL);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + ID_ESTADO_CIVIL);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            estadoser.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            result.put("data", data);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }

}
}
