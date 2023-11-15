package org.tienda;

public class Restautante implements IReservable{

    private String nombre;

    private int numeroComensales;

    public Restautante(String nombre, int numeroComensales) {
        this.nombre = nombre;
        this.numeroComensales = numeroComensales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroComensales() {
        return numeroComensales;
    }

    public void setNumeroComensales(int numeroComensales) {
        this.numeroComensales = numeroComensales;
    }

    @Override
    public void reservar(Reserva reserva) {

    }

    @Override
    public String toString() {
        return "Reserva realizaza con exito{" +
                "Restaurante='" + nombre + '\'' +
                ", numeroComensales=" + numeroComensales +
                '}';
    }
}
