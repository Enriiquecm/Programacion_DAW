import java.util.Scanner;

public class T04Ejercicio25 {
    public static void main(String[] args) {
        double altura;
        double anchura;
        String esc;
        final double gastosenv = 3.50;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura de la bandera: ");
        altura = sc.nextDouble();
        System.out.print("Introduce la anchura de la bandera: ");
        anchura = sc.nextDouble();
        System.out.println("Quiere el escudo bordado: (s/n) ");
        esc = sc.next();

        double area = altura * anchura;
        double precioesc = 0;
        double precioarea = area * 0.01;
        double total;

        if (esc.equals("s")) {
            precioesc = 2.5;
        }

        total = precioarea + precioesc + gastosenv;

        System.out.println("Gracias. Aquí tiene el desglose de su compra.");

        if (esc.equals("s")) {
            System.out.printf("Bandera de %d cm2: %.2f €\n", (int) area, precioarea);
            System.out.printf("%-18s %.2f €\n", "Con escudo:", precioesc);
            System.out.printf("%-18s %.2f €\n", "Gastos de envío:", gastosenv);
        } else {
            System.out.printf("Bandera de %d cm2: %.2f €\n", (int) area, precioarea);
        }

        System.out.printf("%-18s %.2f €\n", "Total:", total);

        sc.close();
    }
}
