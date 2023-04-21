package modelo;

public class RemeraNacional extends Remera {

	private static final Double RECARGO_TRANSPORTE = 0.0015;
	private static final Double BONIFICACION = 0.2;
	private static final Double GANANCIA = 0.15;

	public RemeraNacional(Double precioUnitario) {
		super.precioUnitario = precioUnitario;
	}

	@Override
	protected Double calcularRecargos() {
		return super.precioUnitario * (1.0 + RECARGO_TRANSPORTE) * (1.0 + BONIFICACION) * (1.0 + GANANCIA);
	}

}
