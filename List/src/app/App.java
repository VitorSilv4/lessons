package app;

import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        LinkedList<String> list = new LinkedList<String>();

        Scanner scanner = new Scanner(System.in);
        int quantity;

        System.out.println("Quantos nomes você quer colocar na lista ?");
        quantity = scanner.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.println("Digite o " + (i + 1) + "º nome: ");
            list.add(scanner.next());
            System.out.println("\n -----------------------------------------");
        }

        for (String names : list) {
            System.out.println(names + "\n -----------------------------------------");
        }
        scanner.close();
    }
}