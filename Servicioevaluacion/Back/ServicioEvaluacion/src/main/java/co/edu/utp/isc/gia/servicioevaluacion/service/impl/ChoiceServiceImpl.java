/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.service.impl;

import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Choice;
import co.edu.utp.isc.gia.servicioevaluacion.data.repository.ChoiceRepository;
import co.edu.utp.isc.gia.servicioevaluacion.exceptions.responses.BadRequestException;
import co.edu.utp.isc.gia.servicioevaluacion.exceptions.responses.InternalServerErrorException;
import co.edu.utp.isc.gia.servicioevaluacion.exceptions.responses.InvalidParameterException;
import co.edu.utp.isc.gia.servicioevaluacion.exceptions.responses.NotContentException;
import co.edu.utp.isc.gia.servicioevaluacion.exceptions.responses.NotFoundException;
import co.edu.utp.isc.gia.servicioevaluacion.service.inter.BaseServiceInterface;
import co.edu.utp.isc.gia.servicioevaluacion.web.dto.ChoiceDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class ChoiceServiceImpl implements BaseServiceInterface<ChoiceDTO, Long> {

    @Autowired
    ChoiceRepository choiceRepository;

    @Autowired
    ModelMapper mapper;

    public ChoiceServiceImpl(ChoiceRepository choiceRepository, ModelMapper mapper) {
        this.choiceRepository = choiceRepository;
        this.mapper = mapper;
    }

    @Override
    public ChoiceDTO save(ChoiceDTO object) {
        if (object == null) {
            throw new BadRequestException("Peticion sin cuerpo");
        } else if (object.getDescription() == null) {
            throw new InvalidParameterException("Informacion incompleta ,los campos deben llenarse correctamente verifique!");
        }
        Choice ob = choiceRepository.save(mapper.map(object,Choice.class));
        if (ob == null) {
            throw new InternalServerErrorException("Error Interno intente de nuevo");
        }
        return mapper.map(ob, ChoiceDTO.class);
    }

    @Override
    public ChoiceDTO get(Long id) {
        if (id == null) {
            throw new InvalidParameterException("Informacion incompleta ,los campos deben llenarse correctamente verifique!");
        }
        Optional<?> ob = choiceRepository.findById(id);
        if (!ob.isPresent()) {
            throw new NotFoundException("Informacion no disponible, no se encontraron coicidencias");
        }
        return mapper.map(ob.get(), ChoiceDTO.class);
    }

    @Override
    public List<ChoiceDTO> getAll() {
        Iterable iterable = choiceRepository.findAll();
        List<ChoiceDTO> listOb = new ArrayList<>();
        if(iterable == null){
            throw new NotContentException("Informacion no disponible, no se encontraron coicidencias");
        }
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            listOb.add(mapper.map(iterator, ChoiceDTO.class));
        }
        return listOb;
    }

    @Override
    public Boolean delete(Long id) {
        ChoiceDTO ob = get(id);
        try {
            choiceRepository.delete(mapper.map(ob, Choice.class));
            return true;
        } catch (Exception e) {
            throw new InternalServerErrorException("Error Interno intente de nuevo");
        }
    }

    @Override
    public ChoiceDTO update(Long id, ChoiceDTO object) {
        if(id == null){
            throw new InvalidParameterException("Informacion incompleta ,los campos deben llenarse correctamente verifique!");
        }else if (object == null) {
            throw new BadRequestException("Peticion sin cuerpo");
        }else if (object.getDescription() == null) {
            throw new InvalidParameterException("Informacion incompleta ,los campos deben llenarse correctamente verifique!");
        }
        if(!choiceRepository.existsById(id)){
            throw new NotFoundException("Informacion no disponible, no se encontraron coicidencias");
        }
        object.setId(id);
        return save(object);
    }

}
