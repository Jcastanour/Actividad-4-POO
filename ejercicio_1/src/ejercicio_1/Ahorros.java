
package ejercicio_1;

public class Ahorros extends Cuenta{
    protected boolean actividad;
     
    //constructor de Ahorros, recordar usar super para accerder al constrcutor de la superclase
    public Ahorros(float saldo, float tasaAnl){
        super(saldo,tasaAnl);
        //si el saldo es menor a 10000, la cuenta esta inactiva
        if(saldo<10000){
            this.actividad=false;
        }
        else{
           this.actividad=true;
        }
    }
    
    //Hay que redefinir estos metodos:(escribir los mismos metodos heredados, con exactamente los mismos parametros, solo q si lo queremos, podemos cambiar lo que hace.).
    //recordar que tienen mas prioridad los metodos propios de la clase que los heredados
    //Cambiar parametros=sobrecarga -----cambiar contenido=redefinir
    
    //super se usa para cosas relacionadas a la clase padre, this se usa para la clase actual
    
    @Override
    public void Consignar(float cantidad){
        if(actividad){
            super.Consignar(cantidad);
        }
    }
    
    @Override
    public void Retirar(float cantidad){
        if (actividad){//si esta activa la cuenta, se puede retirar
            super.Retirar(cantidad);//super.Method, es la forma de acceder a un metodo o atributo heredado de la clase padre
        }
    }
    
    @Override
    public void extractoMsl(){
        if(Numretiro>4){
            comisionMsl=(Numretiro-4)*1000;                    
        }
        super.extractoMsl();
        if(saldo<1000){
            actividad=false;
        }
    } 
    
    //ahora vamos a imprimir todo de nuevo
    public void imprimir() {
    System.out.println("Saldo = $ " + saldo);
    System.out.println("Comisión mensual = $ " + comisionMsl);
    System.out.println("Número de transacciones = " + (Numconsignacion + Numretiro));
    System.out.println();
    }    
}

