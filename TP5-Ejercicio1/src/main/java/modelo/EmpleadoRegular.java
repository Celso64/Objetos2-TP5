package modelo;

public class EmpleadoRegular extends Empleado {



  public EmpleadoRegular(Double sueldo) {
    super.sueldo = sueldo;
  }

  @Override
  public Double calcularMonto() {
    return this.sueldo;
  }

  @Override
  public void agregarSubalterno(Empleado subalterno) {}

}
