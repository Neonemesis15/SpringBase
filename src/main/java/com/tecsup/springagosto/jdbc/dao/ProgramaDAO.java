/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.springagosto.jdbc.dao;

import com.tecsup.springagosto.jdbc.helper.GenericDAO;
import com.tecsup.springagosto.jdbc.model.Programa;
import java.util.List;

/**
 *
 * @author SABADO-MANHANA
 */

public interface ProgramaDAO extends GenericDAO<Programa> {
    List<Programa> all();           // getALL
           
    void update(Programa programa);
    void save(Programa programa);
    void delete(long id);
    
    Programa find(int id);  
    Programa find(Long codigo);
    Programa find(String nombre, String codigo, String fecha);
}
