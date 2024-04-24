import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Write the name of your favorite film");
        String movie = keyBoard.nextLine();

        System.out.println("Now, write the release date");
        int releaseDate = keyBoard.nextInt();

        System.out.println("Finally, What score do you give to this movie?");
        double score = keyBoard.nextDouble();

        keyBoard.close();

        System.out.println(movie);
        System.out.println(releaseDate);
        System.out.println(score);

    }
}
