package ejercicio_4;

public abstract class Ciclista {
    //recordar que una abstracta es como una clase base, no muy especializada, que me ayudara a crear otras clases mas especializadas.
    //por ejemplo animal como base, y especializadas gato, ciervo, pez ...
    private int identificador;
    private String nombreC;
    private Double tiempoAcumulado;
    
    //clase abstracta
    abstract String imprimirTipo();//metodo abstracto que SI O SI, deben usar sus clases hijas (se define en la clase especializada). muestra el tipo especifico de un ciclista
   
    //constructor
    public Ciclista(int identificador, String nombreC){
        this.nombreC=nombreC;
        this.identificador=identificador;
        this.tiempoAcumulado=0.0;
    }
    //getters and setters
    public int getIdentificador() {
        return identificador;
    }
    private void setIdentificador(int identificador) { //uno pone esto desde el constructor, y no tiene por q cambiarse
        this.identificador = identificador;
    }
    public String getNombreC() {
        return nombreC;
    }
    private void setNombreC(String nombreC) { //uno pone esto desde el constructor, y no tiene por q cambiarse
        this.nombreC = nombreC;
    }
    public Double getTiempoAcumulado() {
        return tiempoAcumulado;
    }
    public void setTiempoAcumulado(Double tiempoAcumulado) { //este no va privado, pq tenemos q añadir el tiempoAcumulado de alguna forma xd
        this.tiempoAcumulado = tiempoAcumulado;
    }
    //ahora imprimimos
    public void imprimirCiclista(){
        System.out.println("El identificador del ciclista es: "+identificador);
        System.out.println("El nombre del ciclista es: "+nombreC);
        System.out.println("El tiempo acumulado es: "+tiempoAcumulado);             
    }        
}
