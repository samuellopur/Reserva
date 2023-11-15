package org.tienda;

public class Hotel implements IReservable{
    private String nombre;
    private int capacidad;

    public Hotel(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void reservar(Reserva reserva) {

    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nombre='" + nombre + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
