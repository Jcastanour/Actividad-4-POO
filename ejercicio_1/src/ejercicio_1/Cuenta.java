package ejercicio_1;

public class Cuenta {
    protected float saldo,tasaAnl, comisionMsl;
    protected int Numconsignacion, Numretiro;
    
    public Cuenta(float saldo, float tasaAnl){
        //Algunos valores tienen valores por defecto:      
        Numconsignacion=0;
        Numretiro=0;
        comisionMsl=0;
        //Se ingresan los valores de los parametros saldo y tasaAnl
        this.saldo=saldo;
        this.tasaAnl=tasaAnl;  
    }   
    
    //metodos para añadir y quitar dinero
    public void Consignar(float cantidad){
        saldo=saldo+cantidad;
        Numconsignacion+=1;        
    }
    
    public void Retirar(float cantidad){
        if (saldo>cantidad){
            saldo=saldo-cantidad;
            Numretiro+=1;
        }
        else{
            System.out.println("El valor solicitado excede el saldo actual");               
        }    
    }
    
    //metodo que calcula el interes mensual, y metodo que me retira ese interes
    public void InteresMensual(){
        float tasaMsl=tasaAnl/12;
        float interesMsl=saldo*tasaMsl;
        //no se por q se suma, cosas de la guia
        saldo+=interesMsl;              
    }
    
    public void extractoMsl(){
        saldo-=comisionMsl;
        InteresMensual();
    } 
}
