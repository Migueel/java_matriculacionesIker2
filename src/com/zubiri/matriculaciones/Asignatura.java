package com.zubiri.matriculaciones;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.zubiri.matriculaciones.Profesor;

public class Asignatura {
	String nombre;
	int creditos = -1;
	Profesor profesor;
	
	//Constructor 1
	public Asignatura(String nombre, int creditos, Profesor profesor){
		this.nombre = nombre;
		this.creditos = creditos;
		this.profesor = profesor;
	}
	
	//Constructor 2
	public Asignatura(Scanner sc){
		System.out.println("Introduce el nombre de la asignatura: ");
		this.setNombre(sc.next());
		System.out.println("Introduce el número de créditos: ");
		
		this.setCreditos(sc.nextInt());
		this.setProfesor(new Profesor(sc));
	}
	
	/**
	 * M�todo que retorna un String con los valores de las propiedades
	 * formateados del siguiente modo:
	 *  <NOMBRE_PROPIEDAD1> : <VALOR_PROPIEDAD1>\n
	 *  <NOMBRE_PROPIEDAD2> : <VALOR_PROPIEDAD2>\n 
	 *  .....
	 * @return String
	 */
	
	public String formatted() {
		String asignaturaFormateada =
				"\n\tNombre de la asignatura: " + this.getNombre() +
				"\n\tCréditos: " + this.getCreditos() + 
				"\n\tDatos del profesor: \n" + this.getProfesor().formatted() + "\n";
		return asignaturaFormateada;
	}
	
	/**
	 * M�todo que obtiene valores de una asignatura a partir de un String y 
	 * un caracter separador.
	 */
	public void split(String asignaturaStr, char separator) {
		if (asignaturaStr == null) {
			System.out.println("No has pasado dato alguno...");
		}else{
			String separador = "";
			separador += separator;
			String[] parametros = asignaturaStr.split(separador);
			this.setNombre(parametros[0]);
			int creditos = Integer.parseInt(parametros[1]);
			this.setCreditos(creditos);
			String[] datosProfesor = parametros[2].split("*");
			this.setProfesor(new Profesor(datosProfesor[0], datosProfesor[1], datosProfesor[2],datosProfesor[3],datosProfesor[4]));
		}
	}
	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCreditos() {
		return creditos;
	}
	
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	public Profesor getProfesor() {
		return profesor;
	}
	
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
}