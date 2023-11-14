import java.util.Scanner;

public class T04Ejercicio22 {
  public static void main(String[] args) {
    String dia;
    final int MINUTOSTOTALES = (4 * 24 * 60) + (15 * 60);
    int diasTranscurridos = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Por favor introduce un dia de la semana (L-V) ");
    dia = sc.nextLine();
    
    // Ver cuantos dias han pasado desde el lunes a las 00:00
    switch (dia) {
      case "lunes":
        diasTranscurridos = 0;
        break;
      case "martes":
        diasTranscurridos = 1;
        break;
      case "miércoles":
        diasTranscurridos = 2;
        break;
      case "jueves":
        diasTranscurridos = 3;
        break;
      case "viernes":
        diasTranscurridos = 4;
        
        break;
    
      default:
        break;
    }
    System.out.print(("Por favor introduce una hora): "));
    int horas = sc.nextInt();
    System.out.println("Introduce los  minutos");
    int minutos = sc.nextInt();
    sc.close();

    int minutosTranscurridos = (diasTranscurridos * 24 * 60)+ (horas * 60) + minutos;
    System.out.println("Faltan " + (MINUTOSTOTALES - minutosTranscurridos) + " minutos para llegar al finde semana");
  }
}
