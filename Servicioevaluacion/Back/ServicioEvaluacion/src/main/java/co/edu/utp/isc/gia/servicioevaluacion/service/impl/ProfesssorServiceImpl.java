/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.service.impl;

import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Professor;
import co.edu.utp.isc.gia.servicioevaluacion.service.inter.BaseServiceInterface;
import co.edu.utp.isc.gia.servicioevaluacion.web.dto.ProfessorDTO;
import java.util.List;


public class ProfesssorServiceImpl implements BaseServiceInterface<Professor, Long, ProfessorDTO> {

    @Override
    public ProfessorDTO save(Professor object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public ProfessorDTO update(Long id, Professor object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
