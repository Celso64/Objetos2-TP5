package modelo;

import java.util.LinkedList;
import java.util.List;

public class Paquete extends Seguro {

	private static Double DESCUENTO_POR_UNIDAD = 0.05;

	private List<Seguro> seguros;

	public Paquete() {
		this.seguros = new LinkedList<Seguro>();
	}

	@Override
	public Double calcularPrecio() {

		return this.seguros.stream()
		                   .mapToDouble(Seguro::calcularPrecio)
		                   .reduce(0.0, (x,y) -> (x + y * (1.0 - DESCUENTO_POR_UNIDAD)));
	}

	@Override
	public void agregarSeguroAlPaquete(Seguro seguro) {
		this.seguros.add(seguro);
	}

}
