/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.springagosto.JDBC.dao;

import com.tecsup.springagosto.JDBC.model.Programa;
import java.util.List;

/**
 *
 * @author SABADO-MANHANA
 */
public interface ProgramaDAO {
    List<Programa> all();           // getALL
    Programa find(long id);         
    void update(Programa programa);
    void save(Programa programa);
    void delete(Programa programa);
    Programa find(String nombre);
    Programa find(String nombre, String codigo, String fecha);
    
}
