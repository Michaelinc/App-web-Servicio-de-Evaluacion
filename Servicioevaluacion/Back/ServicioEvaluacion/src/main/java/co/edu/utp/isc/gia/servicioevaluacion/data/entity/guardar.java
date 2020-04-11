/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.data.entity;

import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Question.UniQuestion;
import co.edu.utp.isc.gia.servicioevaluacion.data.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Michael
 */
public class guardar {
    
    public static  Test test;
    public static UniQuestion uniQ;
    public static Option op;
    public static  Professor pro;
    
    @Autowired
    public static ProfessorRepository prorepo;
    public static void g (){
        pro = new Professor();
        pro.setName("Michael");
        prorepo.save(pro);
    }

    
}
