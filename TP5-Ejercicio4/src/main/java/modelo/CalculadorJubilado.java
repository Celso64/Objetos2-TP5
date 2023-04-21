package modelo;

public class CalculadorJubilado extends Calculador {

	public CalculadorJubilado(Integer mes) {
		super.mesEnPromocion = mes;
		super.log = new LogTransaction();
	}

	@Override
	protected Double calcularDescuento(Integer mesEnPromocion, Double precioProducto) {
		if (!esMesDePromocion(mesEnPromocion)) {
			return precioProducto * 0.1;
		}
		return precioProducto;
	}
}
