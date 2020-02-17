package app;

import java.util.Scanner;

class Elemento {
    private int valor;
    private Elemento proximo;

    public Elemento(int v) {
        this.valor = v;
        this.proximo = null;
    }

    public void imprime() {
        System.out.println("Valor: " + this.valor);
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

        System.out.println("Digite a quantidade de numeros que você quer salvar: ");

        Elemento[] numberList;

        int number;
        int Quantity = scanner.nextInt();

        numberList = new Elemento[Quantity];

        for (int i = 0; i < numberList.length; i++) {

            System.out.println("Digite o " + (i + 1) + "º numero: ");

            number = scanner.nextInt();

            numberList[i] = new Elemento(number);
        }

        for (int z = 0; z < (numberList.length - 1); z++) {
            numberList[z].setProximo(numberList[z + 1]);
        }

        Elemento lista = numberList[0];

        while (lista != null) {
            lista.imprime();
            lista = lista.getProximo();
        }

        scanner.close();

    }
}