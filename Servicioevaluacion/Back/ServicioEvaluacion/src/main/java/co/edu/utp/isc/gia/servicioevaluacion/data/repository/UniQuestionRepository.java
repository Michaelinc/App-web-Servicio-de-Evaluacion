/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.data.repository;

import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Question.UniQuestion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Michael
 */
@Repository
public interface UniQuestionRepository extends CrudRepository<UniQuestion, Long>{
    
}
