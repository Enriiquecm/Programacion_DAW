public class NumerosAleatorio {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.print(Math.random()*10 + "   ");
    }

    System.out.println();
    System.out.println();

    for (int i = 0; i < 10; i++) {
      System.out.print((int)(Math.random()*10)+ "   ");
    }

    System.out.println();
    System.out.println();

    for (int i = 0; i < 10; i++) {
      System.out.print((int)(Math.random()*11 + 50 )+"   ");
    }
  }
}
