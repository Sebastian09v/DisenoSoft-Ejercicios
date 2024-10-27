package Biblioteca;

class Libro extends Publicacion implements Prestable {
    private boolean estaPrestado;

    public Libro(String codigo, String titulo, int anioPublicacion) {
        super(codigo, titulo, anioPublicacion);
        this.estaPrestado = false;
    }

    @Override
    public void prestar() {
        if (!estaPrestado) {
            estaPrestado = true;
            System.out.println("El libro ha sido prestado.");
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    @Override
    public void devolver() {
        if (estaPrestado) {
            estaPrestado = false;
            System.out.println("El libro ha sido devuelto.");
        } else {
            System.out.println("El libro no estaba prestado.");
        }
    }

    @Override
    public boolean prestado() {
        return estaPrestado;
    }

    @Override
    public String toString() {
        return "Libro [Codigo: " + codigo + ", Titulo: " + titulo + ", Año: " + anioPublicacion + ", Prestado: " + estaPrestado + "]";
    }
}