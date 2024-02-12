public class T07Ejercicio12 {
  public static void main(String[] args) {
    int[] original = new int[10];
    int[] copia = new int[10];

    int nFinal;
    int nInicial;
    boolean continuar = true;

    System.out.print("Introduce los valores del array (10): ");


    for (int i = 0; i < original.length; i++) {
      original[i] = Integer.parseInt(System.console().readLine());

    }
    System.out.println("Array original: ");
    System.out.print("Indice ");
    for (int i = 0; i < original.length; i++) {
      System.out.printf("%4d", i);
    }
    System.out.print("\nValor  ");
    for (int i = 0; i < original.length; i++) {
      System.out.printf("%4d", original[i]);
    }


    do{
    System.out.println();
    System.out.println("Introduce el numero incial: ");
    nInicial = Integer.parseInt(System.console().readLine());

    System.out.println("Introduce el número final: ");
    nFinal = Integer.parseInt(System.console().readLine());

    if (nFinal < nInicial) {
      System.out.println("Incorrecto el número inicial debe ser inferior");
      continuar = false;
    } 

    if ((nFinal < 0) || (nFinal >9) || (nInicial < 0) || (nInicial >9)) {
      System.out.println("ERROR DEBS INTRODUCIR UN NUMERO ENTRE 0 Y 9");
      continuar = false;
    }
    }while (!continuar); 

    ////Copio el array
    for (int i = 0; i < copia.length; i++) {
      copia[i] = original[i];
    }

    copia[nFinal] = copia[nInicial];

    ////Copiamos valores desde la posicion siguiente a la de nFinal
    for (int i = nFinal+ 1; i < copia.length; i++) {
      copia[i] = original[i -1];
    }
    copia [0] = original[original.length -1];

    ////Copiamos valores desde la primera posicion del original hasta nInicial
    for (int i = 0; i < nInicial; i++) {
      copia[i+1] = original[i];
    }

    System.out.println("Array final: ");
    System.out.print("Indice ");
    for (int i = 0; i < copia.length; i++) {
      System.out.printf("%4d", i);
    }
    System.out.print("\nValor  ");
    for (int i = 0; i < copia.length; i++) {
      System.out.printf("%4d", copia[i]);
    }
      
  }
}

