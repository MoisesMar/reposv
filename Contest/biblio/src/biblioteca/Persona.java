/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;


public class Persona {
    protected String tipoPersona;
    protected String nombre;
    protected String apellido;
    protected int identificacion;
//    protected int Grado;
//    protected String Materia;
    
    //** Datos para manejar los libros prestados en la Biblioteca 
    protected int numeroLibrosPrestados=0;
    protected int valorMultas=0;

    public Persona() {
    }
    
    public Persona(String nombre, String apellido, int cedula, String tipoPersona) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = cedula;
        this.tipoPersona = tipoPersona;
//        this.Grado = Grado;
//        this.Materia = Materia;
        
    }

//    public int getGrado() {
//        return Grado;
//    }
//
//    public void setGrado(int Grado) {
//        this.Grado = Grado;
//    }

//    public String getMateria() {
//        return Materia;
//    }
//
//    public void setMateria(String Materia) {
//        this.Materia = Materia;
//    }
    
    public String getMateria(int index){
        return "";
    }
     
    public String getGrado() {
       return "gradoPersona";
    }

       
    public String nombre(){
       return this.nombre;
    }
    

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    
    
    //*** Metodos para controlar el numero de lisbros prestados por persona
    //*** En el objeto estudiante se pone la restriccion de 6
    //*** En el objeto Profesor se pone la restriccion de 12
    public int getNumeroLibrosPrestados() {
        return numeroLibrosPrestados;
    }

    public void setNumeroLibrosPrestados(int numeroLibrosPrestados) {
        this.numeroLibrosPrestados = numeroLibrosPrestados;
    }
    
    public void prestaNuevoLibro(){
        this.numeroLibrosPrestados++;
    }
    public void devuelveLibro(){
        this.numeroLibrosPrestados--;
    }
    
    //*** Este metodo es sobreescrito por Profesor y Estudiante porque para cada uno cambia la condicion
    public Boolean puedePrestarLibro(){
            return false;
    }
    
    //*** Este metodo se sobrescribe en Profesor y en el Estudiante
    public int generarMulta(int diasPasados){
        return 0;
    }

    public int getValorMultas() {
        return valorMultas;
    }

    public void setValorMultas(int valorMultas) {
        this.valorMultas = valorMultas;
    }
    
    
    
    
    
}
