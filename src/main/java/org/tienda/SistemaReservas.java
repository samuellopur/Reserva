package org.tienda;

import java.util.ArrayList;
import java.util.List;

public class SistemaReservas {
    private static List<Reserva> reservas = new ArrayList<>();

    public static void hacerReserva(IReservable reservable, Reserva reserva) {
        reservable.reservar(reserva);
        reservas.add(reserva);
    }

    public static void imprimirReservas() {
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }
}
