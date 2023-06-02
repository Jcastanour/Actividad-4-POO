package ejercicio_1;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int valor,op;
        float saldo,tasaAnl,cantidad;
        Scanner input = new Scanner(System.in);
        //vamos a meterlo a un bucle pa hacerlo mas interactivo:
        
        System.out.println("Usaras una cuenta ahorros(1) o corriente(2)?");
        valor=input.nextInt();
        System.out.println("Ingresa el saldo inicial:");
        saldo=input.nextFloat();
        System.out.println("Ingresa la tasa anual:");
        tasaAnl=input.nextFloat();
        
        op=1;
        
        if (valor==1){
            Ahorros objeto = new Ahorros(saldo,tasaAnl);
            
            while(op!=0){
            System.out.println("Que operacion quieres hacer? consignar(1), retirar(2) o terminar(0)");
            op=input.nextInt();
                if(op==0){
                    objeto.imprimir();
                    objeto.extractoMsl();
                    break;
                }
                else if(op==1){
                    System.out.println("Cuanto vas a consignar?");
                    cantidad=input.nextFloat();
                    objeto.Consignar(cantidad);                   
                }
                else if (op==2){
                    System.out.println("Cuanto vas a retirar?");
                    cantidad=input.nextFloat();
                    objeto.Retirar(cantidad);                   
                }                                                     
            }            
        }
        else if(valor==2){
            Corriente objeto2 = new Corriente(saldo, tasaAnl);
            while(op!=0){
            System.out.println("Que operacion quieres hacer? consignar(1), retirar(2) o terminar(0)");
            op=input.nextInt();
                if(op==0){
                    objeto2.imprimir();
                    objeto2.extractoMsl();
                    break;
                }
                else if(op==1){
                    System.out.println("Cuanto vas a consignar?");
                    cantidad=input.nextFloat();
                    objeto2.Consignar(cantidad);
                }
                else if (op==2){
                    System.out.println("Cuanto vas a retirar?");
                    cantidad=input.nextFloat();
                    objeto2.Retirar(cantidad);
                }                                                     
            }           
        }   
    }   
}
