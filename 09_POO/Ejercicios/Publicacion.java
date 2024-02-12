/**
 * Publicacion
 */
public class Publicacion {

  ////Atributos
  private String iSBN;
  private int anoPublicacion;
  private String titulo;
  

  ////Métodos
  public String getISBN() {
    return iSBN;
  }
  public int getAnoPublicacion() {
    return anoPublicacion;
  }
  public String getTitulo() {
    return titulo;
  }

  //Constructor

  public Publicacion(String iSBN, int anoPublicacion, String titulo) {
    this.iSBN = iSBN;
    this.anoPublicacion = anoPublicacion;
    this.titulo = titulo;
  }


  //toString
  
  @Override
  public String toString() {
    return "Publicacion [iSBN=" + iSBN + ", anoPublicacion=" + anoPublicacion + ", titulo=" + titulo + "]";
  }

  


}