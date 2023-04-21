package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Empleado;
import modelo.EmpleadoJefe;
import modelo.EmpleadoRegular;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		Empleado director = new EmpleadoJefe(100.0);

		Empleado gerente = new EmpleadoJefe(75.0);
		director.agregarSubalterno(gerente);
		director.agregarSubalterno(new EmpleadoJefe(50.0));

		gerente.agregarSubalterno(new EmpleadoRegular(15.0));

		assertEquals(240.0, director.calcularMonto());
	}

}
