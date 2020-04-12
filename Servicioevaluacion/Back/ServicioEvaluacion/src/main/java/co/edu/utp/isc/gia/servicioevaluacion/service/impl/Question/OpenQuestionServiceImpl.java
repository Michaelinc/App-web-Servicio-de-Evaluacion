/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.service.impl.Question;

import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Question.OpenQuestion;
import co.edu.utp.isc.gia.servicioevaluacion.service.inter.BaseServiceInterface;
import co.edu.utp.isc.gia.servicioevaluacion.web.dto.Question.OpenQuestionDTO;
import java.util.List;


public class OpenQuestionServiceImpl implements BaseServiceInterface<OpenQuestion, Long, OpenQuestionDTO> {

    @Override
    public OpenQuestionDTO save(OpenQuestion object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OpenQuestionDTO get(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<OpenQuestionDTO> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OpenQuestionDTO update(Long id, OpenQuestion object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
