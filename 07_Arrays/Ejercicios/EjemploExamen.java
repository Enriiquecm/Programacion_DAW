public class EjemploExamen {


  public static void main(String[] args) {
  
  int[] dado = {1,2,3,4,5,6};
  int y = 0;
  int puntuación1 = 0;
  int puntuación2 = 0;
  for (int i = 0; i < 10; i++) {
    for (int j = 0; j < dado.length; j++) {
      int k = (int)(Math.random()*6) ;
      System.out.print(dado[k]+ " ");
      switch (k) {
        case 1:
          k++;
          break;
        case 2:
          k++;
          break;
        case 3:
          k++;
          break;
        case 4:
          k++;
          break;
        case 5:
          k++;
          break;
        case 6:
          k++;
          break;
  
      }
      switch (y) {
        case 2:
          
          break;
        case 3:
          puntuación1 += 6;
          break;
        case 4:
          puntuación1 += 9;
          break;
        case 5:
          puntuación1 += 12;
          break;
        default:
          break;
      }
    }
  }

  }
}
