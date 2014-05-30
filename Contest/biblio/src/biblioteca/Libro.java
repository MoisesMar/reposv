package biblioteca;

public class Libro {
    private String isbn;
    private String autor;
    private String titulo;
    private Boolean prestado;
    private int maximoDias;

    public Libro(){
    }
    
    public Libro(String isbn, String autor, String titulo, int maximoDias) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.prestado =false;
        this.maximoDias =maximoDias;
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

    public int getMaximoDias() {
        return maximoDias;
    }

    public void setMaximoDias(int maximoDias) {
        this.maximoDias = maximoDias;
    }
    
    
//    @Override
//    public String toString(){
//        String cad= "Objeto libro, isbn:"+isbn+" Autor:"+autor+" titulo:"+titulo+"   Mas informacion........";
//        return cad;
//    }
    @Override
    public String toString(){
        String cad= titulo+" "+autor+" "+isbn;
        return cad;
    }
    
    
}
