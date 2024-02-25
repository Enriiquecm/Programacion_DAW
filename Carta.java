
/**
 * Cartas de la baraja
 */
public class Carta {
  
  ////Atributos
  private double puntuacion;
  private String valor;
  private String palo;
  

  ////Constructor
  public Carta( double puntuacion,String valor, String palo) {
    this.valor = valor;
    this.puntuacion = puntuacion;
    this.palo = palo;
  }
  

  ////Métodos

 // El toString devuelve un dibujo de la carta
  @Override
  public String toString() {
    return String.format("  _______\n |       |\n |   %2s  |\n |   %s   |\n |_______|\n ",valor.charAt(0) , palo.charAt(0));

  }

  public double getPuntuacion() {
    return puntuacion;
  }


  public String getValor() {
    return valor;
  }


  public String getPalo() {
    return palo;
  }
  
  
}