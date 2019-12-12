package com.elorrieta;

public class alumno {
	public alumno(String nombreAlumno, String nota) {
		super();
		this.nombreAlumno = nombreAlumno;
		this.nota = nota;
	}

	private String nombreAlumno;
	private String nota;
	
	public alumno() {
		
		
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

}
