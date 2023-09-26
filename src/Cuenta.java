import java.util.Random;

public class Cuenta {

    //Propiedades
    private double saldoDeCuenta;
    private String nombreDelTitular;
    private long numeroDeCuenta;

    //Metodo constructor
    public Cuenta (String nombreDelTitular, double saldoDeCuenta) {
        this.nombreDelTitular = nombreDelTitular;
        this.saldoDeCuenta = saldoDeCuenta;
        Random numAleatorioCuenta = new Random();
        this.numeroDeCuenta = Math.abs(numAleatorioCuenta.nextLong());
    }


    //Setters
    public void setIngreso(double ingreso) {
        this.saldoDeCuenta += ingreso;
    }
    public void setRetiro(double retiro) {
        this.saldoDeCuenta -= retiro;
    }

    //Getters
    public double getSaldoCuenta() {
        return saldoDeCuenta;
    }
    public String getDatosCuenta() {
        return "Nombre de titular: " + this.nombreDelTitular + "\nSaldo de cuenta: " + this.saldoDeCuenta + "\nNumero de cuenta: " + this.numeroDeCuenta  + "\n";
    }

}
