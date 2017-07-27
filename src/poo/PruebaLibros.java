package poo;

import java.util.Arrays;

/**
 *
 * @author Sara Chamseddine
 */

public class PruebaLibros {
    
    public static void main(String[] args) {
        
        // Crear libros y añadirlos al conjunto
        
        ConjuntoLibros obj = new ConjuntoLibros();
        
        Libro libro1 = new Libro("Alice in Wonderland", "Lewis Carroll | Free Boo");
        libro1.setPaginas(320);
        libro1.setCalificacion(8);
        
        Libro libro2 = new Libro("El método Lean Startup", "Eric Ries");
        libro2.setPaginas(700);
        libro2.setCalificacion(7);
        
        obj.añadirLibro(libro1);
        obj.añadirLibro(libro2);
     
        // Mostrar libros
        
        obj.imprimir();
        
        // Mayor Calificación
        
        System.out.println("\nMayor puntuación: \n"+obj.mayorPuntuacion());
        
        // Menor Calificación
        
        System.out.println("\nMenor puntuación: \n"+obj.menorPuntuacion());
        
        // Cambiar calificación de libro2 a 8
        
        libro2.setCalificacion(8);
        
        // Agregar el mismo libro
        
        obj.añadirLibro(libro2);
        
        // Mayor Calificación
        
        System.out.println("\nMayor puntuación: \n"+obj.mayorPuntuacion());
        
        // Menor Calificación
        
        System.out.println("\nMenor puntuación: \n"+obj.menorPuntuacion());
        
        
    }
    
}
