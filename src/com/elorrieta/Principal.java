package com.elorrieta;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Inicio del proyecto con Iker y Ana
<<<<<<< HEAD
// modifico a la vez que iker
=======

		alumno alumno1 = new alumno();
		//alumno alumno1 = new alumno("Alain","8");
			Scanner sc = new Scanner(System.in);
			System.out.println("Dime el nombre del primer alumno");
			String nombre = sc.nextLine();
			alumno1.setNombreAlumno(nombre);
			System.out.println("Dime la nota del primer alumno");
			String nota = sc.nextLine();
			alumno1.setNota(nota);
			
			System.out.println(alumno1.getNota());
>>>>>>> 81604348bccacf697fbecd49d15476e25c6d7ee0
	}

}
