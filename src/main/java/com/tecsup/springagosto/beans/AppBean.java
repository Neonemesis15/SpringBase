/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.springagosto.beans;

import com.tecsup.springagosto.model.Musico;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author SABADO-TARDE
 */
public class AppBean {
    
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        //AppBean.valoresConstructor(context);
        //AppBean.referenciaConstructor(context);
        AppBean.valoresMetodos(context);
    }

    public static void valoresMetodos(ApplicationContext context){
    Musico musico = (Musico) context.getBean("lennon");
    System.out.println(musico.getNombres()+" Canciones: "+ musico.getNumeroCanciones());
    }

    public static void valoresConstructor(ApplicationContext context){
        Musico musico = (Musico) context.getBean("bob");
        System.out.println(musico.getNumeroCanciones());
    }
    
    public static void referenciaConstructor(ApplicationContext context){
    Musico musico = (Musico) context.getBean("slash");
    System.out.println(musico.getInstrumento().getMarca());
    }
}
