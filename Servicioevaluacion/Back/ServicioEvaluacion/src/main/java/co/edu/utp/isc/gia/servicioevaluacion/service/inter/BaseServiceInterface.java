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
 */
public interface BaseServiceInterface <Type,Key>{
    
    Type save(Type object);
    Type get(Key id);
    List<Type> getAll();
    Boolean delete(Key id);
    Type update(Key id, Type object);
}
