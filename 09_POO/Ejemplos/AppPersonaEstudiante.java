public class AppPersonaEstudiante {
  public static void main(String[] args) {
    Persona p = new Persona("Pepe Garcia", 16, "12324435P");
    Persona e = new Estudiante("Enrique Capote", 19, "54532456P");
    Profesor prof = new Profesor("Jose", 42, "12376721L", "Informatica", 12435.67);
    // e.mostrarDatos();
    // p.mostrarDatos();
    System.out.println(p.toString());
    System.out.println(p);
    System.out.println(e.toString());
    System.out.println(e);
    System.out.println(prof.toString());
    System.out.println(prof);


  }
}
