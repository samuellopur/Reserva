package org.tienda;

import java.time.LocalDateTime;

public class CitaMedica implements IReservable{
    private String nombre;


    public CitaMedica(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void reservar(Reserva reserva) {

    }

    @Override
    public String toString() {
        return "Cita{" +
                "Especiliadad='" + nombre + '\''  +
                '}';
    }
}
