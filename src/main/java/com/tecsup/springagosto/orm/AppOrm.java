package com.tecsup.springagosto.orm;

import com.tecsup.springagosto.orm.dao.ProgramaDAO;
import com.tecsup.springagosto.orm.model.Programa;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppOrm {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("hibernate_db.xml");
        //AppOrm.doAll(context);
        //AppOrm.doInsert(context);
        AppOrm.doDelete(context);
    }
    
    public static void doDelete(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        Programa programa = programaDAO.find(3L);
        programaDAO.delete(programa);
    }
    
    public static void doUpdate(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        Programa programa = new Programa();
        programa.setCodigo("888");
        programa.setNombre("Juan");
        programa.setDescripcion("Hola");
        programa.setId(3L);
        programaDAO.update(programa);
    }

    public static void doInsert(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        Programa programa = new Programa();
        programa.setCodigo("999");
        programa.setNombre("Pablo");
        programaDAO.save(programa);
    }

    public static void doAll(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        List<Programa> programas = programaDAO.all();

        for (Programa programa : programas) {
            System.out.println(programa.getNombre());
        }
    }
}
