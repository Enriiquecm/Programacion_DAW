public class Array02 {
  public static void main(String[] args) {
    int [] n = {20,34,3,67,-4}; //declaramos los valores de la variable de distinta forma


    System.out.print("Los valores del array son : ");
    System.out.println(n [0] +" , "+ n [1] + " , "+ n [2]+ " , " + n[3] + " , " + n[4]);
    int suma = n[1] + n [4];
    System.out.println( " la suma de n1 y n4 es : "+ suma);

    System.out.println(" El array contiene "+ n.length +" elementos cual desea ver ? ");
    int posicion = Integer.parseInt(System.console().readLine());
    System.out.println(" El elemento que se encuentra en la posicion "+ posicion + " es el " + n[posicion -1]);
  }
}
