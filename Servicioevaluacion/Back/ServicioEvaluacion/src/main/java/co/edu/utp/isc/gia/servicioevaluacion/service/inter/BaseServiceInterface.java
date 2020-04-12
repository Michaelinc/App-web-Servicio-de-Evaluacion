/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.service.inter;

import java.util.List;

/**
 *
 * @author Michael
 * @param <Type>
 * @param <Key>
 * @param <TypeReturn>
 */
public interface BaseServiceInterface <Type,Key,TypeReturn>{
    
    TypeReturn save(Type object);
    TypeReturn get(Key id);
    List<TypeReturn> getAll();
    Boolean delete(Key id);
    TypeReturn update(Key id, Type object);
}
