import java.util.Scanner;

public class T04Ejercicio14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Introduce un numero para saber si es par y/o dibisible entre 5");
    num = sc.nextInt();
    double par = num % 2;
    double cinco = num % 5;

    if ((par == 0) && (cinco == 0) ) {
      System.out.println(" El número es par y divisible entre 5 ");
      
    } else if ((par == 0) && (cinco != 0)){
      System.out.println("Tu numero es par y no divisible entre 5");
      
    } else if ((par != 0) && (cinco == 0)){
      System.out.println("Tu numero no es par pero si divisible entre 5");

    } else {
      System.out.println("Tu numero no es ni par ni divisible entre 5");
    }
    

    sc.close();
  }
}
