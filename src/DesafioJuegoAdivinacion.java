import java.util.Random;
import java.util.Scanner;

public class DesafioJuegoAdivinacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroIngresado = 0;
        int numeroAletorio = new Random().nextInt(100);;

        // Opcional para validar el numero correcto
         System.out.println(numeroAletorio);

        System.out.println("******* Bievenido al juego Advina el Numero ********");
        System.out.println(" -- Tienes 5 intentos --");

        for (int i = 0; i < 5; i++) {
            System.out.println( " Intento " + (i+1) + ", Ingrese un numero entre 0 a 100 ");
            numeroIngresado = scanner.nextInt();
            if ( numeroIngresado == numeroAletorio) {
                System.out.println("Felicidades Acertaste!!, el numero correcto es = " + numeroAletorio);
                break;
            } else if (numeroIngresado > numeroAletorio) {
                System.out.println("El numero Adivinar es Menor!, Intentelo nuevamente ");
            } else {
                System.out.println("El numero Adivinar es mayor!, Intentelo nuevamente ");
            }
//            System.out.println("El número a adivinar es " + (numeroIngresado < numeroAletorio ? " mayor" : "menor") + ".");
            }

        if (numeroIngresado != numeroAletorio) {
            System.out.println("\n Lo siento, Agotaste todos tus intentos, El numero correcto es = " + numeroAletorio);
        }
        scanner.close();
    }
}
