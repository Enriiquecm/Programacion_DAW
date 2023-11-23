/**
 * T05Ejercicio22
 */
public class T05Ejercicio22 {

  public static void main(String[] args) {
    int i = 2;
    do {
      i++;
      if (i% -2 != 0) {
        if (i % -3 != 0) {
          if (i % -5 != 0) {
            if (i % -10 != 0) {
              System.out.println(i);
            }
          }
        }
      }
    } while (i <=100);
  }
}
