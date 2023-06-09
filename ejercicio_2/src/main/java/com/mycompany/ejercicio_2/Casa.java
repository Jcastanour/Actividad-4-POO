package com.mycompany.ejercicio_2;
public class Casa extends InmuebleVivienda {
    protected int númeroPisos;
    
    public Casa(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños, int númeroPisos) {
        super(identificadorInmobiliario, área, dirección,
        númeroHabitaciones, númeroBaños);
        this.númeroPisos = númeroPisos;
    }
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Número de pisos = " + númeroPisos);
    }

}
