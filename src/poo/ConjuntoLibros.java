package poo;

/**
 *
 * @author Sara Chamseddine
 */
public class ConjuntoLibros {

    private Libro[] libros = new Libro[10];
    private int contador = 0;

    public Libro[] getLibros() {
        return libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    public void añadirLibro(Libro libro) {
        for (int i = 0; i < contador; i++) {
            Libro aux = libros[i];
            if ((libro.getAutor()).equals(aux.getAutor()) && (libro.getTitulo()).equals(aux.getTitulo())) {
                throw new IllegalArgumentException("Autor y libro ya existentes.");
            }
        }
        libros[contador] = libro;
        contador++;
        if (contador >= 11) {
            throw new IndexOutOfBoundsException("Se ha superado la cantidad máxima de libros.");
        }
    }

    public Libro mayorPuntuacion() {
        int puntaje = 0;
        int posicion = 0;
        for (int i = 0; i < contador; i++) {
            Libro libro = libros[i];
            if (i == 0) {
                puntaje = libro.getCalificacion();
            } else {
                if (libro.getCalificacion() > puntaje) {
                    posicion = i;
                    puntaje = libro.getCalificacion();
                }
            }
        }
        return libros[posicion];
    }

    public Libro menorPuntuacion() {
        int puntaje = 10;
        int posicion = 0;
        for (int i = 0; i < contador; i++) {
            Libro libro = libros[i];
            if (i == 0) {
                puntaje = libro.getCalificacion();
            } else {
                if (libro.getCalificacion() < puntaje) {
                    posicion = i;
                    puntaje = libro.getCalificacion();
                }
            }
        }
        return libros[posicion];
    }

    public void imprimir() {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                Libro libro = libros[i];
                System.out.println(libro.toString());
            }
        }
    }

}
