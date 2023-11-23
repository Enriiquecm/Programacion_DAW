import java.util.Scanner;

/**
 * Calcula la nota de un trimestre de la asignatura Programación. 
 * El programa pedirá las dos notas que ha sacado el alumno en los dos primeros controles. 
 * Si la media de los dos controles da un número mayor o igual a 5, el alumno está aprobado y se mostrará la media. 
 * En caso de que la media sea un número menor que 5, el alumno habrá tenido que hacer el examen de 
 * recuperación que se califica como apto o no apto, por tanto se debe preguntar al usuario 
 * ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). 
 * Si el resultado de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene la nota media anterior.
 * 
 * @author Enrique Capote
 */
public class T04Ejercicio21 {
  public static void main(String[] args) {
    int nota = 0;
    int nota2 = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("Con este programa comprobaremos si has aprobado este trimestre");
    System.out.print("Introduce tu primera nota: ");
    nota = sc.nextInt();
    System.out.print("Introduce la segunda nota: ");
    nota2 = sc.nextInt();
    double media = (nota + nota2) / 2;
    if (media < 5) {
    System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): "); 
    String recuperacion = System.console().readLine();
      if (recuperacion.equals("apto")) {
        media = 5; 
        System.out.print("Tu nota de Programación es " + media);
      }
}   
  }
}
