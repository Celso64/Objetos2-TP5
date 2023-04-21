package modelo;

public class RemeraNacional extends Remera {

	private static final Double RECARGO_TRANSPORTE = 0.0015;
	private static final Double BONIFICACION = 0.2;
	private static final Double GANANCIA = 0.15;

	public RemeraNacional(Double precioUnitario) {
		super.precioUnitario = precioUnitario;
	}

	@Override
	protected Double calcularRecargo() {
		return super.precioUnitario * RECARGO_TRANSPORTE;
	}

	@Override
	protected Double calcularCostosExtras() {
		return super.precioUnitario * BONIFICACION;
	}

	@Override
	protected Double calcularGanancia() {
		return super.precioUnitario * GANANCIA;
	}

}
