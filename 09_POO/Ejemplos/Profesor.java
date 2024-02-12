public class Profesor extends Persona{
  ////Atributos
  private String departamento;
  private double sueldo;


  ////Constructor
  public Profesor(String nombre, int edad, String dni, String departamento, double sueldo) {
    super(nombre, edad, dni);
    this.departamento = departamento;
    this.sueldo = sueldo;
  }

  public String getDepartamento() {
    return departamento;
  }

  public double getSueldo() {
    return sueldo;
  }
  @Override
  public String toString() {
    return super.toString() + "\t[Profesor] departamento : " + departamento;
  }
  
}
