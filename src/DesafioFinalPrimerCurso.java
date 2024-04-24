import java.util.Scanner;

public class DesafioFinalPrimerCurso {
    /*
    Nombre de cliente: Tony Stark
    Tipo de cuenta: Corriente
    Saldo Disponible: 1599.99$
    *
    Escriba el numero de la opcion deseada
    1 - Consultar Saldo
    2 - Retirar
    3 - Depositar
    9 - Salir
    * */
    public static void main(String[] args) {
        //
        String nombreCliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldoDisponible = 1599.99;

        // Mensaje Informacion cuenta bancaria
        System.out.println("-------Banco Pichincha------");
        String datosCliente = """
                ***************************
                
                Nombre de CLiente: %s
                Tipo de cuenta: %s
                Saldo disponible: %.2f
                
                ***************************
                """.formatted(nombreCliente,tipoCuenta,saldoDisponible);
        System.out.println(datosCliente);

        //Mensaje Operativas
        String menuOperativas = """
                 --Escriba el número de la opcion deseada--
                 1 - Consultar Saldo
                 2 - Retirar
                 3 - Depositar
                 9 - Salir
                """;
        // Logica para las ejecuciones de operativas
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 9) {
            System.out.println(menuOperativas);
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.println("Saldo Disponible: " + saldoDisponible);
            } else if (opcion == 2) {
                System.out.print("Ingrese la cantidad a retirar: ");
                double cantidadRetirar = scanner.nextDouble();
                if (cantidadRetirar > saldoDisponible) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldoDisponible -= cantidadRetirar;
                    System.out.println("Retiro exitoso");
                }
            } else if (opcion == 3) {
                System.out.print("Ingrese la cantidad a depositar: ");
                double cantidadDepositar = scanner.nextDouble();
                saldoDisponible += cantidadDepositar;
                System.out.println("Depósito exitoso");
            } else if (opcion == 9) {
                System.out.println("Gracias por usar nuestro servicio");
            } else {
                System.out.println("Opción inválida, intente nuevamente");
            }
        }
        scanner.close();
    }
}
