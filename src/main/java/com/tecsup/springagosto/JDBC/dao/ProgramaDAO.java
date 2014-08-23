/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.springagosto.JDBC.dao;

import com.tecsup.springagosto.JDBC.model.Programa;
import com.tecsup.springagosto.helper.GenericDAO;
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
