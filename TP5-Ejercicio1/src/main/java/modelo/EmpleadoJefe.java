package modelo;

import java.util.LinkedList;
import java.util.List;

public class EmpleadoJefe extends Empleado {

  private List<Empleado> subalternos;

  public EmpleadoJefe(Double sueldo) {
    super.sueldo = sueldo;
    this.subalternos = new LinkedList<Empleado>();
  }

  @Override
  public Double calcularMonto() {
    return this.subalternos.stream()
                           .mapToDouble(Empleado::calcularMonto)
                           .reduce(this.sueldo, Double::sum);
  }

  @Override
  public void agregarSubalterno(Empleado subalterno) {
    this.subalternos.add(subalterno);
  }

}
