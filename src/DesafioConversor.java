public class DesafioConversor {
    public static void main(String[] args) {
        System.out.println("*************Conversor de Temperaturas****************");

        int temperaturaEnCelcius = 24;
        double conversorAFaherenheit = (temperaturaEnCelcius * 1.8) + 32;

        System.out.println("Temperatura = " + temperaturaEnCelcius);
        System.out.println("Valor convertido a Faherenheit con decimales es: " + conversorAFaherenheit);

        //Formato Metodo Casting
        System.out.println("----Metodo Casting----");

        int redondearValorFinal = (int) conversorAFaherenheit;
        System.out.println("Valor Faherenheit sin decimales: " + redondearValorFinal);

        //Formato Metodo TextBlocks
        System.out.println("----Método TextBlock, Java 15+----");

        String mensaje = """
                Realizamos la conversion de la temperatura en Celcius, temperatura = %d Celcius
                Al realizar la conversion obtenemos como dato convertido en Faherenheit sin decimales, temperatura Convertida = %.0f Faherenheit
                """.formatted(temperaturaEnCelcius,conversorAFaherenheit);

        System.out.println(mensaje);;
    }
}
