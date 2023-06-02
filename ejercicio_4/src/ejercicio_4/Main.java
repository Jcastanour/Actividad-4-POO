package ejercicio_4;

public class Main {

    public static void main(String[] args) {
    Equipo equipo = new Equipo("Sky","Estado Unidos");
    //añadiendo ciclistas:
    Velocista velocista1=new Velocista(123979,"Geraint Thomas",320.0,25.0);//es un ciclista, pero mas especializado
    Escalador escalador1=new Escalador(12390,"Egan Bernal",25f,10f);//toca usar el f, pq por defecto un punto flotante es double
    Contrarrelojista contrarrelojista1 = new Contrarrelojista(123981,"Jonathan Castroviejo",120.0);
    
    //añadiendolos al equipo:
    equipo.addCiclista(velocista1);
    equipo.addCiclista(escalador1);
    equipo.addCiclista(contrarrelojista1);
    
    //colocando tiempos acumulados
    velocista1.setTiempoAcumulado(365.0);
    escalador1.setTiempoAcumulado(385.0);
    contrarrelojista1.setTiempoAcumulado(370.0);
    
    
    //Le metemos los tiempos al metodo setTiempoTotal de la clase Equipo para q se vayan sumando
    equipo.setTiempoTotal(velocista1.getTiempoAcumulado());
    equipo.setTiempoTotal(escalador1.getTiempoAcumulado());
    equipo.setTiempoTotal(contrarrelojista1.getTiempoAcumulado());
      
       
    //imprimimos los resultados:
    equipo.imprimir();
    
    //tambien podemos imprimir a los ciclistas:
    System.out.println("");
    velocista1.imprimir();
    System.out.println("");
    escalador1.imprimir();
    System.out.println("");
    contrarrelojista1.imprimir();
    }  
}
