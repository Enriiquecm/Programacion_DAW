/**
 * Herencia de persona
 * 
 * @author Enrique Capote
 */
public class Estudiante extends Persona{

  ////Atributos
  private int creditos;

  ////Constructores
  public Estudiante(String nombreEstudiante , int edadEstudiante , String dniEstudiante){
    super(nombreEstudiante, edadEstudiante, dniEstudiante);
    this.creditos = 60;
  }

  public Estudiante(String nombreEstudiante , int edadEstudiante, String dniEstudiante , int creditos){
    super(nombreEstudiante, edadEstudiante, dniEstudiante);
    this.creditos = creditos;
  }

  public int getCreditos (){
    return this.creditos;
  }

  @Override
  public String toString() {
    return super.toString() + "\t[Estudiante] creditos: " + creditos;
  }

  // @Override
  // public void mostrarDatos(){
  //   super.mostrarDatos();
  //   System.out.println("Estudiante matriculado de " + creditos + "creditos: " + creditos);
  // }

  

}
