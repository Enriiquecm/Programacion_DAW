public class Array03 {
  public static void main(String[] args) {
    int [] num = new int [10];
    num [0] = 8;
    num [1] = 33;
    num [2] = 200;
    num [3] = 150;
    num [4] = 11;
    num [5] = 88;
    num [6] = num [2] * 10;
    num [7] = num [2] / 10;
    num [8] = num [0]+ num [1] + num[2];
    num [9] = num[8];
    //for (int i = 0; i < 9; i++) {
    //}
    System.out.print("Los valores del array son los siguientes: ");
    for (int i = 0; i < num.length; i++) {
      System.out.print(num [i] + "  ");
    }
    System.out.println();
  }
}
