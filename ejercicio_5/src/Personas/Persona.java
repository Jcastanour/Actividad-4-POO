package Personas;
/**
* Esta clase denominada Persona modela una persona que cuenta con
* los atributos: nombre, apellidos, tel�fono y direcci�n.
* @version 1.2/2020
*/
public class Persona {
String nombre; // Atributo que identifica el nombre de una persona
String apellidos; /* Atributo que identifica los apellidos de una
persona */
String tel�fono; // Atributo que identifica el tel�fono de una persona
String direcci�n; /* Atributo que identifica la direcci�n de una
persona */
/**
* Constructor de la clase Persona
* @param nombre Par�metro que define el nombre de una persona
* @param apellidos Par�metro que define los apellidos de una
* persona
* * @param tel�fono Par�metro que define el tel�fono de una persona
* @param direcci�n Par�metro que define la direcci�n de una
* persona
*/
public Persona(String nombre, String apellidos, String tel�fono,
String direcci�n) {
this.nombre = nombre;
this.apellidos = apellidos;
this.tel�fono = tel�fono;
this.direcci�n = direcci�n;
}
}
