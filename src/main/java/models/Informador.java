package models;

import interfaces.Observador;

public class Informador implements Observador{
    @Override
    public void actualizar() {
        System.out.println("El Juanito reprobo, no manches...");
    }
}
