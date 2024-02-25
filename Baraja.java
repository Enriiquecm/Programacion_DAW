
public class Baraja {



  ////Atributos
  private String[] palo = {"Oros", "Bastos" , "Espadas" , "Copas"};
  private String[] valor = {"1","2","3","4","5","6","7","Sota","Caballo","Rey"};
  private Carta[] cartas;
  private int numCartas;
  private double[] puntuacion = {1.0 , 2.0 , 3.0 , 4.0 , 5.0 , 6.0 , 7.0 , 0.5 , 0.5 , 0.5};

  ////Constructor
  public Baraja(){
    numCartas = this.palo.length * this.valor.length;
    cartas = new Carta[numCartas];
    iniciaBaraja();
    //mostrarBaraja();
  }

  ////Métodos
 
  public void iniciaBaraja() {
    int k = 0;
    for (int i = 0; i < palo.length; i++) {
      for (int j = 0; j < valor.length; j++) {

        ////Construimos cada carta
        cartas[k] = new Carta(puntuacion[j] , valor[j] , palo[i]);
        k++;
      }
    }
  }

  public void mostrarBaraja(){
    for (int i = 0; i < numCartas; i++) {
      System.out.println(cartas[i].toString());
    }
  }

  public void mezclarBaraja(){
    
    for (int i = 0; i < numCartas; i++) {
      int aux = (int)(Math.random()*40);
      Carta temp = cartas[i];
      cartas[i] = cartas[aux];
      cartas[aux] = temp; 
    }
}
  public Carta[] getCartas() {
    return cartas;
  }
  
}
