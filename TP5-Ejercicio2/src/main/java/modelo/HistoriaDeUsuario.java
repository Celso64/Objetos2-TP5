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
      
	return tareas.stream()
	             .mapToInt(Scrum::calcularTiempoDeTrabajo)
	             .reduce(0, Integer::sum);
    }

    @Override
    public void agregarTarea(Scrum tarea) {

	this.tareas.add(tarea);

    }

}
