public class Revista extends Publicacion  {
  ////Atributos

  int numeroRevista;

  ////Métodos


  //Constructot
  
  public Revista (String iSBN , int anoPublicacion , String titulo , int numeroRevista){
    super ( iSBN  , anoPublicacion  ,titulo );
    numeroRevista = this.numeroRevista;
  }

  @Override
  public String toString() {
    
    return super.toString() + "Num de revista: "+ this.numeroRevista;
  }
}
