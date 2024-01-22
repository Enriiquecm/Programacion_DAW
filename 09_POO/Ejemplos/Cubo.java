public class Cubo {

  ////Atributos
  private int capacidad;      /////Capacidad máxima en litros
  private int contenido;      /////Contenido actual en litros
  

  ////Constructor
  public Cubo (int cap){
    this.capacidad = cap;
  }

  ////Getters
  public int getCapacidad(){
    return this.capacidad;
  }
  
  public int getContenido (){
    return this.contenido;
  }

  ////Setters
  public void setContenido(int contenido){
    this.contenido = contenido;
  }

  ////ToString
  @Override
  public String toString() {
    return "Cubo [capacidad = " + this.capacidad + ", contenido=" + this.contenido + "]";
  }

  ////Métodos
  void vaciaCubo(){
    this.contenido = 0;
  }



  public void llenaCubo(){
    this.contenido = this.capacidad;
  }

  public void pinta() {
    for (int nivel = this.capacidad; nivel > 0; nivel--) {
      if (this.contenido >= nivel) {
      System.out.println("#💧💧💧💧#");
      } else {
      System.out.println("#        #");
      }
    }
    System.out.println("##########");
  }


    /**
* Vuelca el contenido de un cubo sobre otro.
* Antes de echar el agua se comprueba cuánto le cabe al
* cubo destino.
*/
void vuelcaEn(Cubo destino) {
  int libres = destino.getCapacidad() - destino.getContenido();
      if (libres > 0) {
      if (this.contenido <= libres) {
      destino.setContenido(destino.getContenido() + this.contenido);
      this.vaciaCubo();
      } else {
      this.contenido -= libres;
      destino.llenaCubo();
      }
    }
  }
  
}


