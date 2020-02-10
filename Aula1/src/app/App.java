package app;

import java.util.Scanner;

class Filme {
    String nameOfMoovie;
    int yearOfMovie;
    String[] genreOfMovie;

    public Filme(String name, int year, String genre0, String genre1) {
        nameOfMoovie = name;
        yearOfMovie = year;
        genreOfMovie = new String[2];
        genreOfMovie[0] = genre0;
        genreOfMovie[1] = genre1;
    };

    public void show() {
        System.out.println("\nNome do filme: " + nameOfMoovie + "\nAno do filme: " + yearOfMovie + "\nGenero 1: "
                + genreOfMovie[0] + "\nGenero 2: " + genreOfMovie[1]);
        System.out.println("--------------------------------------------------------");
    };
};

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        String title;
        int year;
        String genre0;
        String genre1;

        Filme[] filme;

        System.out.println("Digite a quantidade de filmes que você quer salvar: ");
        int Quantity = leitor.nextInt();

        filme = new Filme[Quantity];

        for (int i = 0; i < filme.length; i++) {

            System.out.println("Digite o nome do " + (i + 1) + "º filme: \n");
            title = leitor.next();

            System.out.println("\nDigite o ano do " + (i + 1) + "º filme: \n");
            year = leitor.nextInt();

            System.out.println("\nDigite o primeiro genero do " + (i + 1) + "º filme: \n");

            genre0 = leitor.next();

            System.out.println("\nDigite o segundo genero do " + (i + 1) + "º filme: \n");
            genre1 = leitor.next();

            System.out.println("------------------------------------------------");
            filme[i] = new Filme(title, year, genre0, genre1);
        }

        for (int i = 0; i < filme.length; i++) {
            filme[i].show();
        }

        leitor.close();
    }
}