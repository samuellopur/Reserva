package org.tienda;

public class Reserva {
    private String nombre;
    private String documento;
    private String numeroContacto;
    private String fechaHora;
    private IReservable reservable;

    // Constructor, getters y setters

    public Reserva(String nombre, String documento, String numeroContacto, String fechaHora, IReservable reservable) {
        this.nombre = nombre;
        this.documento = documento;
        this.numeroContacto = numeroContacto;
        this.fechaHora = fechaHora;
        this.reservable = reservable;


    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getDocumento() {

        return documento;
    }

    public void setDocumento(String documento) {

        this.documento = documento;
    }

    public String getNumeroContacto() {

        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {

        this.numeroContacto = numeroContacto;
    }

    public String getFechaHora() {

        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {

        this.fechaHora = fechaHora;
    }

    public IReservable getReservable() {

        return reservable;
    }

    public void setReservable(IReservable reservable) {

        this.reservable = reservable;
    }

    @Override
    public String toString() {
        return "Reserva realizada con exito {" +
                "nombre='" + nombre + '\'' +
                ", documento='" + documento + '\'' +
                ", numeroContacto='" + numeroContacto + '\'' +
                ", fechaHora=" + fechaHora +
                ", reservable=" + reservable +
                '}';
    }
}