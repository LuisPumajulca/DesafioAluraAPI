public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a Screem Main");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1990;
        boolean incluidoEnElPaquete = true;
        double notaDeLaPelicula = 9.0;

        double media = (8.0 + 7.5 + 9.0) / 3;
        System.out.println("media total: " + media);

        String sinopsis = """
                MAtrix es una paradoja
                La mejor pelicula del fin del milenio
                Fue lanzada en:""" +" "+ fechaDeLanzamiento;


        System.out.println(sinopsis);

        String nombre = "Maria";
        int edad = 30;
        double valor = 55.9999;
        System.out.printf("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares%n", nombre, edad, valor);

    }
}