package Biblioteca;

abstract class Publicacion {
    protected String codigo;
    protected String titulo;
    protected int anioPublicacion;

    public Publicacion(String codigo, String titulo, int anioPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public abstract String toString();
}