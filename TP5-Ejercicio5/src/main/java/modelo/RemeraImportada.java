package modelo;

public class RemeraImportada extends Remera {
	private static final Double RECARGO = 0.03;
	private static final Double IMPUESTO_ADUANERO = 0.05;
	private static final Double GANANCIA = 0.25;

	public RemeraImportada(Double precioUnitario) {
		super.precioUnitario = precioUnitario;
	}

	@Override
	protected Double calcularRecargos() {
		return super.precioUnitario * (1.0 + RECARGO) * (1.0 + IMPUESTO_ADUANERO) * (1.0 + GANANCIA);
	}

}
