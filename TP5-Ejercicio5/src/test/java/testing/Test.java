package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Remera;
import modelo.RemeraImportada;
import modelo.RemeraNacional;

class Test {

	@org.junit.jupiter.api.Test
	void remeraNacional() {
		Remera remeraNacional = new RemeraNacional(100.0);

		assertEquals(138.207, remeraNacional.calcularCostoRemera());
	}

	@org.junit.jupiter.api.Test
	void remeraImportada() {
		Remera remeraNacional = new RemeraImportada(100.0);

		assertEquals(135.1875, remeraNacional.calcularCostoRemera());
	}

}
