package modelo;

public class RemeraImportada extends Remera {
	private static final Double RECARGO = 0.03;
	private static final Double IMPUESTO_ADUANERO = 0.05;
	private static final Double GANANCIA = 0.25;

	public RemeraImportada(Double precioUnitario) {
		super.precioUnitario = precioUnitario;
	}

	@Override
	protected Double calcularRecargo() {
		return super.precioUnitario * RECARGO;
	}

	@Override
	protected Double calcularCostosExtras() {
		return super.precioUnitario * IMPUESTO_ADUANERO;
	}

	@Override
	protected Double calcularGanancia() {
		return super.precioUnitario * GANANCIA;
	}

}
