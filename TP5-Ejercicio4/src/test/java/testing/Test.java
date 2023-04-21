package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.YearMonth;

import modelo.Calculador;
import modelo.CalculadorJubilado;
import modelo.CalculadorNoJubilado;

class Test {

	private static final Integer MES_ACTUAL = YearMonth.now().getMonthValue();

	@org.junit.jupiter.api.Test
	void jubiladoFueraDePromocion() {

		Calculador calculadoraJubilados = new CalculadorJubilado(obtenerMesDistintoAlActual());

		assertEquals(110.0, calculadoraJubilados.calcularPrecio(100.0));
	}

	@org.junit.jupiter.api.Test
	void jubiladoEnPromocion() {

		Calculador calculadoraJubilados = new CalculadorJubilado(MES_ACTUAL);

		assertEquals(200.0, calculadoraJubilados.calcularPrecio(100.0));
	}

	@org.junit.jupiter.api.Test
	void noJubiladoFueraDePromocion() {

		Calculador calculadoraJubilados = new CalculadorNoJubilado(obtenerMesDistintoAlActual());

		assertEquals(121.0, calculadoraJubilados.calcularPrecio(100.0));
	}

	@org.junit.jupiter.api.Test
	void noJubiladoEnPromocion() {

		Calculador calculadoraJubilados = new CalculadorNoJubilado(MES_ACTUAL);

		assertEquals(115.0, calculadoraJubilados.calcularPrecio(100.0));
	}

	// Esto es para evitar que se rompa en Enero o Diciembre por un valor fuera de
	// rango.
	private static Integer obtenerMesDistintoAlActual() {
		return (MES_ACTUAL != 0) ? MES_ACTUAL - 1 : MES_ACTUAL + 1;
	}

}
