package org.tienda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Menu {

    private static SistemaReservas sistemaReservas;
    static Scanner scanner;

    public Menu(SistemaReservas sistemaReservas, Scanner scanner) {
        this.sistemaReservas = sistemaReservas;
        this.scanner = scanner;
    }

    public static void displayMenu() {
       String text = """
                   ±-----------------------------------------±
                   |          Registro de reservas           |
                   |       1. Reseva hotel                   |
                   |       2. Reserva cita medica            |
                   |       3. Reserva restaurante            |
                   |       4. Salir                          |
                   ±-----------------------------------------±
                   Digita una opcion:
                   """;

        System.out.println(text);
    }

    public static void reservarHotel() {
        System.out.println("\n±----------------------------------------±" +
                           "\nReservar hotel:" +
                           "\n±----------------------------------------±");
        System.out.println("Ingrese nombres:");
        String nombreReservaHotel = scanner.nextLine();
        System.out.println("Ingrese su documento:");
        String documentoReservaHotel = scanner.nextLine();
        System.out.println("Ingrese su número de contacto:");
        String numeroContactoReservaHotel = scanner.nextLine();
        System.out.println("Ingrese la fecha y hora de la reserva (yyyy-MM-dd HH:mm):");
        String fechaHoraReservaHotel = scanner.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date fechaHoraReservaFormateada;

        while (true) {
            try {
                fechaHoraReservaFormateada = formatter.parse(fechaHoraReservaHotel);
                break;
            } catch (ParseException e) {
                System.out.println("Formato de fecha y hora inválido. Por favor, ingrese la fecha y hora en el formato yyyy-MM-dd HH:mm.");
                fechaHoraReservaHotel = scanner.nextLine();
            }
        }

        System.out.println("Ingrese el nombre del hotel:");
        String nombreHotel = scanner.nextLine();
        System.out.println("Ingrese numero de huespedes:");
        int capacidadHotel = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea restante
        IReservable hotel = new Hotel(nombreHotel, capacidadHotel);
        Reserva reservaHotel = new Reserva(nombreReservaHotel, documentoReservaHotel, numeroContactoReservaHotel, fechaHoraReservaHotel, hotel);
        SistemaReservas.hacerReserva(hotel, reservaHotel);
        SistemaReservas.imprimirReservas();

    }


    public static void reservarCita(){
        System.out.println("\n±----------------------------------------±" +
                           "\nReservar cita medica:" +
                           "\n±----------------------------------------±");

        System.out.println("Ingrese su nombre:");
        String nombreReservaCitaMedica = scanner.nextLine();
        System.out.println("Ingrese su documento:");
        String documentoReservaCitaMedica = scanner.nextLine();
        System.out.println("Ingrese su número de contacto:");
        String numeroContactoReservaCitaMedica = scanner.nextLine();
        System.out.println("Ingrese la fecha y hora de la cita (yyyy-MM-dd HH:mm):");
        String fechaHoraReservaCitaMedica = scanner.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date fechaHoraReservaFormateada;

        while (true) {
            try {
                fechaHoraReservaFormateada = formatter.parse(fechaHoraReservaCitaMedica);
                break;
            } catch (ParseException e) {
                System.out.println("Formato de fecha y hora inválido. Por favor, ingrese la fecha y hora en el formato yyyy-MM-dd HH:mm.");
                fechaHoraReservaCitaMedica = scanner.nextLine();
            }
        }
        System.out.println("Ingrese especialidad solicitada:");
        String nombreCitaMedica = scanner.nextLine();
        IReservable citaMedica = new CitaMedica(nombreCitaMedica);
        Reserva reservaCitaMedica = new Reserva(nombreReservaCitaMedica, documentoReservaCitaMedica, numeroContactoReservaCitaMedica, fechaHoraReservaCitaMedica, citaMedica);
        SistemaReservas.hacerReserva(citaMedica, reservaCitaMedica);
        SistemaReservas.imprimirReservas();
    }

    public static void reservarMesaRestaurante(){
        System.out.println("\n±----------------------------------------±" +
                "\nReservar mesa restaurante:" +
                "\n±----------------------------------------±");

        System.out.println("Ingrese su nombre:");
        String nombreCliente = scanner.nextLine();
        System.out.println("Ingrese su documento:");
        String documento = scanner.nextLine();
        System.out.println("Ingrese su número de contacto:");
        String numeroContacto = scanner.nextLine();
        System.out.println("Ingrese la fecha y hora de la reserva (yyyy-MM-dd HH:mm):");
        String fechaHoraReserva = scanner.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date fechaHoraReservaFormateada;

        while (true) {
            try {
                fechaHoraReservaFormateada = formatter.parse(fechaHoraReserva);
                break;
            } catch (ParseException e) {
                System.out.println("Formato de fecha y hora inválido. Por favor, ingrese la fecha y hora en el formato yyyy-MM-dd HH:mm.");
                fechaHoraReserva = scanner.nextLine();
            }
        }
        System.out.println("Ingrese nombre del restaurante:");
        String nombreRestautante = scanner.nextLine();
        System.out.println("Ingrese numero de comensales:");
        int numeroComensales = scanner.nextInt();
        IReservable restaurante = new Restautante(nombreRestautante, numeroComensales);
        Reserva reservaRestaurante = new Reserva(nombreCliente, documento, numeroContacto, fechaHoraReserva, restaurante);
        SistemaReservas.hacerReserva(restaurante, reservaRestaurante);
        SistemaReservas.imprimirReservas();
    }

}
