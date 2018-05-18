package models;

import enums.Estado;
import interfaces.Observador;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private List<Observador> observadores;
    private Estado estado;

    public Alumno() {
        this.observadores = new ArrayList<>();
        this.estado = Estado.APROBADO;
    }

    public void agregarObservador(Observador o){
        observadores.add(o);
    }

    public void removerObservador(Observador o){
        observadores.remove(o);
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
        if (estado == Estado.REPROBADO)
            notificar();
    }

    public void notificar(){
        for (Observador o: observadores) {
            o.actualizar();
        }
    }
}
