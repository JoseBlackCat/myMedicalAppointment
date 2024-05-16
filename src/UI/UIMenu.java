package UI;

import java.util.Scanner;

public class UIMenu {
    public static final String[] MESES_DISPONIBLES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void mostrarMenu() {
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Paciente");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    mostrarMenuDelPaciente();

                    break;
                case 0:
                    System.out.println("Gracias por su visita!");
                    break;
                default:
                    System.out.println("Debe seleccionar una opcion correcta.");
            }
        } while (response != 0);
    }

    public static void mostrarMenuDelPaciente() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Paciente");
            System.out.println("1. Reservar una cita");
            System.out.println("2. Mi cita");
            System.out.println("0. Volver");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Reservar una cita");
                    for (int indice = 0; indice < 3; indice++) {
                        System.out.println((indice + 1) + ". " + MESES_DISPONIBLES[indice]);
                    }
                    break;
                case 2:
                    System.out.println("::Mi cita");
                    break;
                case 0:
                    mostrarMenu();
                    break;
            }
        } while (response != 0);
    }
}
