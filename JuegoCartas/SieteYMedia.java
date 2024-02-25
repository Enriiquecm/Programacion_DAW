/**
 * JUEGO SIETE Y MEDIA
 * 
 * 
 * @author David Márquez Córdoba
 * @author Enrique Capote Molina
 */

 public class SieteYMedia {

  public static void main(String[] args) {

    //Atributos
    String nombreJugador;
    int apuesta = 0;
    boolean continuar = true;
    Carta cartaEnJuegoJugador;
    Carta cartaIA;
    boolean repetir;
    String sRepetir;
    boolean seguirJugado = true;
    String sSeguirJugando = null;

    
    //Lógica previa, creación de Jugador
    Jugador jugador1 = new Jugador();




    //Lógica
do {
      System.out.print("\033[H\033[2J");
      System.out.flush();  
      System.out.println("---------------------------------------------------------------------\n");
      System.out.println("+===============================================================+");
      System.out.println("|\t\tBienvenido al juego SIETE y MEDIA\t\t|");
      System.out.println("+===============================================================+");
      System.out.println("\nJugarás contra la IA, sacarás cartas de la baraja hasta llegar");
      System.out.println("a 7 puntos y medio, pero sin pasarte\n");
      System.out.println("Nota: Empiezas con un saldo inicial de 1000 puntos.\n");
      System.out.println("+ - - - - - - - - - - - +");
      System.out.println("|\tCOMENCEMOS\t|");
      System.out.println("+ - - - - - - - - - - - +\n");
  
      System.out.println("1º Creando baraja...");
  
      Baraja baraja1 = new Baraja();
  
      System.out.println("\n** Baraja creada con éxito **\n");
  
      
      // System.out.println("Barajas");
      // System.out.println("=======");
      // baraja1.mostrarBaraja();
  
      System.out.println("2º Ahora vamos a barajarlas...");
  
      baraja1.barajar();
  
      System.out.println("\n** Barajadas con éxito **\n");
  
      // System.out.println("Cartas barajadas");
      // System.out.println("================");
      // baraja1.mostrarBaraja();
  
  
      // System.out.println("\nAhora vamos a extraer una carta");
      // baraja1.extraerCarta();
      // baraja1.mostrarCartaExtraida();
  
      System.out.print("Ingrese su nombre: ");
      nombreJugador = System.console().readLine();
      jugador1.setNombre(nombreJugador);
      seguirJugado = true;
  
      //Creamos la mano o turno del jugador
      Mano manoJugador = new Mano();
      Mano manoIA = new Mano();
  
  
  
  
  
  do {   
  

  
      do {
        //Reiniciamos valor
        repetir = false;
  
        //Comprueba si su saldo es igual o inferior a 0
        if (jugador1.getSaldo() <= 0) {
          System.out.println("\nLo siento, no te queda más dinero");
          //En ese caso, el juego finalizaría
          System.out.println(" **** F I N ****\n");
          //Y se pide al usuario si quiere repetir el juego
          System.out.print("¿Desea repetir el juego?: ");
          sRepetir = System.console().readLine();

          if (jugador1.getSaldo() == 0 && seguirJugado ) {
            jugador1.setSaldoGanador(1000);
          }
  
          if (sRepetir.equalsIgnoreCase("si")) {
            repetir = true;
            continuar = true;
            seguirJugado = false;
              
          } else if (sRepetir.equalsIgnoreCase("no")){
            repetir = false;
            seguirJugado = false;
            continuar=false;
          }
  
  
  
  
        //En caso que tengamos dinero suficiente para apostar, pediremos cuánto 
        } else {
  
          //Reseteamos valor
          continuar = true;
  
          System.out.print("¿Cuánto quiere apostar "+jugador1.getNombre()+"?: ");
          apuesta = Integer.parseInt(System.console().readLine());
      
          //Evaluamos las distintas casuísticas
          // 1º Que la apuesta sea mayor al saldo restante
          // 2º Que apueste 0 €
          // 3º Que apueste números negativos
          // 4º Que apueste menos de lo que tiene
          if (apuesta > jugador1.getSaldo()) {
            System.out.println("\nLo siento, no puedes apostar más del dinero que tienes");
            System.out.println("Eres un ludópata, míratelo.\n");
            continuar=false;
          } else if (apuesta == 0){
            System.out.println("Debes apostar un mínimo");
            continuar = false;
          } else if (apuesta < 0) {
            System.out.println("No puedes apostar en negativo !!");
            continuar = false;
          } else if (apuesta <= jugador1.getSaldo()){
            continuar = true ;
            repetir = true;
          }
        }
  
      } while (!continuar  && repetir );
  
      if (!repetir) {
        continuar = false;
      }
      

        if (continuar && seguirJugado) {
          System.out.println("\n**********************************************");
          System.out.println("*** ¿Hasta dónde estás dispuesto a llegar? ***");
          System.out.println("**********************************************\n");
      
          /////////////////////////////
          ////////TURNO JUGADOR////////
          /////////////////////////////
      
      
            baraja1.barajar();
            manoIA.reinicia();
            manoJugador.reinicia();
            do {
              seguirJugado = true;
        
              //Creamos un objeto tipo Carta donde almacenaremos la carta extraida de la baraja para poder acceder a sus datos
              cartaEnJuegoJugador = baraja1.extraerCarta();
          
              System.out.print("Ha sacado el ");
              baraja1.mostrarCartaExtraida(cartaEnJuegoJugador);
        
              // System.out.println(cartaEnJuego.getValor());
              manoJugador.acumula(cartaEnJuegoJugador);
        
              System.out.print("\n\nTotal puntos acumulados en esta ronda: " + manoJugador.getPuntosAcumulados()+"\n");
          
              //Comprobamos que no se ha pasado
              if (manoJugador.getPuntosAcumulados() < 7.5) {
        
                System.out.print("\n¿Desea continuar?: ");
                sSeguirJugando = System.console().readLine();
                
                
                if (sSeguirJugando.equalsIgnoreCase("si")) {
                  seguirJugado = true;
        
                } else if (sSeguirJugando.equalsIgnoreCase("no")) {
                  seguirJugado = false;
                }        
        
              } else if (manoJugador.getPuntosAcumulados() > 7.5) {
                System.out.println("Te has pasado");
                jugador1.setSaldoPerdedor(apuesta);
                System.out.println("Tu nuevo saldo es :" +  jugador1.getSaldo());
                break;
        
              } else if (manoJugador.getPuntosAcumulados() == 7.5) {
                System.out.println("Has llegado a 7,5 esperemos a ver que hace la crupiere");
                break;
              }

            } while (seguirJugado);
        
            /////////////////////////////
            //////////TURNO  IA//////////
            /////////////////////////////
        
            if (manoJugador.getPuntosAcumulados() <= 7.5) {
              System.out.print("\033[H\033[2J");
              System.out.flush(); 
              System.out.println("******************");
              System.out.println("*     TURNO IA   *");
              System.out.println("******************");
          
              
              //Reiniciamos el turno
              seguirJugado = true;
            do{  
          
                cartaIA = baraja1.extraerCarta();
                System.out.print("El crupiere ha sacado el ");
                baraja1.mostrarCartaExtraida(cartaIA);
                System.out.println();
          
                manoIA.acumula(cartaIA);
          
          
              if (manoIA.getPuntosAcumulados() > manoJugador.getPuntosAcumulados() && manoIA.getPuntosAcumulados() < 7.5) {
          
                seguirJugado = false;
                jugador1.setSaldoPerdedor(apuesta);
                System.out.println("Has perdido lo sentimos tu nuevo saldo es "+ jugador1.getSaldo());
                
              } else if (manoIA.getPuntosAcumulados() > 7.5) {
                jugador1.setSaldoGanador(apuesta);
                System.out.println("Has ganado felicidades tu nuevo saldo es "+ jugador1.getSaldo());
                seguirJugado = false;
                break;
          
              } else if (manoJugador.getPuntosAcumulados() == manoIA.getPuntosAcumulados()) {
                System.out.println("Empate esta ronda no habrá vencedor tu saldo se te devuelve");
                seguirJugado = false;
          
              } else if (manoIA.getPuntosAcumulados() < manoJugador.getPuntosAcumulados()){
                seguirJugado = true;
              } else if (manoIA.getPuntosAcumulados() > manoJugador.getPuntosAcumulados()){
                seguirJugado = false;
                jugador1.setSaldoPerdedor(apuesta);
                System.out.println("El crupiere te ha superado , tu nuevo saldo es: "+ jugador1.getSaldo());
              }
          
          
          
            } while (seguirJugado);
            }
      
      
          seguirJugado = false;
          System.out.print("\n¿Desea jugar otra ronda?: ");
                sSeguirJugando = System.console().readLine();
                
                
                if (sSeguirJugando.equalsIgnoreCase("si")) {
                  seguirJugado = true;
                  System.out.print("\033[H\033[2J");
                  System.out.flush();
        
                } else if (sSeguirJugando.equalsIgnoreCase("no")) {
                  seguirJugado = false;
                  System.out.print("\033[H\033[2J");
                  System.out.flush();
                  
                }  
                
        
      }
        
     }while (seguirJugado );

     if (sSeguirJugando.equalsIgnoreCase("no")) {
      seguirJugado = true;
      repetir = false;
     }
  }while (!seguirJugado && repetir );
} 
}