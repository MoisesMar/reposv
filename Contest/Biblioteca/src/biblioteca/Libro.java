/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author sebasvh
 */
public class Libro {
    private String isbn;
    private String autor;
    private String titulo;
    private Boolean prestado;

    public Libro(){
    }
    
    public Libro(String isbn, String autor, String titulo) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.prestado =false;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    //*** Metodos propios para el prestamo de libros
    public void devolverLibro(){
        this.prestado=false;
    }
    public void prestarLibro(){
        this.prestado=true;
    }
    
    //*** Retorna ya sea falso o verdadero
    public Boolean estaPrestado(){
        return prestado;
    }
    
    
    
}
