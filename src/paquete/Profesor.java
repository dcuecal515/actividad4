package paquete;

public class Profesor {
	
	public void ponerNotas(Alumno a1) {
		a1.getFol().setNota(Math.random()*10+1);
		a1.getEntorno().setNota(Math.random()*10+1);
		a1.getProgramacion().setNota(Math.random()*10+1);
	}
	
	public double calcularMedia(Alumno a1) {
		double notaFol = a1.getFol().getNota();
		double notaEntorno = a1.getEntorno().getNota();
		double notaProgramacion = a1.getProgramacion().getNota();
		return (notaFol+notaEntorno+notaProgramacion)/3;
	}
	
}
