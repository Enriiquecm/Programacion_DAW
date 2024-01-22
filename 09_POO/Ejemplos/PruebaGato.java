public class PruebaGato {
  public static void main(String[] args) {
    Gato garfield = new Gato("garfield");
    garfield.sexo = "macho";
    Gato kitty = new Gato("kitty", "negro", "egipcio","macho", 19, 4.2);
    kitty.sexo = "hembra";
    Gato botas = new Gato("botas");
    botas.sexo = "macho";


    garfield.come("pesCado");
    garfield.maulla();
    garfield.ronronea();
    garfield.peleaCon(botas);
    garfield.peleaCon(kitty);
    garfield.peleaCon(garfield);

    // System.out.print("¿Cuantos gatos quieres crear ?: ");
    // int num = Integer.parseInt(System.console().readLine());

    // Gato[] gaticos = new Gato[num];
    // String[] nombres = {"Garfield", "Botas" ,"Willy" , "Panchi" , "Misifú"};
    // String[]colores = {"Marrón", "Negro" , "Pardo"};


    // for (int i = 0; i < num; i++) {
    //   int nombreAleatorio = (int)(Math.random()*5);
    //   int colorAleatorio = (int)(Math.random()*3); 
    //   System.out.println("Que raza es el gato "+ i);
    //   String raza = System.console().readLine();
    //   gaticos[i] = new Gato(nombres[nombreAleatorio], colores[colorAleatorio], raza, "macho", 7, 5.9);
    // }

    // System.out.println();

    // for (int i = 0; i < gaticos.length; i++) {
    //   System.out.println(gaticos[i]. nombre);
    //   System.out.println(gaticos[i]. color);
    //   System.out.println(gaticos[i]. raza);
    //   System.out.println();
    // }
    // for (int i = 0; i < colores.length; i++) {
      
    // }
    // ///Preguntar lo que tengo que preguntar

    
      
  }
}
