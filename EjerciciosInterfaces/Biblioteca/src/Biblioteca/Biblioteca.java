package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private ArrayList<Publicacion> publicaciones = new ArrayList<>();

    public void agregarPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

    public void listarPublicaciones() {
        for (Publicacion publicacion : publicaciones) {
            System.out.println(publicacion);
        }
    }

    public Publicacion buscarPublicacion(String codigo) {
        for (Publicacion publicacion : publicaciones) {
            if (publicacion.getCodigo().equals(codigo)) {
                return publicacion;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        biblioteca.agregarPublicacion(new Libro("L001", "El Quijote", 1605));
        biblioteca.agregarPublicacion(new Libro("L002", "Cien Años de Soledad", 1967));
        biblioteca.agregarPublicacion(new Revista("R001", "National Geographic", 2023, 5));
        biblioteca.agregarPublicacion(new Revista("R002", "Science", 2023, 9));

        while (true) {
            System.out.println("\nBienvenido a la biblioteca. Elige una opción:");
            System.out.println("1. Listar publicaciones");
            System.out.println("2. Prestar una publicación");
            System.out.println("3. Devolver una publicación");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                biblioteca.listarPublicaciones();
            } else if (opcion == 2) {
                System.out.println("Introduce el código de la publicación a prestar:");
                String codigo = scanner.next();
                Publicacion pub = biblioteca.buscarPublicacion(codigo);
                if (pub instanceof Prestable) {
                    ((Prestable) pub).prestar();
                } else {
                    System.out.println("La publicación no es prestable.");
                }
            } else if (opcion == 3) {
                System.out.println("Introduce el código de la publicación a devolver:");
                String codigo = scanner.next();
                Publicacion pub = biblioteca.buscarPublicacion(codigo);
                if (pub instanceof Prestable) {
                    ((Prestable) pub).devolver();
                } else {
                    System.out.println("La publicación no es prestable o no estaba prestada.");
                }
            } else if (opcion == 4) {
                System.out.println("Gracias por usar la biblioteca. ¡Hasta luego!");
                break;
            } else {
                System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}