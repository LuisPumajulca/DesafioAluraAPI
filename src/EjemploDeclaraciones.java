

public class EjemploDeclaraciones {
    public static void main(String[] args) {
        int diaSemana = 3;
        String nombreDia;

        switch (diaSemana) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            // Otros casos para el resto de los días de la semana
            default:
                nombreDia = "Día desconocido";
        }
        System.out.println("Hoy es " + nombreDia);
    }
}





