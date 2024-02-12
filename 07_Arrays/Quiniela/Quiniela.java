/**
 * Quiniela
 * 
 * @author Enrique Capote
 */

public class Quiniela {


  ////Método para crear la quiniela manualmente
  public static int[][] creaQuinielaManual(){
    int [][] apuesta = new int[14][3];
      for (int i = 0; i < apuesta.length; i++) {
        for (int j = 0; j < apuesta[i].length; j++) {   
          
            System.out.print("Introduce el resultado del partido "+ (i+1) + " de la quiniela " + (j+1)  + " si quiere poner empate use el número 0: ");    
            apuesta[i][j] = Integer.parseInt(System.console().readLine());
          
        }
      }
      return apuesta;
  }
  ////Método para crear la quiniela ganadora
  public static int[][] creaQuinielaGanadora(){
    int [][] apuesta = new int[14][1];
    for (int i = 0; i < apuesta.length; i++) {
      for (int j = 0; j < apuesta[i].length; j++) {   
        
          apuesta[i][j]= (int)(Math.random()*3);
        
      }
    }
    return apuesta;
  }

  ////Método para crear la quiniela aleatoriamente
  public static int[][] creaQuinielaAle(){
    int [][] apuesta = new int[14][3];
    for (int i = 0; i < apuesta.length; i++) {
      for (int j = 0; j < apuesta[i].length; j++) {   
        
          apuesta[i][j]= (int)(Math.random()*3);
        
      }
    }
    return apuesta;
  }
  ////Método para comparar la quiniela apostada con la ganadora
  public static void comparaApuesta(int[][] apuesta , int[][] ganadora){
    int puntos = 0;
    for (int j = 0; j < apuesta[0].length; j++) {
      for (int i = 0; i < apuesta.length; i++) {
        if (apuesta[i][j] == ganadora[i][0]) {
          puntos += 1;
        }
      }
      if (puntos >= 10) {
        System.out.println("Enhorabuena la quiniela numero "+ (j+1) + " ha sido premiada usted ha acertado "+ (puntos) + " partidos ");
      } else {
        System.out.println("Lo sentimos la quiniela numero "+ (j+1) + " no ha sido premiada, usted ha acertado "+ (puntos) + " partidos ");
      }

      puntos = 0;
      System.out.println();
    }

  }

  ////Método para mostrar la quiniela
  public static void muestraApuesta(int[][] apuesta ){
    for (int i = 0; i < apuesta.length; i++) {
      System.out.print((i+1) + ". \t");
      for (int j = 0; j < apuesta[i].length; j++) {
        switch (apuesta[i][j]) {
          case 0:
            System.out.print("| X |");
            break;
          case 1:
            System.out.print("|1  |");
            break;
          case 2:
            System.out.print("|  2|");
            break;
        
          default:
            break;
        }
        
      }
      System.out.println();
    }
    System.out.println("-----------------------");
    
  }
  ////Método para crear el pleno al quince aleatorio
  public static void plenoAlQuinceAle(){
    int resultadoLocal;
    int resultadoVisitante;

    resultadoLocal = (int)(Math.random()*3);
    resultadoVisitante = (int)(Math.random()*3);

    switch (resultadoLocal) {
      case 0:
        System.out.print("15. \t| Local " + resultadoLocal);
        break;
      case 1:
        System.out.print("15. \t| Local " + resultadoLocal);
        break;
      case 2:
        System.out.print("15. \t| Local " + resultadoLocal);
        break;
      case 3:
        System.out.print("15. \t| Local M" );
        break;
    
      default:
        break;
  }

  switch (resultadoVisitante) {
    case 0:
      System.out.print(" Visitante " + resultadoVisitante);
      break;
    case 1:
      System.out.print(" Visitante " + resultadoVisitante);
      break;
    case 2:
      System.out.print(" Visitante " + resultadoVisitante);
      break;
    case 3:
      System.out.print(" Visitante M" );
      break;
  
    default:
      break;
}
  }
  ////Método para crear el pleno al quince manual
  public static void plenoAlQuinceManual(){
    int resultadoLocal;
    int resultadoVisitante;
    System.out.println("Introdice el resultado del partido a pleno: ");
    System.out.println("0 para 0 goles, 1 para 1 gol , 2 para 2 goles y 3 para mas de 2 goles");

    do {

      System.out.print("Introduce el resultado del equipo local: ");
      resultadoLocal = Integer.parseInt(System.console().readLine());
    } while (resultadoLocal <0 || resultadoLocal>3);


    do {

    System.out.print("Introduce el resultado del equipo visitante: ");
      resultadoVisitante = Integer.parseInt(System.console().readLine());
    } while (resultadoVisitante < 0 || resultadoVisitante > 3);

    switch (resultadoLocal) {
      case 0:
        System.out.print("15. \t| Local " + resultadoLocal + " ");
        break;
      case 1:
        System.out.print("15. \t| Local " + resultadoLocal + " ");
        break;
      case 2:
        System.out.print("15. \t| Local " + resultadoLocal + " ");
        break;
      case 3:
        System.out.print("15. \t| Local M " );
        break;
    
      default:
        break;
    }

    switch (resultadoVisitante) {
      case 0:
        System.out.print("  Visitante " + resultadoVisitante);
        break;
      case 1:
        System.out.print("  Visitante " + resultadoVisitante);
        break;
      case 2:
        System.out.print("  Visitante " + resultadoVisitante);
        break;
      case 3:
        System.out.print("  Visitante M" );
        break;
    
      default:
        break;
  }
  }




  public static void main(String[] args) {
    int seleccion;
    int[][] apuesta = null;
    int[][] partidosAcabados = creaQuinielaGanadora();


    System.out.println("Como desea realizar su apuesta :");
    System.out.print("Aleatoriamente = 1 , Manualmente = 2:   ");
    do {
        seleccion = Integer.parseInt(System.console().readLine());
    
        switch (seleccion) {
          case 1:
            apuesta = creaQuinielaAle();

            System.out.println("ESTA ES SU APUESTA");
            System.out.println("-----------------------");
            muestraApuesta(apuesta);
            plenoAlQuinceAle();
            break;
          case 2: 
            apuesta = creaQuinielaManual();
            muestraApuesta(apuesta);
            plenoAlQuinceManual();
            
            break;
        
          default:
          System.out.println("Introduce otra vez su seleccion ya que no has introducido algo válido: ");
            break;
        }
    } while (seleccion >2 || seleccion < 1);

    System.out.println();

    System.out.println("ESTA ES LA APUESTA GANADORA DE LA SEMANA");
    System.out.println("------------------------------------------");
    muestraApuesta(partidosAcabados);
    plenoAlQuinceAle();
    System.out.println();

    comparaApuesta(apuesta, partidosAcabados);


    System.out.println();
    System.out.println();
  }
}
