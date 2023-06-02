package ejercicio_4;

public class Velocista extends Ciclista{
    private Double potenciaPromedio, velocidadPromedio;
    
    //constructor
    public Velocista(int identificador, String nombreC, Double potenciaPromedio,Double velocidadPromedio){ //constructor
        super(identificador, nombreC);
        this.potenciaPromedio=potenciaPromedio;
        this.velocidadPromedio=velocidadPromedio;    
    }
    //setter y getters:
    protected Double getPotenciaPromedio() {
        return potenciaPromedio;
    }
    protected void setPotenciaPromedio(Double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }
    protected Double getVelocidadPromedio() {
        return velocidadPromedio;
    }
    protected void setVelocidadPromedio(Double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }
    //metodo abstracto:
    @Override
    protected String imprimirTipo(){
        String c = "Es un velocista";
        return c;
    }
    //ahora vamos a imprimirlo
    public void imprimir(){
        super.imprimirCiclista(); 
        System.out.println("Potencia promedio = " + potenciaPromedio);
        System.out.println("Velocidad promedio = "+ velocidadPromedio);
    }  
}
