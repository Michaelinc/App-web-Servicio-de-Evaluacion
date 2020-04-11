/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.web.controller;

import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Professor;
import co.edu.utp.isc.gia.servicioevaluacion.data.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Michael
 */
@RestController
@RequestMapping("profe")
public class ProfessorController {
    
    @Autowired
    ProfessorRepository repo;
    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Professor pro){
        System.out.println("co.edu.utp.isc.gia.servicioevaluacion.web.controller.ProfessorController.guardar()");
        repo.save(pro);
        return ResponseEntity.ok(pro);
    }
}
