/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.service.impl.Question;

import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Question.UniQuestion;
import co.edu.utp.isc.gia.servicioevaluacion.data.repository.UniQuestionRepository;
import co.edu.utp.isc.gia.servicioevaluacion.exceptions.responses.BadRequestException;
import co.edu.utp.isc.gia.servicioevaluacion.exceptions.responses.InternalServerErrorException;
import co.edu.utp.isc.gia.servicioevaluacion.exceptions.responses.InvalidParameterException;
import co.edu.utp.isc.gia.servicioevaluacion.exceptions.responses.NotContentException;
import co.edu.utp.isc.gia.servicioevaluacion.exceptions.responses.NotFoundException;
import co.edu.utp.isc.gia.servicioevaluacion.service.inter.UniQuestionServiceInterface;
import co.edu.utp.isc.gia.servicioevaluacion.web.dto.Question.UniQuestionDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniQuestionServiceImpl implements UniQuestionServiceInterface {

    @Autowired
    UniQuestionRepository uniQuestionRepository;

    @Autowired
    ModelMapper mapper;

    public UniQuestionServiceImpl(UniQuestionRepository uniQuestionRepository, ModelMapper mapper) {
        this.uniQuestionRepository = uniQuestionRepository;
        this.mapper = mapper;
    }
    
    @Override
    public UniQuestionDTO save(UniQuestionDTO object) {
        /*if (object == null) {
            throw new BadRequestException("Peticion sin cuerpo");
        } else if (object.getScore() == null) {
            throw new InvalidParameterException("Informacion incompleta ,los campos deben llenarse correctamente verifique!");
        }else if (object.getChoice() == null) {
            throw new InvalidParameterException("Informacion incompleta ,los campos deben llenarse correctamente verifique!");
        }else if (object.getDescription() == null) {
            throw new InvalidParameterException("Informacion incompleta ,los campos deben llenarse correctamente verifique!");
        //}else if (object.getCorrectAnswer() == null) {
        //    throw new InvalidParameterException("Informacion incompleta ,los campos deben llenarse correctamente verifique!");
        }*/
        //ChoiceDTO correctAnswer = object.getCorrectAnswer();
        //object.setCorrectAnswer(null);
        UniQuestion ob = uniQuestionRepository.save(mapper.map(object, UniQuestion.class));
        if (ob == null) {
            throw new InternalServerErrorException("Error Interno intente de nuevo");
        }
        /*for(Choice obj : ob.getChoice()){
            if(obj.getDescription().equals(correctAnswer.getDescription())){
                ob.setCorrectAnswer(obj);
            }
        }
        ob = uniQuestionRepository.save(ob);*/
        return mapper.map(ob, UniQuestionDTO.class);
    }

    @Override
    public UniQuestionDTO get(Long id) {
        if (id == null) {
            throw new InvalidParameterException("Informacion incompleta ,los campos deben llenarse correctamente verifique!");
        }
        Optional<?> ob = uniQuestionRepository.findById(id);
        if (!ob.isPresent()) {
            throw new NotFoundException("Informacion no disponible, no se encontraron coicidencias");
        }
        return mapper.map(ob.get(), UniQuestionDTO.class);
    }

    @Override
    public List<UniQuestionDTO> getAll() {
        Iterable iterable = uniQuestionRepository.findAll();
        List<UniQuestionDTO> listOb = new ArrayList<>();
        if (iterable == null) {
            throw new NotContentException("Informacion no disponible, no se encontraron coicidencias");
        }
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            listOb.add(mapper.map(iterator, UniQuestionDTO.class));
        }
        return listOb;
    }

    @Override
    public Boolean delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UniQuestionDTO update(Long id, UniQuestionDTO object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
