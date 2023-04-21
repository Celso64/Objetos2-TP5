package modelo;

public class RemeraNacional extends Remera {

	private static final Double RECARGO_TRANSPORTE = 0.0015;
	private static final Double BONIFICACION = 0.2;
	private static final Double GANANCIA = 0.15;

	public RemeraNacional(Double precioUnitario) {
		super.precioUnitario = precioUnitario;
	}

	@Override
	protected Double calcularRecargo(Double precio) {
		return precio * RECARGO_TRANSPORTE;
	}

	@Override
	protected Double calcularCostosExtras(Double precio) {
		return precio * BONIFICACION;
	}

	@Override
	protected Double calcularGanancia(Double precio) {
		return precio * GANANCIA;
	}

}
