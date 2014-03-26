/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author sebasvh
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Biblioteca {

    private String nombre;
    private String ciudad;
    
    private ArrayList<Persona> Usuarios; 
    private ArrayList<Libro> Libros; 
    private ArrayList<Prestamo> Prestamos; 
    
    public Biblioteca(String nombre, String ciudad){
        this.nombre=nombre;
        this.ciudad=ciudad;
        this.Usuarios = new ArrayList();
        this.Libros = new ArrayList();
        this.Prestamos = new ArrayList();
    }
    
    
    //*** Este metodo indica una agregacion con el objeto persona porque se supone
    //*** que ya viene creado de alguna parte. Y si esta clase muere, todavia no muere
    //*** los objetos de tipo persona
    public void registrarPersona(Persona persona){
        Usuarios.add(persona);
    }
    
    //*** Este metodo indica una composicion con el objeto libro, considerando que los libros son
    //*** propios de la bibiblioteca y si muere la biblioteca muren los libros, se diferencia de 
    //*** agregacion porque el objeto se instancia en el metodo
    public void registrarLibro(String isbn, String autor, String titulo){
        Libro libro = new Libro(isbn,autor,titulo);
        Libros.add(libro);
    }
    
    public void registrarPrestamo(Prestamo prestamo){
        Prestamos.add(prestamo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void verPersonas(){
        for(int i=0; i<Usuarios.size();i++){
            System.out.println(Usuarios.get(i).getIdentificacion());
        }
    }
    
    public Persona buscarPersonaByCodigo(int idPersona){
        Persona usuario = new Persona();
        for(int i=0; i<Usuarios.size(); i++){
            usuario=Usuarios.get(i);
            if(usuario.getIdentificacion() == idPersona){
                return usuario;
            }
        }
        return null;
    }
    
    public Libro buscarLibroByCodigo(String codigoLibro){
        Libro libro;
        for(int i=0; i<Libros.size(); i++){
            libro=Libros.get(i);
            if(libro.getIsbn() == codigoLibro){
                return libro;
            }
        }
        return null;
    }
    
    
    public void realizarPrestamo(int idPersona, String codigoLibro, int fecha){
        //*** Se busca la persona por el codigo
        Persona usuario=buscarPersonaByCodigo(idPersona);
        Libro libro = buscarLibroByCodigo(codigoLibro);
        
        //*** Se valida que el usuario pueda prestar libro
        //*** Estudiantes 6
        //*** Profesores 12
        if(usuario!=null)
            if(usuario.puedePrestarLibro()){
                //*** Se valida que el libro este disponible en la biblioteca
                //*** Si no esta prestado el libro
                if(!libro.estaPrestado()){
                    Prestamo prestamo = new Prestamo(idPersona,codigoLibro,10);
                    //*** Se registra que el libro se presta
                    libro.prestarLibro();
                    //*** Se le registra al usuario un nuevo libro prestado
                    usuario.prestaNuevoLibro();
                    //*** Se registra el prestamo en el array de prestamos
                    registrarPrestamo(prestamo);
                    System.out.printf("El usuario %s presta el libro %s. \n",usuario.getNombre(),libro.getTitulo());
                }
                else{
                    System.out.printf("El libro %s esta prestado\n",libro.getTitulo());
                }
            }
            else{
                System.out.printf("El usuario %s no puede prestar mas libros\n",usuario.getNombre());
            }
        else{
            System.out.printf("No hay un usuario registrado con %d\n",idPersona);
        }
    }
    
    public void devolverLibro(String codigoLibro, int fechaDevolucion){
        //*** Se busca en todas los prestamos
        Prestamo prestamo;
        Libro libro = buscarLibroByCodigo(codigoLibro);
        if(libro.estaPrestado()){
            for(int i=0; i<Prestamos.size(); i++){
                prestamo=Prestamos.get(i);
                if(prestamo.getCodigoLibro() == codigoLibro){
                    //*** Cuando se encuentre el prestamo que tiene el registro se verifica si cumple con la fecha
                    //*** de devolucion, o si no se le impone una multa
                }
            }
        }
        else{
            System.out.printf("El libro %s no esta prestado\n",libro.getTitulo());
        }
    }
    
    
    
    
    public static void main(String[] args) {
        Biblioteca biblioteca= new Biblioteca("Jorge Roa","Pereira");
        
        //*** Se inicializan los objetos de tipo Persona que estan en la biblioteca, tres estudiantes y tres profesores
        //*** Persona = new Estudiante('TipoEstudiante','Nombre','Identificacion','Grado')
        Estudiante ea = new Estudiante("Laura","Mejia",111,7);
        Estudiante eb = new Estudiante("Jaime","Escobar",222,8);
        Estudiante ec = new Estudiante("Jaime","Escobar",333,9);
        
        //*** Profesores
        Profesor pa = new Profesor("Oscar","Gaviria",1020);
        pa.addMateria("Español");
        pa.addMateria("Filosofia");
        
        Profesor pb = new Profesor("Javier","Velez",7788);
        pb.addMateria("Matematicas");
        pb.addMateria("Fisica");
        
        Profesor pc = new Profesor("Maria","Cardona",9966);
        pc.addMateria("Ingles");
        
        //*** Se agregan las personas a la biblioteca
        biblioteca.registrarPersona(ea);
        biblioteca.registrarPersona(eb);
        biblioteca.registrarPersona(ec);
        biblioteca.registrarPersona(pa);
        biblioteca.registrarPersona(pb);
        biblioteca.registrarPersona(pc);
        
        
        //*** Se registran 10 libros
        biblioteca.registrarLibro("A145", "Gabriel Garcia Marquez", "Cien años de Soledad");
        biblioteca.registrarLibro("A146", "Gabriel Garcia Marquez", "Del amor y otros Demonios");
        biblioteca.registrarLibro("A147", "Gabriel Garcia Marquez", "El Coronel no tiene quien le escriba");
        biblioteca.registrarLibro("A148", "Mario Vargas", "La ciudad y los perros");
        biblioteca.registrarLibro("A149", "Jeanne Kalogridis", "El secreto de monalisa");
        biblioteca.registrarLibro("B147", "Leithold", "Calculo 7a Edicion");
        biblioteca.registrarLibro("B247", "Apostol", "Analisis matematicos");
        biblioteca.registrarLibro("B347", "Charles Kittel", "Fisica Termica");
        biblioteca.registrarLibro("B447", "Lewis Ford", "Fisica Moderna");
        biblioteca.registrarLibro("C547", "Vertice","Ingles Avanzado");
        
//        biblioteca.verPersonas();
//        for(int i=0; i<biblioteca.getPrestamos().size();i++){
//            
//        }
        
        
        biblioteca.realizarPrestamo(111,"A145",8);
        biblioteca.realizarPrestamo(10202,"A145",8);//Usuario no valido
        biblioteca.realizarPrestamo(1020,"A145",8);//Ya se presto el libro
        
    }
}


//class LeeFichero {
////   public static void main(String [] arg) {
//    public static void leer(){
//      File archivo = null;
//      FileReader fr = 
//      BufferedReader br = null;
// 
//      try {
//         // Apertura del fichero y creacion de BufferedReader para poder
//         // hacer una lectura comoda (disponer del metodo readLine()).
//         String dir = new File("").getAbsolutePath();
//         fr = new FileReader (dir+"/src/biblioteca/archivo");
//         br = new BufferedReader(fr);
// 
//         // Lectura del fichero
//         String linea;
//         while((linea=br.readLine())!=null)
//            System.out.println(linea);
//      }
//      catch(Exception e){
//         e.printStackTrace();
//      }finally{
//         // En el finally cerramos el fichero, para asegurarnos
//         // que se cierra tanto si todo va bien como si salta 
//         // una excepcion.
//         try{                    
//            if( null != fr ){   
//               fr.close();     
//            }                  
//         }catch (Exception e2){ 
//            e2.printStackTrace();
//         }
//      }
//   }
//}