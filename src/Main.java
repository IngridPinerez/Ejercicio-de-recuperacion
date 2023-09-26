import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double saldoCuenta = 0;
        String nombre = "";
        Cuenta cuenta1 = new Cuenta(nombre, saldoCuenta);

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int transaccion = 0;

        System.out.println("Bienvenido al mejor canal transaccional");


        do {
            System.out.println("Por favor seleccione la transaccion que desea realizar");
            System.out.println("1. Registrarse");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Ver saldo de cuenta");
            System.out.println("5. Ver los datos generales de su cuenta");
            System.out.println("6. Salir");
            transaccion = scanner.nextInt();

            switch(transaccion){
                case 1:
                    System.out.println("Ingrese su nombre completo");
                    nombre = scanner.next();
                    cuenta1 = new Cuenta(nombre, saldoCuenta);
                    System.out.println("Registro completado con exito. \n");
                    break;

                case 2:
                    if (nombre == ""){
                        System.out.println("Error: Debe estar registrado. \n");
                    }
                    else {
                        System.out.println("Ingrese el monto a depositar");
                        double ingreso = scanner.nextDouble();
                        cuenta1.setIngreso(ingreso);
                        System.out.println("Monto " + ingreso + " depositado con exito. \n");
                    }
                    break;

                case 3:
                    if (nombre == ""){
                        System.out.println("Error: Debe estar registrado. \n");
                    }
                    else {
                        System.out.println("Ingrese el monto a retirar");
                        double retiro = scanner.nextDouble();
                        if ((cuenta1.getSaldoCuenta()) >= retiro){
                            cuenta1.setRetiro(retiro);
                            System.out.println("Monto " + retiro + " retirado con exito. \n");
                        }
                        else {
                            System.out.println("Saldo insuficiente, por favor valide el saldo de su cuenta. \n");
                        }
                    }
                    break;

                case 4:
                    if (nombre == ""){
                        System.out.println("Error: Debe estar registrado. \n");
                    }
                    else {
                        System.out.println("El saldo de su cuenta es: " + cuenta1.getSaldoCuenta() + "\n");
                    }
                    break;

                case 5:
                    if (nombre == ""){
                        System.out.println("Error: Debe estar registrado. \n");
                    }
                    else {
                        System.out.println("Los datos de su cuenta son: \n" + cuenta1.getDatosCuenta() + "\n");
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del canal transaccional. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Error: Seleccione una opcion valida. \n");

            }
        } while (transaccion != 6);

    }
}