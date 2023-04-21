package modelo;

public abstract class Remera {

	protected Double precioUnitario;

	public final Double calcularCostoRemera() {
		return this.precioUnitario + calcularRecargos();
	}

	protected abstract Double calcularRecargos();

}
