public class Gato {

  /////Atributos
  String nombre;
  String color;
  String raza;
  String sexo;
  Double peso;
  int edad;

  /////Constructores
  Gato(String nombre){
    this.nombre = nombre;
  }
  Gato(String nombre ,String color,String raza ,String sexo ,int edad , double peso){
    this.nombre = nombre;
    this.color = color;
    this.raza = raza;
    this.sexo = sexo;
    this.peso = peso;
    this.edad = edad;
  }

  //////Métodos
  void maulla(){
    System.out.println("MIAAAAAAAAu!");
  }
  void ronronea(){
    System.out.println("BRRRRRRR bbsitaaa ua");
  }

  

  public String getNombre() {
    return nombre;
  }
  void come (String comida){
    if (comida.equalsIgnoreCase("pescado")) {
      System.out.println("ñam ñam!");
    } else {
      System.out.println("puaj");
    }
  }

  void peleaCon(Gato contrincante){
    if (this.sexo.equals(contrincante.sexo) && this.sexo.equals("macho")) {
      System.out.println("Ven aqui que te reviento");
      double suerte =(int)(Math.random()*10);
      if (suerte > 5) {
        System.out.println("gana "+ contrincante.getNombre());
      } else {
        System.out.println("Gana " + this.getNombre());
      }
    } else {
      System.out.println("No me gusta pelear.");
    }
  }

}
