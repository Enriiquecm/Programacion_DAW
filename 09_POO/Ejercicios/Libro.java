public class Libro extends Publicacion implements Prestable  {
  ////Atributos
  boolean prestado = false;

  


  public Libro(String iSBN, int anoPublicacion, String titulo) {
    super(iSBN, anoPublicacion, titulo);
  }


  ////Métodos
  @Override
  public void presta() {
    this.prestado = true;
  }


  @Override
  public boolean estaPrestado() {
    if (this.prestado == true) {
      return true;
    } else {
      return false;
    }
    
  }

  @Override
  public void devuelve() {
   this.prestado = false;
    
  }


  @Override
  public String toString() {
    
    return super.toString() ;
  }

}
