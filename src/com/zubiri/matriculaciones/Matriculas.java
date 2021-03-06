package com.zubiri.matriculaciones;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Matriculas {
	
	//constructor
	public static ArrayList<Matricula> anadirMatriculas(Scanner sc){
		System.out.println("¿Cuantas matriculas quieres guardar?");
		int opcion = sc.nextInt();
		for (int i = 0; i < opcion; i++) {
			matriculas.add(new Matricula(sc));
		}
		return matriculas;
	}
	
	//Contador de matrículas
	public static int numeroMatriculas = 0;
	//ArrayList de Matricula para guardar las matrículas totales
	public static ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
	
	//crear matriculas para guardarlas en un arraylist
	public static void crearMatriculas(Scanner sc) {
		
		System.out.println("¿Cuantas matriculas quieres añadir?");
			int opcion = sc.nextInt();
			for (int i = 0; i < opcion ; i++) {
				matriculas.add(new Matricula(sc));
			}	
	}
	
	//Borrar matrículas
	public static void borraMatricula(String nombre){
		for (int b = 0; b < matriculas.size(); b++) {
			if (matriculas.get(b).getNombre().equalsIgnoreCase(nombre)) {
				matriculas.remove(b);
			}
		}
	}
	
	//Devolver String con las Matriculas formateadas
	public static String formattedMatriculas(ArrayList<Matricula> matriculasPasadas){
		String matriculasFormateadas = "";
		for(int m = 0; m < matriculasPasadas.size(); m++){
			matriculasFormateadas += matriculasPasadas.get(m).formatted();
		}
		return matriculasFormateadas;
	}
	
	//Método contador
	public static void contarMatricula(){
		numeroMatriculas++;
	}
	
	//Getters y setters
	public static int getNumeroMatriculas(){
		return numeroMatriculas;
	}
	
	public static void setNumeroMatriculas(int numero){
		numeroMatriculas = numero;
	}

	public static ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}

	public static void setMatriculas(ArrayList<Matricula> matriculas) {
		Matriculas.matriculas = matriculas;
	}
}