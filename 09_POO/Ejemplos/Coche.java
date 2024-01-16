/**
 * Clase de ejemplo "Coche"
 * 
 * @author Enrique Capote
 */

 public class Coche {

  // Atributos
  String matricula;
  String color;
  String modelo;
  String marca;
  int puertas;
  int potencia;

  public static void main(String[] args) {
    Coche miCoche = new Coche();
    Coche tuCoche = new Coche();

    miCoche.matricula = "1234ABC";
    System.out.println("Matricula de miCoche: "+ miCoche.matricula);
    System.out.println("Puertas de miCoche: "+ miCoche.puertas);
    System.out.println("Matricula de tuCoche: "+ tuCoche.matricula);
    System.out.println("Puertas de tuCoche: "+ tuCoche.puertas);
  }
 }