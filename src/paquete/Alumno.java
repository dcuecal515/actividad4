package paquete;

public class Alumno {
	private Asignatura fol;
	private Asignatura entorno;
	private Asignatura programacion;
	
	public Alumno( Asignatura a1, Asignatura a2, Asignatura a3) {
		fol = new Asignatura(a1.getId());
		entorno = new Asignatura(a2.getId());
		programacion = new Asignatura(a3.getId());
	}
	
	public Alumno( int id1, int id2, int id3) {
		fol = new Asignatura(id1);
		entorno = new Asignatura(id2);
		programacion = new Asignatura(id3);
	}

	public Asignatura getFol() {
		return fol;
	}

	public Asignatura getEntorno() {
		return entorno;
	}

	public Asignatura getProgramacion() {
		return programacion;
	}
	
}
