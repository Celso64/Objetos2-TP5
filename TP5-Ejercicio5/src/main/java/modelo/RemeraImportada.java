package modelo;

public class RemeraImportada extends Remera {
	private static final Double RECARGO = 0.03;
	private static final Double IMPUESTO_ADUANERO = 0.05;
	private static final Double GANANCIA = 0.25;

	public RemeraImportada(Double precioUnitario) {
		super.precioUnitario = precioUnitario;
	}

	@Override
	protected Double calcularRecargo(Double precio) {
		return precio * RECARGO;
	}

	@Override
	protected Double calcularCostosExtras(Double precio) {
		return precio * IMPUESTO_ADUANERO;
	}

	@Override
	protected Double calcularGanancia(Double precio) {
		return precio * GANANCIA;
	}

}
