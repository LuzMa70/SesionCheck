public class CuentaBancariaEmpresarial extends CuentaBancariaCredito {
    // numeroCuenta -> CuentaBancaria

    // saldo -> CuentaBancaria

    // limiteCredito -> CuentaBancariaCredito

    private double inversion;

    private double rendimiento;

    public CuentaBancariaEmpresarial(long numeroCuenta, double saldo, double limiteCredito, double inversion, double rendimiento){

        super(numeroCuenta,saldo,limiteCredito);

        this.inversion =inversion;

        this.rendimiento =rendimiento;

    }

}

// Empresarial

// super -> Credito

// Credito

// super -> Bancaria

// Bancaria (this)

//Arriba hacia abajo (Especializacion/HERENCIA): Bancaria ->Credito->Empresarial

//Abajo hacia arriba (Generalizacion/POLIMORFISMO): Empresarial ->Credito ->Bancaria

// Una cuenta bancaria puede ser una cuenta Empresarial

// Una cuaneta bancaria puede ser una cuenta de Crédito

// Animal -> Caninos -> Lobos -> Perros

// Animal -> Felinos -> Gatos

// Un animal es un gato

// Un animal es un lobo

// Un lobo es un perro

// Un felino es un gato

// Un canino es un gato X


// Belleza, Jugueteria, Supermercado, Electrónica -> Producto

/**

 Electronica laptop = new Electronica();

 Producto laptop = new Electronica(); <--- Polimorfismo (Generalización)

 Producto crema = new Belleza();

 cremaBelleza = (Belleza) crema; <-- Casting, convertir de un tipo A a un tipo B

 */
