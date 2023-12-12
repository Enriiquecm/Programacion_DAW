/**
 * Explica tu codigo aqui
 * @author Enrique Capote
 */
import java.util.Scanner;
public class T05Histograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int i = 0;
        int copia = 0;
        int numCompleto = 0;
        int mult = 1;
        int resto = 10;
        int divisor = 1;
        System.out.println("Introduce el simbolo para hacer la tabla: ");
        String caracter = sc.nextLine();

        System.out.println("Introduzca numeros entre 0 y 9. Si desea parar introduzca numero negativo");
        while ((num>=0)&&(num<10)) {

            num = sc.nextInt();
            i ++;
            copia = num;
            if ((copia>=0)&&(copia<10)) {
                copia *= mult;
                mult *= 10;
                numCompleto = numCompleto + copia;
            }
        }

        for (int j = 0; j < (i -1 ); i++) {
            int digito = ((numCompleto%resto)/divisor);
            System.out.println(" --- --- --- --- --- --- --- --- --- ---");
            System.out.print("| " + digito + " |");
            
                for (int g = 0; g < digito; g++) {
                    System.out.print(" " + caracter + " |");
                }

                int huecos = 9 - digito;
                for (int f = 0; f < huecos;f++) {
                    System.out.print("   |");
                }

                System.out.println( "");
            resto *= 10;
            divisor *= 10;
        }
        sc.close();
    }
}