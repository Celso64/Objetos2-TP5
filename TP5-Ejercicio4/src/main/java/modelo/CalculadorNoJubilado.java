package modelo;

public class CalculadorNoJubilado extends Calculador {

	public CalculadorNoJubilado(Integer mes) {
		super.mesEnPromocion = mes;
		super.log = new LogTransaction();
	}

	@Override
	protected Double calcularDescuento(Integer mesEnPromocion, Double precioProducto) {
		if (esMesDePromocion(mesEnPromocion)) {
			return precioProducto * 0.15;
		} else {
			return precioProducto * 0.21;
		}
	}

}
