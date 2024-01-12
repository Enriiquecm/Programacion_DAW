public class T07Ejercicio05 {
  public static void main(String[] args) {
    double[] n ;
    n = new double [10];
    double max = Integer.MIN_VALUE;
    double min = Integer.MAX_VALUE;
    for (int i = 0; i < n.length; i++) {
      System.out.print("Nº " + (i+ 1)+ ": ");
      n[i] = Double.parseDouble(System.console().readLine());
      if (n[i] > max ){
        max = n[i];
      }
      if (n[i] < min ){
        min = n[i];
      }
    }
    for (int i = 0; i < n.length; i++) {
      System.out.print(n[i] + "  ");
      if (n[i]== max) {
        System.out.print(" maximo");
      }
      if (n[i]== min) {
        System.out.print(" mínimo");
      }
      System.out.println();
    }
    


  }
}
