public class CuentaBancaria {

    //Niveles de restricciones/acceso

    // PUBLIC Cualquiera puede leer/modificar

    // PRIVATE  Solo la clase internamente puede

    // PROTECTED Lo mismo que private y una clase hijo puede

    protected long numeroCuenta;// <-- this.numeroCuenta // protected permite usar los datos

    protected double saldo;//<-- this.saldo // pravate nadie puede manipular

    public CuentaBancaria(long numeroCuenta, double saldo) {

        this.numeroCuenta =numeroCuenta;//this hace referencia a todo lo que esta adentro

        this.saldo =saldo;

    }

    public void retirarDinero (int cantidad) {

        if(this.saldo >= cantidad) {

            this.saldo = this.saldo - cantidad;

        }

    }

    public void abonarDinero(int cantidad) {

        saldo = saldo + cantidad;

    }

    public long getNumeroCuenta() {

        return numeroCuenta;

    }

    public double getSaldo(){

        return saldo;

    }

}