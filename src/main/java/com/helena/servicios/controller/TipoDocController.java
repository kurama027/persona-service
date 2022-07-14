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

import com.helena.servicios.models.entity.TipoDoc;
import com.helena.servicios.models.service.TipoDocService;

public class TipoDocController {
	@Autowired
	private TipoDocService tipser; 
	
	@GetMapping("/listar-tipodoc")
	public ResponseEntity<?> findAll(HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Consulta correcta.");
        result.put("data", tipser.findAll());
        return new ResponseEntity<>(result, HttpStatus.OK);	
	}
	
	@GetMapping("/ver-tipodoc/{id}")
	public TipoDoc detalle(@PathVariable Long id) { 
		return tipser.findById(id);
	}

	@DeleteMapping("/eliminar-tipodoc/{ID_TIPO_DOC}")
    public ResponseEntity<?> delete(@PathVariable(value = "ID_TIPO_DOC") Long ID_TIPO_DOC, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
     TipoDoc data = tipser.findById(ID_TIPO_DOC);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + ID_TIPO_DOC);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            tipser.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            result.put("data", data);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
