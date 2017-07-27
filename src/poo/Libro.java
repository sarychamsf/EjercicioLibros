package poo;

/**
 *
 * @author Sara Chamseddine
 */

public class Libro {

    private String titulo = "";
    private String autor = "";
    private int paginas = 0;
    private int calificacion = 0;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        String s;
        s = "Título: " + getTitulo() + ", Autor: " + getAutor() + ", Páginas: "
                + getPaginas() + ", Calificación: " + getCalificacion() + ".";
        return s;
    }

}
