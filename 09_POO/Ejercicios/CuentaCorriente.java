public class CuentaCorriente {

  ////Atributos
  private String numeroCuenta = "";
  private double saldo;
  

  ////Constructores
  public CuentaCorriente (){
    generarAleatorio();


  }

  public CuentaCorriente (double saldoInicial){
    generarAleatorio();
    this.saldo = saldoInicial;
  }

  public void generarAleatorio( ){
    for (int i = 0; i < 10; i++) {
      numeroCuenta += (int)(Math.random()*10);
    }
  }

  public void ingreso(double cantidad){
    this.saldo += cantidad;
  }

  public void cargo(double cantidad){
    this.saldo -= cantidad;
  }

  public void transferencia(CuentaCorriente destino, double cantidad){
    destino.saldo += cantidad;
    this.saldo -= cantidad;
  }

  public double getSaldo() {
    return saldo;
  }

  public String getNumero(){
    return numeroCuenta;
  }

  @Override
  public String toString() {
    return "CuentaCorriente [ numeroCuenta = " + numeroCuenta + " , saldo = " + saldo + " ]";
  }
  public static void main(String[] args) {

    CuentaCorriente[] cuentas ;
    
    CuentaCorriente cuenta1 = new CuentaCorriente(); 
    CuentaCorriente cuenta2 = new CuentaCorriente(1500); 
    CuentaCorriente cuenta3 = new CuentaCorriente(6000); 
    System.out.println(cuenta1); 
    System.out.println(cuenta2); 
    System.out.println(cuenta3);
    cuenta1.ingreso(2000);
    cuenta2.cargo(600);
    cuenta3.ingreso(75);
    cuenta1.cargo(55);
    cuenta2.transferencia(cuenta3, 100);
    System.out.println(cuenta1);
    System.out.println(cuenta2);
    System.out.println(cuenta3);
  }




}
