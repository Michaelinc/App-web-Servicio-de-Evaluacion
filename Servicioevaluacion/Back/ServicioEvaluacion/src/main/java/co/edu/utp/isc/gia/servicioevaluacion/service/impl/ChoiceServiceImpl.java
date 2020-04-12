/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.service.impl;

import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Choice;
import co.edu.utp.isc.gia.servicioevaluacion.data.repository.ChoiceRepository;
import co.edu.utp.isc.gia.servicioevaluacion.exceptions.responses.BadRequestException;
import co.edu.utp.isc.gia.servicioevaluacion.exceptions.responses.InvalidParameterException;
import co.edu.utp.isc.gia.servicioevaluacion.service.inter.BaseServiceInterface;
import co.edu.utp.isc.gia.servicioevaluacion.web.dto.ChoiceDTO;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;


public class ChoiceServiceImpl implements BaseServiceInterface<Choice, Long, ChoiceDTO> {

    @Autowired
    ChoiceRepository choiceRepository;

    @Autowired
    ModelMapper mapper;

    public ChoiceServiceImpl(ChoiceRepository choiceRepository, ModelMapper mapper) {
        this.choiceRepository = choiceRepository;
        this.mapper = mapper;
    }
    
    @Override
    public ChoiceDTO save(Choice object) {
        if(object == null){
            throw new BadRequestException("Peticion sin cuerpo");
        }else if(object.getDescription() == null){
            throw new InvalidParameterException("Informacion incompleta, verifique que los campos esten completamente llenos!");
        }
        
        return mapper.map(choiceRepository.save(object),ChoiceDTO.class);
    }

    @Override
    public ChoiceDTO get(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ChoiceDTO> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ChoiceDTO update(Long id, Choice object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
