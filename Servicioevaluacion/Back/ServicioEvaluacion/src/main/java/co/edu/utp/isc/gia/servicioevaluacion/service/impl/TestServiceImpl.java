/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.service.impl;

import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Test;
import co.edu.utp.isc.gia.servicioevaluacion.data.repository.TestRepository;
import co.edu.utp.isc.gia.servicioevaluacion.service.inter.BaseServiceInterface;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;


public class TestServiceImpl implements BaseServiceInterface<Test, Long> {

    @Autowired
    TestRepository testRepository;
    
    @Autowired
    ModelMapper mapper;

    public TestServiceImpl(TestRepository testRepository, ModelMapper mapper) {
        this.testRepository = testRepository;
        this.mapper = mapper;
    }
     
    @Override
    public Test save(Test object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Test get(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Test> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Test update(Long id, Test object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
