package modelo;

import java.util.LinkedList;
import java.util.List;

public class HistoriaDeUsuario implements Scrum {

    private List<Scrum> tareas;

    public HistoriaDeUsuario() {
	this.tareas = new LinkedList<>();
    }

    @Override
    public Integer calcularTiempoDeTrabajo() {

	Integer tiempo = 0;

	for (Scrum scrum : tareas) {
	    tiempo += scrum.calcularTiempoDeTrabajo();
	}

	return tiempo;
    }

    @Override
    public void agregarTarea(Scrum tarea) {

	this.tareas.add(tarea);

    }

}
