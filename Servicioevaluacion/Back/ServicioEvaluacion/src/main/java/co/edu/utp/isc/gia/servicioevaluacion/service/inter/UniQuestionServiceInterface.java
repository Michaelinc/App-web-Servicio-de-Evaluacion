/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.service.inter;

import co.edu.utp.isc.gia.servicioevaluacion.web.dto.Question.UniQuestionDTO;
import java.util.List;

/**
 *
 * @author Michael
 */
public interface UniQuestionServiceInterface {
    
    UniQuestionDTO save(UniQuestionDTO object);
    UniQuestionDTO get(Long id);
    List<UniQuestionDTO> getAll();
    Boolean delete(Long id);
    UniQuestionDTO update(Long id, UniQuestionDTO object);
}
