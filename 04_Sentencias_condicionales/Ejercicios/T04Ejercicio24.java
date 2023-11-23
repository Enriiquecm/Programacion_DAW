import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Enrique Capote
 */
public class T04Ejercicio24 {

  public static void main(String[] args) {
    int estadoc;
    int cargo;
    int diasviaj;
    double irpf = 0;
    int sueldob = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Que puesto tiene en la empresa: 1.P.JR 2.P.senior 3. Jefedeproy: ");
    cargo = sc.nextInt();
    System.out.print("¿Cuantos dias has estado de viaje visitando clientes? : ");
    diasviaj = sc.nextInt();
    System.out.print("Estado civil 1.casado 2.soltero: ");
    estadoc = sc.nextInt();
      switch (cargo) {
        case 1:
          sueldob = 950;
          break;
        case 2:
          sueldob = 1200;
          break;
        case 3:
          sueldob = 1900;
          break;
        default:
          System.out.println("No has introducido un cargo correcto");
          break;
      }
        if (estadoc == 1 ) {
          irpf = 20;

        } else {
          irpf = 25;
        }
    double dietas = diasviaj *30;
    double sueldobr = sueldob + dietas;
    double cargoirpf = ((sueldobr * irpf) /100);
    
    System.out.println("￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿");
    System.out.printf("￿ Sueldo base            %7.2d ￿\n", sueldob);
    System.out.printf("￿ Dietas (%2d viajes)     %7.2d ￿\n", diasviaj, dietas);
    System.out.println("￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿");
    System.out.printf("￿ Sueldo bruto           %7.2d ￿\n", sueldobr);

    System.out.printf("￿ Retención IRPF (%.0f%%)   %7.2d ￿\n", irpf, cargoirpf);
    System.out.println("￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿");
    System.out.printf("￿ Sueldo neto            %7.2d ￿\n", sueldobr - cargoirpf);
    System.out.println("￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿￿");
    sc.close();
  }
}
