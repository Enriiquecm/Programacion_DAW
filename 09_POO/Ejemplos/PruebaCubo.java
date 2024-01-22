public class PruebaCubo {
  public static void main(String[] args) {
    Cubo cubo = new Cubo(10);
    Cubo cuboDestino = new Cubo(8);

    ////Definimos el contenido de los cubos
    cubo.setContenido(6);
    cuboDestino.setContenido(1);


    ////Pintamos los cubos
    cubo.pinta();
    System.out.println();
    cuboDestino.pinta();
    System.out.println();
    System.out.println();


    ////Usamos el metodo para volcar contenido de un cubo a otro

    cubo.vuelcaEn(cuboDestino);

    cubo.pinta();
    System.out.println();
    cuboDestino.pinta();
    System.out.println();
    System.out.println(cubo.toString());
  }
}
