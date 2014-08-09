/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.springagosto.beans;

import com.tecsup.springagosto.model.Instrumento;
import com.tecsup.springagosto.model.Musico;
import java.util.List;
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
        //AppBean.valoresMetodos(context);
        //AppBean.referenciaListado(context);
        //AppBean.autoWireByName(context);
        AppBean.autoWire(context);
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
    
    public static void referenciaListado(ApplicationContext context){
        Musico musico =(Musico) context.getBean("jimmy");
        List<Instrumento> instrumentos = musico.getInstrumentos();
        for(Instrumento instrumento : instrumentos){
            System.out.println(instrumento.getMarca());
        }
    }
    
    public static void autoWireByName(ApplicationContext context){
        Musico musico =(Musico) context.getBean("noel");
        System.out.println(musico.getInstrumento().getMarca());
    }
    
    public static void autoWire(ApplicationContext context){
        Musico musico =(Musico) context.getBean("noel");
        System.out.println(musico.getInstrumento().getMarca());
        Musico cerati = (Musico) context.getBean("cerati");
        System.out.println(cerati.getInstrumento().getMarca());
        Musico charly = (Musico) context.getBean("charly");
        System.out.println(charly.getInstrumento().getMarca());
    }
    
}
