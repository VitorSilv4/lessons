package app;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

class Filme {
    String nameOfMoovie;
    int yearOfMovie;

    public Filme(String name, int year) {
        nameOfMoovie = name;
        yearOfMovie = year;
    };
};

class Elemento {
    private Filme filme;
    private Elemento proximo;

    public Elemento(Filme a) {
        this.filme = a;
        this.proximo = null;
    }

    public void imprime() {
        System.out.println("\nNome do filme: " + filme.nameOfMoovie + "\nAno do filme: " + filme.yearOfMovie);
        System.out.println("--------------------------------------------------------");
    }

    public Elemento getProximo() {
        return this.proximo;
    }

    public void setProximo(Elemento e) {
        this.proximo = e;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Elemento[] moovieList;
        Filme[] filme;
        String title;
        int number;

        System.out.println("Digite a quantidade de numeros que você quer salvar: ");

        int Quantity = scanner.nextInt();

        moovieList = new Elemento[Quantity];

        filme = new Filme[Quantity];

        for (int i = 0; i < moovieList.length; i++) {
            byte[] array = new byte[7]; // length is bounded by 7
            new Random().nextBytes(array);
            // System.out.println("Digite o nome do " + (i + 1) + "º filme:");
            // title = scanner.next();
            title = new String(array, Charset.forName("UTF-8"));

            // System.out.println("Digite o ano do " + (i + 1) + "º filme: ");
            // number = scanner.nextInt();

            number = new Random().nextInt();

            filme[i] = new Filme(title, number);

            moovieList[i] = new Elemento(filme[i]);
        }

        for (int z = 0; z < (moovieList.length - 1); z++) {
            moovieList[z].setProximo(moovieList[z + 1]);
        }

        System.out.println("\n-----------------------");

        Elemento lista = moovieList[0];

        while (lista != null) {
            lista.imprime();
            lista = lista.getProximo();
        }

        scanner.close();

    }
}