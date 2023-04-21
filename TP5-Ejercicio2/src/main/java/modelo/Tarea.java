package modelo;

public class Tarea implements Scrum {

	private Integer tiempoRequerido;

	public Tarea(Integer tiempoRequerido) {
		this.tiempoRequerido = tiempoRequerido;
	}

	@Override
	public Integer calcularTiempoDeTrabajo() {
		return this.tiempoRequerido;
	}

	@Override
	public void agregarTarea(Scrum tarea) {
	}

}
