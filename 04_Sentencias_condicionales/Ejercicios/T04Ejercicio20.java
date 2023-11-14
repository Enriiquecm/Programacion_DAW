import java.util.Scanner;

public class T04Ejercicio20 {
  public static void main(String[] args) {
    int n;
    int der = 0;
    int izq = 0;
    int resta = (izq - der) ;
    boolean capicua = false;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero (5 cifras como maximo ) para saber si es capicua");
    n = sc.nextInt();
    sc.close();

    //Numero 1 cifra
    if (n < 10) {
      capicua = true;
    }
    //Numero 2 cifra
    if (n>= 10 && (n<100)) {
      if ((n/10) == n%10) {
        capicua = true;
      }
    }
    //Numero 3 cifras
    if ((n>= 100) && (n<1000)){
      if ((n / 100) == (n%10)) {
        capicua = true;
      }
    }
    //Numero 4 cifras
    if ((n>= 1000) && (n<10000)){
       izq = n / 100;
       der = n % 100;
       if (izq == resta + der){
        capicua = true;
       }
        
      }
      //Numero 5 cifras
    if ((n>= 10000) && (n<100000)){
       izq = n / 1000;
       der = n % 100;
       if (izq == (resta + der)){
        capicua = true;
       }
      }
      //seis cifras
      if ((n>= 100000) && (n<1000000)){
       izq = (n / 1000);
       der = (n % 1000);
       if (izq == (resta + der)){
        capicua = true;
       }
      }
      //Siete cifras
      if ((n>= 1000000) && (n<10000000)){
       izq = n / 10000;
       der = n % 1000;
       if (izq == (resta + der)){
        capicua = true;
       }
      }
      System.out.println(" capicua es " + capicua);
    }
    
  }

