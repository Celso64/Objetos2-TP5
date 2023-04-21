package modelo;

public abstract class Empleado {

  protected Double sueldo;

  public abstract Double calcularMonto();

  public abstract void agregarSubalterno(Empleado subalterno);

}
