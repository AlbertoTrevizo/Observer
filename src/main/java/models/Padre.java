package models;

import interfaces.Observador;

public class Padre implements Observador{
    @Override
    public void actualizar() {
        System.out.println("Hijo malcriado... te haz ganado unas nalgadas");
    }
}
