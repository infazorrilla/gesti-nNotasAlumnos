package com.elorrieta;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Inicio del proyecto con Iker y Ana

// modifico a la vez que iker


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
			
			System.out.println("holi");


			
			alumno alumno2 = new alumno("Miren","4");
			alumno alumno3 = new alumno("Unai","5");
			alumno alumno4 = new alumno("Pedro","8");
			alumno alumno5 = new alumno("Marta","2");
			alumno alumno6 = new alumno("Natxo","9");
			List<alumno> listaAlumno = new ArrayList<alumno>();
			
			listaAlumno.add(alumno1);
			listaAlumno.add(alumno2);
			listaAlumno.add(alumno3);
			listaAlumno.add(alumno4);
			listaAlumno.add(alumno5);
			listaAlumno.add(alumno6);
			alumno alumno7 = new alumno("Asier","10");
			
			listaAlumno.add(alumno7);
			
			alumno alumno8 = new alumno("Oier","8");
			
			listaAlumno.add(alumno7);
			
		 for(int i = 0;i<listaAlumno.size();i++)
		 {
		 
			 System.out.println("Alumno"+i + ": " + listaAlumno.get(i).getNombreAlumno() + " "  + listaAlumno.get(i).getNota());
		 }

	}

}
