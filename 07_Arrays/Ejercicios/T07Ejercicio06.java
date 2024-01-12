public class T07Ejercicio06 {
  public static void main(String[] args) {
    int[] nRotao;
    nRotao = new int[15];

    //Escritura del array
    for (int i = 0; i < nRotao.length; i++) {
      System.out.print("Nº " + (i+ 1)+ ": ");
      nRotao[i] = Integer.parseInt(System.console().readLine());
    }

    for (int i = 0; i < nRotao.length; i++) {
      System.out.print(nRotao[i] + "  ");
    }
    System.out.println();
    System.out.println("");

    //Rotar array
    int veces = 0;
    System.out.println("Introduce el numero de veces que quieres que rote el array: ");
    veces = Integer.parseInt(System.console().readLine());

    int aux = nRotao[14];
    for (int i = 0; i < veces; i++) {
      for (int j = nRotao.length - 1; j > 0; j--) {
        nRotao[j] = nRotao[j - 1] ; 
      }
      nRotao[0] = aux;
      aux = nRotao[14];
      
      
    }
    for (int h = 0; h < nRotao.length; h++) {
      System.out.print(nRotao[h] + "  ");
    }
     System.out.println("");
  }
}
