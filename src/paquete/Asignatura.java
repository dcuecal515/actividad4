package paquete;

public class Asignatura {
	private int id;
	private double nota;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public Asignatura(int id) {
		this.id = id;
		nota = 5;
	}
	
}
