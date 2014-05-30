/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

public class Estudiante extends Persona{
    
    public int grado;

    public Estudiante( String nombre, String apellido, int cedula, int grado) {
        super(nombre,apellido,cedula,"Estudiante");
        this.grado=grado;
    }

    @Override
    public String getGrado() {
        return "Grado:"+grado;
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
    
//    @Override
//    public String toString(){
//        String cad = "Nombre:"+this.getNombre()+
//                           " Apellido:"+this.getNombre()+
//                           " Identificacion:"+this.getIdentificacion()+
//                           " Grado:"+this.getGrado()+
//                           " Numero de libros:"+this.getNumeroLibrosPrestados()+
//                           " Tipo:"+this.getTipoPersona();
//        return cad;
//    }
    
    @Override
    public String toString(){
        String cad = "(E) "+this.getNombre()+" "+this.getApellido()+", Id:"+this.getIdentificacion();
        return cad;
    }
    
    
    
    @Override
    public Boolean puedePrestarLibro(){
        if(this.getNumeroLibrosPrestados()>=1){
            return false;
        }
        return true;
    }
    
    @Override
    public int generarMulta(int diasPasados){
        this.valorMultas+=1000*diasPasados;
        return 1000;
    }
    
    
    
}
