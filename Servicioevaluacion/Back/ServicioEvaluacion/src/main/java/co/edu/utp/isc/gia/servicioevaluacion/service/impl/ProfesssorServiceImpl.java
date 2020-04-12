/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.service.impl;

import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Professor;
import co.edu.utp.isc.gia.servicioevaluacion.data.repository.ChoiceRepository;
import co.edu.utp.isc.gia.servicioevaluacion.data.repository.ProfessorRepository;
import co.edu.utp.isc.gia.servicioevaluacion.exceptions.responses.BadRequestException;
import co.edu.utp.isc.gia.servicioevaluacion.exceptions.responses.InternalServerErrorException;
import co.edu.utp.isc.gia.servicioevaluacion.exceptions.responses.InvalidParameterException;
import co.edu.utp.isc.gia.servicioevaluacion.service.inter.BaseServiceInterface;
import co.edu.utp.isc.gia.servicioevaluacion.web.dto.ChoiceDTO;
import co.edu.utp.isc.gia.servicioevaluacion.web.dto.ProfessorDTO;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;


public class ProfesssorServiceImpl implements BaseServiceInterface<ProfessorDTO, Long> {
    
    @Autowired
    ProfessorRepository professorRepository;

    @Autowired
    ModelMapper mapper;

    public ProfesssorServiceImpl(ProfessorRepository professorRepository, ModelMapper mapper) {
        this.professorRepository = professorRepository;
        this.mapper = mapper;
    }
    
    @Override
    public ProfessorDTO save(ProfessorDTO object) {
        if (object == null) {
            throw new BadRequestException("Peticion sin cuerpo");
        } else if (object.getId() == null) {
            throw new InvalidParameterException("Informacion incompleta ,los campos deben llenarse correctamente verifique!");
        }else if (object.getName() == null) {
            throw new InvalidParameterException("Informacion incompleta ,los campos deben llenarse correctamente verifique!");
        }
        Professor ob = professorRepository.save(mapper.map(object, Professor.class));
        if (ob == null) {
            throw new InternalServerErrorException("Error Interno intente de nuevo");
        }
        return mapper.map(ob, ProfessorDTO.class);
    }

    @Override
    public ProfessorDTO get(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProfessorDTO> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProfessorDTO update(Long id, ProfessorDTO object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
