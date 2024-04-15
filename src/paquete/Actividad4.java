package paquete;

public class Actividad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asignatura asig1 = new Asignatura(1);
		Asignatura asig2 = new Asignatura(2);
		Asignatura asig3 = new Asignatura(3);
		
		Alumno a1 = new Alumno( asig1, asig2, asig3);
		
		Profesor p1 = new Profesor();
		p1.ponerNotas(a1);
		System.out.println("La nota media del alumno a1 es: "+p1.calcularMedia(a1));
		
	}

}
