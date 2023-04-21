package modelo;

public abstract class Remera {

	protected Double precioUnitario;

	public final Double calcularCostoRemera() {

		Double costoTotal = precioUnitario;

		costoTotal += calcularRecargo();
		costoTotal += calcularCostosExtras();
		costoTotal += calcularGanancia();

		return costoTotal;
	}

	protected abstract Double calcularRecargo();

	protected abstract Double calcularCostosExtras();

	protected abstract Double calcularGanancia();

}
