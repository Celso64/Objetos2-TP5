package modelo;

public abstract class Remera {

	protected Double precioUnitario;

	public final Double calcularCostoRemera() {

		Double costoTotal = precioUnitario;

		costoTotal += calcularRecargo(costoTotal);
		costoTotal += calcularCostosExtras(costoTotal);
		costoTotal += calcularGanancia(costoTotal);

		return costoTotal;
	}

	protected abstract Double calcularRecargo(Double precio);

	protected abstract Double calcularCostosExtras(Double precio);

	protected abstract Double calcularGanancia(Double precio);

}
