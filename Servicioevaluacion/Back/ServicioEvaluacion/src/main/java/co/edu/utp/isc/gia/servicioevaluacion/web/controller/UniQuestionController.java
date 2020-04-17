/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.web.controller;

import co.edu.utp.isc.gia.servicioevaluacion.service.impl.Question.UniQuestionServiceImpl;
import co.edu.utp.isc.gia.servicioevaluacion.web.dto.Question.UniQuestionDTO;
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
@RequestMapping("uniquestion")
public class UniQuestionController {
    
   @Autowired
   private UniQuestionServiceImpl uniQuestionServiceImpl;

    public UniQuestionController(UniQuestionServiceImpl uniQuestionServiceImpl) {
        this.uniQuestionServiceImpl = uniQuestionServiceImpl;
    }
   
   @PostMapping
    public ResponseEntity<?> guardar(@RequestBody UniQuestionDTO uniQuestion) {
        System.out.println("co.edu.utp.isc.gia.servicioevaluacion.web.controller.ProfessorController.guardar()");
        uniQuestionServiceImpl.save(uniQuestion);
        return ResponseEntity.ok(uniQuestion);
    }
    
}
