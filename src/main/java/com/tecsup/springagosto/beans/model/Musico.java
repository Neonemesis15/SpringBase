package com.tecsup.springagosto.beans.model;

import java.util.List;

public class Musico extends Persona {

    public Musico(int numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
    }

    private int numeroCanciones;

    public Musico() {
    }

    public Musico(Instrumento instrumento) {
        this.instrumento = instrumento;
    }
    
    private Instrumento instrumento;
    private List<Instrumento> instrumentos;
    
    public void setNumeroCanciones(int numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
    }

    public Musico(int numeroCanciones, Instrumento instrumento) {
        this.numeroCanciones = numeroCanciones;
        this.instrumento = instrumento;
    }
    
    

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    public void setInstrumentos(List<Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }
    
    public int getNumeroCanciones() {
        return numeroCanciones;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public List<Instrumento> getInstrumentos() {
        return instrumentos;
    }

}
