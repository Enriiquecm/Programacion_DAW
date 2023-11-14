import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Enrique Capote
 */
public class T04Ejercicio18 {
  public static void main(String[] args) {
    int numIntro;
    int primCifr = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero para saber cual es su primera cifra (el maximo de cifras es 5): ");
    numIntro = sc.nextInt();

    if (numIntro >99999) {
      System.out.println("ERORRRRRRR");
    }
    if ((numIntro >= 10000 )&& (numIntro <= 99999)) {
      primCifr = numIntro / 10000;
      
      
    } else if ((numIntro >= 1000 )&& (numIntro <= 9999)) {
      primCifr = numIntro / 1000;
      
      
    } else if ((numIntro >= 100 )&& (numIntro <= 999)){
      primCifr = numIntro / 100;
      
      
    } else if ((numIntro >= 10 )&& (numIntro <= 99)){
      primCifr = numIntro / 10;
      
    } else {
      primCifr = numIntro ;
    }


    System.out.println("La primera cifra del numero: " + numIntro + " es "+ primCifr);
    sc.close();
  }
}
