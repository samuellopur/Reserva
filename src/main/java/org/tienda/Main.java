package org.tienda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        SistemaReservas sistemaReservas = new SistemaReservas();
        Menu menu = new Menu(sistemaReservas, scanner);



        while (true) {
            Menu.displayMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Menu.reservarHotel();
                    Menu.displayMenu();
                    break;
                case 2:
                    Menu.reservarCita();
                    break;
                case 3:
                    Menu.reservarMesaRestaurante();
                    return;
                case 4:
                    System.out.println("Saliendo del programa");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número entre 1 y 3.");
            }
        }
    }
}