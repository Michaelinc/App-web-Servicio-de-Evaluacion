/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.service.impl;

import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Solution;
import co.edu.utp.isc.gia.servicioevaluacion.service.inter.BaseServiceInterface;
import co.edu.utp.isc.gia.servicioevaluacion.web.dto.SolutionDTO;
import java.util.List;


public class SolutionServiceImpl implements BaseServiceInterface<Solution, Long, SolutionDTO> {

    @Override
    public SolutionDTO save(Solution object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SolutionDTO get(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SolutionDTO> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SolutionDTO update(Long id, Solution object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
