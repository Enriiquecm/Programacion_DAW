/**
 * Empezamos las herencias
 * 
 * @author Enrique Capote
 */
public class Persona {
  

  ////Atributos
  private String nombre;
  private int edad;
  private String dni;
  
  

  ////Constructor
  public Persona(String nombre, int edad, String dni) {
    this.nombre = nombre;
    this.edad = edad;
    this.dni = dni;
  }

  ////Metodos

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public String getDni() {
    return dni;
  }

  @Override
  public String toString() {
    return "Nombre=" + nombre + ", \tedad: " + edad + ", \tdni:" + dni ;
  }

  // public void mostrarDatos(){
  //   System.out.println("Nombre: " + nombre + "\t Edad: " + edad + "\tDNI: "+ dni);
  // }


    


  
}
