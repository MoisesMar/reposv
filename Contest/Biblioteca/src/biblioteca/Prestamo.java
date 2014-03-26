/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;
import java.util.ArrayList;


public class Prestamo {
    
    private int fechaSalida;
    private int fechaDevolucion;
    private int idUsuario; 
    private String codigoLibro;
    
    private ArrayList<String> codigosLibrosPrestados; 
    
    public Prestamo(int idUsuario, String codigoLibro, int fechaSalida){
        this.idUsuario = idUsuario;
        this.fechaSalida=fechaSalida;
        this.codigoLibro=codigoLibro;
        this.fechaDevolucion = fechaSalida+5;
        this.codigosLibrosPrestados = new ArrayList();
    }

    public int getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(int fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(int fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    
    public void addLibro(String codigoLibro){
        codigosLibrosPrestados.add(codigoLibro);
    }
    
    public void devolverLibro(){
    }
    
    public void multa(){
    }
    
}
