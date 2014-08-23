package com.tecsup.springagosto.orm;

import com.tecsup.springagosto.orm.dao.ProgramaDAO;
import com.tecsup.springagosto.orm.model.Programa;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppOrm {

    public static void main (String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("hibernate_db.xml");
        AppOrm.doAll(context);
    }
    
    public static void doAll(ApplicationContext context){
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        List<Programa> programas = programaDAO.all();
        
        for(Programa programa:programas){
            System.out.println(programa.getNombre());
        }
    }
    
}
