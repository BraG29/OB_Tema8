package main;

import clases.Persona;

public class Main {

	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.setNombre("Pepe");
		persona.setEdad(25);
		persona.setTelefono("095368696");
		System.out.println("------------------------------");
		System.out.println("Datos para la persona " + persona.getNombre() + ":");
		System.out.println("Edad: " + persona.getEdad());
		System.out.println("Telefono: " + persona.getTelefono());
		System.out.println("------------------------------");

	}
}
