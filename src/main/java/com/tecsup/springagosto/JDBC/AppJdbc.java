/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.springagosto.JDBC;

import com.tecsup.springagosto.JDBC.dao.ProgramaDAO;
import com.tecsup.springagosto.JDBC.model.Programa;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author SABADO-MANHANA
 */
public class AppJdbc {
    public static void main( String[] args )
    {
     ApplicationContext context = new ClassPathXmlApplicationContext("jdbc_db.xml");
     ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        Programa programa = programaDAO.find(1);
        System.out.println(programa.getNombre());
     AppJdbc.doList(context);
     //AppJdbc.doFindByCodigo(context, 2L);
    }
    
    public static void doList(ApplicationContext context){
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        List<Programa> programas = programaDAO.all();
        for(Programa programa:programas){
            System.out.println(programa.getCodigo());
        }
    }
    public static void doFindByCodigo(ApplicationContext context,int codigo){
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        Programa programa = programaDAO.find(codigo);
        System.out.println(programa.getCodigo());
    }
    
     
}
