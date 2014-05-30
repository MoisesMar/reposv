package biblioteca;
import java.util.ArrayList;


public class Prestamo {
    
    private int fechaSalida;
    private int fechaDevolucion;
    private int idUsuario; 
    private String codigoLibro;//Es el isbn
    private Fecha Salida;
    private Fecha devolucion;
    
    //private ArrayList<String> codigosLibrosPrestados; 
    
    public Prestamo(int idUsuario, String codigoLibro, int fechaSalida,int  fechaDevolucion){
        this.idUsuario = idUsuario;
        this.fechaSalida=fechaSalida;
        this.codigoLibro=codigoLibro;
        this.fechaDevolucion = fechaDevolucion;
//        this.codigosLibrosPrestados = new ArrayList();
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

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

     
    public void devolverLibro(){
    }
    
    public void multa(){
    }
    
    public String toString(){
             return String.format("%d %s %d %d", idUsuario, codigoLibro, fechaSalida, fechaDevolucion);
    }
    
}
