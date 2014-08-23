/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.springagosto.jdbc.dao;

import com.tecsup.springagosto.jdbc.model.Programa;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author SABADO-MANHANA
 */
public class ProgramaDAOJ extends JdbcDaoSupport implements ProgramaDAO{

    public List<Programa> all() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String query = "select * from programa";
        return this.getJdbcTemplate().query(query, new ProgramaRowMapper());
    
    }

    public Programa find(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "select * from programa where codigo = ?";
        Programa programa = (Programa) this.getJdbcTemplate().queryForObject(sql, new Object[]{id}, new ProgramaRowMapper());
        return programa;
    }

    public Programa find(Long codigo) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "select * from programa where codigo like '%?%' ";
        Programa programa = (Programa) this.getJdbcTemplate().queryForObject(sql, new Object[]{codigo}, new ProgramaRowMapper());
        return programa;
    
    }
    
    public void update(Programa programa) {

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "update programa set nombre=?, descripcion=?, codigo=? where id=?";
        try{
            this.getJdbcTemplate().update(sql,new Object[]{
            programa.getNombre(),
            programa.getDescripcion(),
            programa.getCodigo(),
            programa.getId()
            });    
        }catch(DataAccessException e){
                System.err.println("ERROR: " + e.getMessage());
            }
    }

    public void save(Programa programa) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "insert into programa (nombre, descripcion, codigo) values (?,?,?)";
        try{
            this.getJdbcTemplate().update(sql,new Object[]{
            programa.getNombre(),
            programa.getDescripcion(),
            programa.getCodigo()
            });    
            }
        catch(DataAccessException e){
                System.err.println("ERROR: " + e.getMessage());
            }    
    }

    public void delete(long id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //this.getJdbcTemplate().update("delete from programa where id=?", new Object[]{id});
    }

    public Programa find(String nombre, String codigo, String fecha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
