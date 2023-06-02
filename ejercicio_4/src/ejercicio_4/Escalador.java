package ejercicio_4;

public class Escalador extends Ciclista{
    private Float aceleracionPromedio, grados;
    
    //constructor
    public Escalador(int identificador, String nombreC,Float aceleracionPromedio,Float grados ){
        super(identificador, nombreC);
        this.aceleracionPromedio=aceleracionPromedio;
        this.grados=grados;
    }
    //setter y getters(encapsulamiento y control de flujo)
    public Float getAceleracionPromedio() {
        return aceleracionPromedio;
    }
    private void setAceleracionPromedio(Float aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }
    public Float getGrados() {
        return grados;
    }
    private void setGrados(Float grados) {
        this.grados = grados;
    }         
    //metodo abstracto(override) para indicar q se esta sobreescribiendo un metodo
    //de la clase madre o sencillamente se esa usando.
    @Override
    public String imprimirTipo(){
        String c="Es un escalador";
        return c;
    }
    //metodo para imprimir
    protected void imprimir(){
        super.imprimirCiclista(); // Invoca el método imprimir de la clase padre
        System.out.println("Aceleración promedio = " +aceleracionPromedio);
        System.out.println("Grado de rampa = " + grados);
    }        
}
