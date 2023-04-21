package apps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Medico;
import modelo.Paquete;
import modelo.Seguro;
import modelo.Vida;

class Test {

	@org.junit.jupiter.api.Test
	void test() {

		Seguro seguro = new Paquete();

		seguro.agregarSeguroAlPaquete(new Medico(100.0));
		seguro.agregarSeguroAlPaquete(new Vida(2000.0));

		Seguro seguroAnidado = new Paquete();

		seguroAnidado.agregarSeguroAlPaquete(new Vida(1000.0));

		seguro.agregarSeguroAlPaquete(seguroAnidado);

		assertEquals(2897.5, seguro.calcularPrecio());

	}

}
