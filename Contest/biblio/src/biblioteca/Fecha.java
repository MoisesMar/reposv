package biblioteca;

/**
 *
 * @author Alejandro
 */
public class Fecha {
    
    private int anio;
    private int mes;
    private int dia;

    public Fecha() {
    }

    public Fecha(int anio, int mes, int dia) {
        this.anio = anio;
        this.mes = comprobarMes(mes);
        this.dia = comprobarDia(dia);
    }
    
    private int comprobarMes(int mes){
        if(mes >= 1 && mes <= 12) return mes;
        return 1;
        
    }
    
    private int comprobarDia(int dia){
       int diasPorMes[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
       
       if(mes == 2 && dia == 29 && 
               (anio %400 == 0 || anio  % 4 == 0 && anio % 100 == 0 )) 
                   return dia;
       if (dia >= 1 && dia <= diasPorMes[mes]) return dia;
       return 1;
    }
    
    public String toString(){
        return String.format("%04d/%02d/%02d", anio, mes, dia);
    }
}
