/**
 * Creacion de la clase Coche como ejemplo
 * 
 * @author Enrique Capote Molina
 */

public class Coche {

    //Atributos
    String marca;
    String modelo;
    String color;
    String matricula;
    int numPuertas;

    //Metodos
    public void arrancar(){
        System.out.println("BRRRRR");
    }   

    public void velocidadMaxima (){
        System.out.println("Estoy llendo a 120");

    }
    public void sonarClaxon (){
        System.out.println("PIPIPIPIPIPI");
    }

    public static void main (String [] args){
        Coche car1 = new Coche();
        Coche seat = new Coche();

        car1.arrancar();
        seat.velocidadMaxima();
        
    } 
}