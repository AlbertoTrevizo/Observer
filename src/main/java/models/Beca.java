package models;

import interfaces.Observador;

public class Beca implements Observador{
    @Override
    public void actualizar() {
        System.out.println("Beca cancelada...");
    }
}
