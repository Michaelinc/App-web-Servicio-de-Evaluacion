/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.data.repository;

import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Professor;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Michael
 */
public interface ProfessorRepository extends CrudRepository<Professor, Long>{
    
}
