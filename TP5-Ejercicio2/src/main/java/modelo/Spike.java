package modelo;

public class Spike implements Scrum {

    private Integer tiempoRequerido;

    public Spike(Integer tiempoRequerido) {
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
