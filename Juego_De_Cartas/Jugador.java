
public class Jugador {
  ////Atributos
  int saldo;
  String nombre;



  ////Constructor
  public Jugador(int saldo, String nombre) {
    this.saldo = saldo;
    this.nombre = nombre;
  }

  ////Métodos
  //Getters
  public int getSaldo() {
    return saldo;
  }

  public String getNombre() {
    return nombre;
  }

  //Setters
  public void setSaldo(int saldo) {
    this.saldo = saldo;
  } 
  
}
