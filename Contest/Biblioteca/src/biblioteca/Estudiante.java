/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

public class Estudiante extends Persona{
    
    private int grado;

    public Estudiante( String nombre, String apellido, int cedula, int grado) {
        super(nombre,apellido,cedula,"Estudiante");
        this.grado=grado;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
    
    public void verEstudiante(){
        System.out.println("Nombre:"+this.getNombre()+
                           " Apellido:"+this.getNombre()+
                           " Identificacion:"+this.getIdentificacion()+
                           " Grado:"+this.getGrado()+
                           " Numero de libros:"+this.getNumeroLibrosPrestados());
    }
    
    @Override
    public String toString(){
        String cad = "Nombre:"+this.getNombre()+
                           " Apellido:"+this.getNombre()+
                           " Identificacion:"+this.getIdentificacion()+
                           " Grado:"+this.getGrado()+
                           " Numero de libros:"+this.getNumeroLibrosPrestados()+
                           " Tipo:"+this.getTipoPersona();
        return cad;
    }
    
    
    
    @Override
    public Boolean puedePrestarLibro(){
        if(this.getNumeroLibrosPrestados()>6){
            return false;
        }
        return true;
    }
    
    @Override
    public int generarMulta(){
        this.valorMultas+=1000;
        return this.valorMultas;
    }
    
    
    
}
