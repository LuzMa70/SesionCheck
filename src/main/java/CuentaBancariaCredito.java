public class CuentaBancariaCredito extends CuentaBancaria {

    //limite

    private double limiteCredito;


    // Si la clase padre (superclass) tiene un constructor

    // hay que mandarlo a llamar en la clase hijo (subclass)

    public CuentaBancariaCredito(long numeroCuenta, double saldo, double limiteCredito){

        // super hace referencia al this  de la clase padre

        super (numeroCuenta, saldo); //Hay que llamar al constructor de la clase padre

        this.limiteCredito = limiteCredito;

    }

    //comprarCredito

    public void comprarCredito(double monto) {

        if (this.limiteCredito >= monto) {

            this.limiteCredito = this.limiteCredito - monto;

        }

    }

}

// class D extends C

// this -> todo lo interno de D

// super -> C

// class C extends B

// this -> todo lo interno de C

// super -> B

// class B extends A

// this -> todo lo interno de B

// super -> A (clase padre)

// class A

// this -> todo lo interno A

// Persona -> nombre, apellido

// PersonaFisica extends Persona -> nombre, apellido, rfc
