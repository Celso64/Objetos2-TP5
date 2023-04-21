package modelo;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {

	protected LogTransaction log;
	protected int mesEnPromocion;

	public final double calcularPrecio(double precioProducto) {

		double precioTotal = precioProducto;

		precioTotal += calcularDescuento(this.mesEnPromocion, precioProducto);

		log.log(CalculadorNoJubilado.class.getName());
		return precioTotal;

	}

	protected abstract Double calcularDescuento(Integer mesEnPromocion, Double precioProducto);

	protected static Boolean esMesDePromocion(Integer mes) {
		return of(mes).equals(now().getMonth());
	}

}
