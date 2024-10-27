package Biblioteca;

class Revista extends Publicacion implements Prestable {
    private int numero;
    private boolean estaPrestado;

    public Revista(String codigo, String titulo, int anioPublicacion, int numero) {
        super(codigo, titulo, anioPublicacion);
        this.numero = numero;
        this.estaPrestado = false;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public void prestar() {
        if (!estaPrestado) {
            estaPrestado = true;
            System.out.println("La revista ha sido prestada.");
        } else {
            System.out.println("La revista ya está prestada.");
        }
    }

    @Override
    public void devolver() {
        if (estaPrestado) {
            estaPrestado = false;
            System.out.println("La revista ha sido devuelta.");
        } else {
            System.out.println("La revista no estaba prestada.");
        }
    }

    @Override
    public boolean prestado() {
        return estaPrestado;
    }

    @Override
    public String toString() {
        return "Revista [Codigo: " + codigo + ", Titulo: " + titulo + ", Año: " + anioPublicacion + ", Numero: " + numero + ", Prestado: " + estaPrestado + "]";
    }
}