package ejercicio_4;

public class Contrarrelojista extends Ciclista{
    private Double velocidadMax;
    //constructor
    public Contrarrelojista(int identificador, String nombreC, Double velocidadMax){
        super(identificador,nombreC);
        this.velocidadMax=velocidadMax;
    }
    //setter and getters
    public Double getVelocidadMax() {
        return velocidadMax;
    }
    private void setVelocidadMax(Double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    //metodo abstracto
    @Override
    public String imprimirTipo(){
        String c="Es un contrarrelojista";
        return c;
    }
    //metodo para imprimir
    public void imprimir(){
        super.imprimirCiclista();
        System.out.println("Velocidad Maxima = "+velocidadMax);
    }   
}
