package ejercicio_1;

public class Corriente extends Cuenta{
    protected float sobregiro;
    
    public Corriente(float saldo, float tasaAnl){
        super(saldo, tasaAnl);
        this.sobregiro=0;
    }
    
    @Override
    public void Consignar(float cantidad){
        float residuo = sobregiro-cantidad;
        //si no hay sobregiro, se consigna normal      
        if (sobregiro==0){
            super.Consignar(cantidad);           
        }       
        
        //si el residuo es positivo, quiere decir que el sobregiro(deuda) aun existe. 
        else if(sobregiro>0){
            sobregiro=0;
            saldo=residuo;
        }
        
        else if(residuo<0){
            sobregiro=-residuo;
            saldo=0;
        }         
    }   
    
    @Override
    public void Retirar(float cantidad){
        float resultado=saldo-cantidad;
        //si es negativo, quiere decir q esta usando plata q no tiene, y se crea un sobregiro
        
        if(resultado<0){
            sobregiro= sobregiro-resultado;
            saldo=0;
        }
        //si no pasa eso, se retira de forma normal
        else{
            super.Retirar(cantidad);
        }
    }
    
    @Override
    public void extractoMsl(){
        super.extractoMsl();
    }
    
    public void imprimir() {
    System.out.println("Saldo = $ " + saldo);
    System.out.println("Cargo mensual = $ 2" + comisionMsl);
    System.out.println("Número de transacciones = " +(Numconsignacion + Numretiro));
    System.out.println("Valor de sobregiro = $" +(Numconsignacion + Numretiro));
    System.out.println();
    }      
}
