package biblioteca;

// @author Alejandro Betancourth

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Biblioteca {

    private String nombre;
    private String ciudad;
    
    public ArrayList<Persona> Usuarios; 
    public ArrayList<Libro> Libros; 
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
    public void registrarLibro(String isbn, String autor, String titulo, int maximoDias){
        Libro libro = new Libro(isbn,autor,titulo,maximoDias);
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

    public ArrayList<Persona> getUsuarios() {
        return Usuarios;
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
            if(libro.getIsbn()== codigoLibro){
                return libro;
            }
        }
        return null;
    }

    
    public void realizarPrestamo(int idPersona, String codigoLibro, int fechaSalida){
        //*** Se busca la persona por el codigo
        Persona usuario=buscarPersonaByCodigo(idPersona);
        Libro libro = buscarLibroByCodigo(codigoLibro);
        
        //*** Se valida que el usuario este registrado pueda prestar libro
        //*** Estudiantes 6
        //*** Profesores 12
        if(usuario!=null){
            if(usuario.puedePrestarLibro()){
                //*** Se valida que el libro este disponible en la biblioteca
                //*** Si no esta prestado el libro
                if(!libro.estaPrestado()){
                    int fechaDevolucion  = fechaSalida+libro.getMaximoDias();
                    Prestamo prestamo = new Prestamo(idPersona,codigoLibro,fechaSalida,fechaDevolucion);
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
        }
        else{
            System.out.printf("No hay un usuario registrado con %d\n",idPersona);
        }
    }
    
    public void realizarPrestamoView(Persona usuario, Libro libro, int fechaSalida){
        //*** Se busca la persona por el codigo

        //*** Se valida que el usuario este registrado pueda prestar libro
        //*** Estudiantes 6
        //*** Profesores 12
        if(usuario!=null){
            if(usuario.puedePrestarLibro()){
                //*** Se valida que el libro este disponible en la biblioteca
                //*** Si no esta prestado el libro
                if(!libro.estaPrestado()){
                    int fechaDevolucion  = fechaSalida+libro.getMaximoDias();
                    Prestamo prestamo = new Prestamo(usuario.getIdentificacion(),libro.getIsbn(), fechaSalida,fechaDevolucion);
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
        }
        else{
            System.out.printf("No hay un usuario registrado con %d\n");
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
                    //*** se trae la persona que lo presto
                    Persona usuario = buscarPersonaByCodigo(prestamo.getIdUsuario());
                    //*** se retorna el estado a devuelto del libro
                    libro.devolverLibro();
                    usuario.devuelveLibro();
                    //*** Si es mayor se hace la multa a la persona
                    if(fechaDevolucion>prestamo.getFechaDevolucion()){
                        int diasPasados = fechaDevolucion-prestamo.getFechaDevolucion();
                        usuario.generarMulta(diasPasados);
                    }
                    System.out.printf("%s devuelve el libro %s,  valor multa:%d\n",usuario.getNombre(),libro.getTitulo(),usuario.getValorMultas());
                    Prestamos.remove(i);
                    break;
                    //*** Cuando se encuentre el prestamo que tiene el registro se verifica si cumple con la fecha
                    //*** de devolucion, o si no se le impone una multa
                }
            }
        }
        else{
            System.out.printf("El libro %s no esta prestado\n",libro.getTitulo());
        }
    }
    
    public void extenderFechaPrestamo(String codigoLibro){
        Prestamo prestamo;
        Libro libro = buscarLibroByCodigo(codigoLibro);
        if(libro.estaPrestado()){
            for(int i=0; i<Prestamos.size(); i++){
                prestamo=Prestamos.get(i);
                if(prestamo.getCodigoLibro() == codigoLibro){
                    Persona usuario = buscarPersonaByCodigo(prestamo.getIdUsuario());
                    //*** Se le registra al usuario que devuelve un nuevo libro
//                    usuario.devuelveLibro();
                    
                    prestamo.setFechaDevolucion(prestamo.getFechaDevolucion()+libro.getMaximoDias());
                    System.out.printf("Al usuario %s se le extiende la fecha de devolucion del libro %s al dia %d\n",usuario.getNombre(),libro.getTitulo(),prestamo.getFechaDevolucion());
                }
            }
        }
        else{
            System.out.printf("El libro %s no esta prestado\n",libro.getTitulo());
        }
    }
    
    public void verLibrosPrestadosPorUsuario(int idUsuario){
        Prestamo prestamo;
        Boolean first=true;
        Persona usuario = buscarPersonaByCodigo(idUsuario);
            for(int i=0; i<Prestamos.size(); i++){
                prestamo=Prestamos.get(i);
                if(prestamo.getIdUsuario() == idUsuario){
                    if(first){
                        System.out.printf("El usuario %s tiene prestado %d libros:\n",usuario.getNombre(),usuario.getNumeroLibrosPrestados());
                        first=false;
                    }
                    //*** se trae la persona que lo presto
                    Libro libro = buscarLibroByCodigo(prestamo.getCodigoLibro());
                    System.out.printf("\t -EL libro %s\n",libro.getTitulo());
                    //*** Cuando se encuentre el prestamo que tiene el registro se verifica si cumple con la fecha
                    //*** de devolucion, o si no se le impone una multa
                }
            }
            if(first){
                System.out.printf("El usuario %s no tiene libros prestado.",usuario.getNombre());
            }
    }
    
    public void verEstadoLibros(){
        Libro libro;
        int numeroLibrosPrestados=0;
        int numeroLibrosDisponibles=0;
        for(int i=0; i<Libros.size(); i++){
            libro=Libros.get(i);
            if(libro.estaPrestado()){
                numeroLibrosPrestados++;
            }
            else{
                numeroLibrosDisponibles++;
            }
        }
        System.out.printf("En la biblioteca hay %d libros, %d disponibles y %d prestados.\n",Libros.size(),numeroLibrosDisponibles,numeroLibrosPrestados);
    }
    
    @Override
    public String toString(){
        return "Biblioteca:"+nombre+",  Ciudad:"+ciudad;
    }
    
    
    public static void main(String[] args) {
        Biblioteca biblioteca= new Biblioteca("Jorge Roa","Pereira");
        
        
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(biblioteca);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setTitle("Mi Biblioteca");
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);                
        
        //*** Se inicializan los objetos de tipo Persona que estan en la biblioteca, tres estudiantes y tres profesores
        //*** Persona = new Estudiante('TipoEstudiante','Nombre','Identificacion','Grado')
        Estudiante ea = new Estudiante("Laura","Mejia",111,7);
        Estudiante eb = new Estudiante("Jaime","Escobar",222,8);
        Estudiante ec = new Estudiante("Manuel","Escobar",333,9);
        
        //*** Profesores
        Profesor pa = new Profesor("Oscar","Gaviria",1111);
        pa.addMateria("Español");
        pa.addMateria("Filosofia");
        
        Profesor pb = new Profesor("Javier","Velez",2222);
        pb.addMateria("Fisica");
        pb.addMateria("Matematicas");
        
        Profesor pc = new Profesor("Maria","Cardona",3333);
        pc.addMateria("Ingles");
        
        //*** Se agregan las personas a la biblioteca
        biblioteca.registrarPersona(ea);
        biblioteca.registrarPersona(eb);
        biblioteca.registrarPersona(ec);
        biblioteca.registrarPersona(pa);
        biblioteca.registrarPersona(pb);
        biblioteca.registrarPersona(pc);
        
        
        //*** Se registran 10 libros
        biblioteca.registrarLibro("A145", "Gabriel Garcia Marquez", "Cien años de Soledad",7);
        biblioteca.registrarLibro("A146", "Gabriel Garcia Marquez", "Del amor y otros Demonios",7);
        biblioteca.registrarLibro("A147", "Gabriel Garcia Marquez", "El Coronel no tiene quien le escriba",7);
        biblioteca.registrarLibro("A148", "Mario Vargas", "La ciudad y los perros",7);
        biblioteca.registrarLibro("A149", "Jeanne Kalogridis", "El secreto de monalisa",7);
        biblioteca.registrarLibro("B147", "Leithold", "Calculo 7a Edicion",3);
        biblioteca.registrarLibro("B247", "Apostol", "Analisis matematicos",3);
        biblioteca.registrarLibro("B347", "Charles Kittel", "Fisica Termica",3);
        biblioteca.registrarLibro("B447", "Lewis Ford", "Fisica Moderna",5);
        biblioteca.registrarLibro("C547", "Vertice","Ingles Avanzado",5);
        
//        biblioteca.verPersonas();
//        for(int i=0; i<biblioteca.getPrestamos().size();i++){
//            
//        }
        
        //*** Se pretan un libro a un 
        biblioteca.realizarPrestamo(111,"A145",8);
        biblioteca.realizarPrestamo(111,"A146",8);
        biblioteca.realizarPrestamo(111,"A147",8);
        biblioteca.realizarPrestamo(1111,"A147",8);
        biblioteca.realizarPrestamo(1111,"A146",8);
        biblioteca.realizarPrestamo(1111,"B147",8);
        //***
        biblioteca.devolverLibro("A145", 18);
        biblioteca.extenderFechaPrestamo("B147");
        biblioteca.extenderFechaPrestamo("B147");
        biblioteca.extenderFechaPrestamo("B147");
//        biblioteca.devolverLibro("B147", 18);
        System.out.println("");
        biblioteca.verLibrosPrestadosPorUsuario(1111);
        biblioteca.verEstadoLibros();
        System.out.println("\n\n");
        
        
        Libro l=new Libro("125888", "Gabriel Garcia Marquez", "Cien años de Soledad",7);
        Libro l2=new Libro("588asdfa", "Pablo Neruda", "Cien años de Soledad",555);
        System.out.println(l);
        System.out.println(l2);
        

        
    }
}

