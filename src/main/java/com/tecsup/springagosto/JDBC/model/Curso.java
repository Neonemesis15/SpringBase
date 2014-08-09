/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.springagosto.JDBC.model;

import java.util.Date;

/**
 *
 * @author SABADO-MANHANA
 */
public class Curso {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Long getId_programa() {
        return id_programa;
    }

    public void setId_programa(Long id_programa) {
        this.id_programa = id_programa;
    }

  
    public Long id;
    public String nombre;
    public String codigo;
    public Date fecha_inicio;
    public Long id_programa;
}
