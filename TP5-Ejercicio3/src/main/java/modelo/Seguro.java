package modelo;

public abstract class Seguro {

	protected Double costo;

	public Double calcularPrecio() {
		return this.costo;
	}

	public void agregarSeguroAlPaquete(Seguro seguro) {
	}

}
