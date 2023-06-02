package ejercicio_4;
import java.util.*;    
//static implica que son compartidos por todas las instancias de la clase=> siempre son 
//constantes

//constructor
public class Equipo {
    private String nombre,pais;
    private static Double tiempoTotal;
    private List<Ciclista> ciclista;
   
    public Equipo(String nombre, String pais){
        this.nombre=nombre;
        this.pais=pais;
        tiempoTotal=0.0;
        ciclista=new ArrayList<>();//Lista de ciclistas(objetos).   
    }
    //ahora vamos a hacer los setters y getters

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) { //privado pa q no me le cambien el nombre xd
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    private void setPais(String pais) { //privado pa q no me le cambien el nombre
        this.pais = pais;
    }

    public static void setTiempoTotal(Double tiempoTotal) {
        Equipo.tiempoTotal += tiempoTotal;
    }
    
    //esta contiene el tiempoTotal total que usaron los jugadores.
    //se invoca desde las 3 clases especializadas
    public static Double getTiempoTotal() {
        return tiempoTotal;
    }
    
    
    //ahora los metodos de la clase:
    
    //añadir ciclistas a la lista:
    public void addCiclista(Ciclista ciclista){
        this.ciclista.add(ciclista);
    }
    //imprimir los nombres de los ciclistas:
    public void imprimirCiclista(){
        for(Ciclista nombreCiclista : ciclista){ //como diciendo for name in lista
            System.out.println("-"+nombreCiclista.getNombreC());
        }     
    }
    //buscar un ciclista ingresado por teclado:
    public void buscarCiclista(){
        String nombreC;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del ciclista: ");      
        nombreC = input.next();
        
        for(Ciclista nombreCiclista : ciclista){
            if(nombreCiclista.getNombreC()==nombreC){
                //aqui va el codigo pa imprimir los datos del ciclista
                System.out.println("El ciclista "+nombreC+" pertenece al equipo "+nombre+" del pais "+pais);
                break;
            }
            else{
                System.out.println("El ciclista no se encuentra en el equipo");
            }
        }          
    }
    //ahora vamos a hacer la clase que nos imprime todo esto
    public void imprimir(){
    System.out.println("Nombre del equipo: "+nombre);
    System.out.println("Pais: "+pais);
    System.out.println("Total de tiempo: "+tiempoTotal);
    System.out.println("Integrantes del equipo:");
    imprimirCiclista();
    }            
}
