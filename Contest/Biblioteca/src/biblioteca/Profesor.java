/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;

/**
 *
 * @author sebasvh
 */
public class Profesor extends Persona{
    private  ArrayList<String> materias;

    public Profesor(String nombre, String apellido, int cedula) {
        super(nombre,apellido,cedula,"Profesor");
        this.materias = new ArrayList();
    }
    
    public void addMateria(String materia){
        materias.add(materia);
    }
    
    public String getMateria(int index){
        return materias.get(index);
    }
    
    @Override
    public Boolean puedePrestarLibro(){
        if(this.getNumeroLibrosPrestados()>12){
            return false;
        }
        return true;
    }
    
    
    @Override
    public String toString(){
        String cad =       "Nombre:"+this.getNombre()+
                           " Apellido:"+this.getNombre()+
                           " Identificacion:"+this.getIdentificacion()+
                           " Numero de libros:"+this.getNumeroLibrosPrestados()+
                           " Tipo:"+this.getTipoPersona();
        return cad;
    }
    
   
    @Override
    public int generarMulta(){
        this.valorMultas+=500;
        return this.valorMultas;
    }
    
}
