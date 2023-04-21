package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.*;

class Test {

	@org.junit.jupiter.api.Test
	void remeraNacional() {
		Remera remeraNacional = new RemeraNacional(100.0);

		assertEquals(238.207, remeraNacional.calcularCostoRemera());
	}

	@org.junit.jupiter.api.Test
	void remeraImportada() {
		Remera remeraNacional = new RemeraImportada(100.0);

		assertEquals(235.1875, remeraNacional.calcularCostoRemera());
	}

}
