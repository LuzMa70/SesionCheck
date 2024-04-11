public class CajeroAutomatico {
    //Agregacion:usar clases dentro de otras clases
    CuentaBancaria cuenta;
    public CajeroAutomatico(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }
    public void retirar(int cantidad) {
        this.cuenta.retirarDinero(cantidad * 10);
        // this.cuenta.retirarDinero(cantidad); //sin usar get y set
        // this.cuenta.saldo = this.cuenta.saldo - (cantidad * 10);
    }

    public void abonar(int cantidad){
        // this.cuenta.numeroCuenta = 2321111; se quita esto cuando es private
        this.cuenta.abonarDinero(cantidad);
    }

    public static void main(String[] args) {
        CuentaBancaria coppel = new CuentaBancaria(12345456, 100);
        CajeroAutomatico cajero = new CajeroAutomatico(coppel);

        cajero.retirar(50);

        //System.out.println(coppel.saldo); //50
        // System.out.println(coppel.saldo); //-400 usando la opcion this.cuenta.saldo = this.cuenta.saldo - (cantidad * 10);
        System.out.println(coppel.getSaldo()); //usando get y set, nos permiten acceder al metodo o usarlo
    }

}