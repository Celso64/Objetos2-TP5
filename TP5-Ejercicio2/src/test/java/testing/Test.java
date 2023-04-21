package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.HistoriaDeUsuario;
import modelo.Scrum;
import modelo.Spike;

class Test {

	@org.junit.jupiter.api.Test
	void calcularTareasConUnNivelDeAnidamiento() {

		Scrum scrum = new HistoriaDeUsuario();

		scrum.agregarTarea(new Spike(15));

		scrum.agregarTarea(new Spike(10));

		Scrum historia = new HistoriaDeUsuario();

		historia.agregarTarea(new Spike(25));

		scrum.agregarTarea(historia);

		assertEquals(50, scrum.calcularTiempoDeTrabajo());

	}

}
