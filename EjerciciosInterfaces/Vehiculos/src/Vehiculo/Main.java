package Vehiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Desea conducir un Auto o una Moto? (A/M)");
        String eleccion = scanner.nextLine().toUpperCase();

        Vehiculo vehiculo;
        if (eleccion.equals("A")) {
            vehiculo = new Auto(0); 
            System.out.println("Ha elegido un Auto.");
        } else if (eleccion.equals("M")) {
            vehiculo = new Moto(0); 
            System.out.println("Ha elegido una Moto.");
        } else {
            System.out.println("Selección no válida.");
            scanner.close();
            return;
        }

        System.out.print("Ingrese la cantidad de gasolina para tanquear: ");
        int cantidadGasolina = scanner.nextInt();
        if (vehiculo.retanquear(cantidadGasolina)) {
            System.out.println("Tanqueo exitoso. ¿Desea agregar más gasolina? (S/N)");
            scanner.nextLine(); 
            String respuesta = scanner.nextLine().toUpperCase();
            if (respuesta.equals("S")) {
                System.out.print("Ingrese la cantidad de gasolina adicional para tanquear: ");
                int cantidadAdicional = scanner.nextInt();
                vehiculo.retanquear(cantidadAdicional);
            }
        }

        vehiculo.conducir();

        scanner.close();
    }
}