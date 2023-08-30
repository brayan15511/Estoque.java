package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Adicione as informações do produto:");
        System.out.print("Nome:");
        product.name = sc.nextLine();
        System.out.print("Preço:");
        product.price = sc.nextDouble();
        System.out.print("Quantidade no estoque:");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Informações do produto: " + product);

        String resposta;
        do {
            System.out.print("Tem produtos a serem adicionados no estoque? (Y/N):");
            resposta = sc.next();
        } while (!resposta.equals("Y") && !resposta.equals("N"));

        if (resposta.equals("Y")) {
            System.out.print("Coloque a quantidade de produtos que serão adicionados no estoque: ");
            int quantity = sc.nextInt();
            product.addProducts(quantity);

            System.out.println();
            System.out.println("Atualização de informações: " + product);
        } else {
            String resposta2;
            do {
                System.out.print("Tem produtos a serem retirados no estoque? (Y/N):");
                resposta2 = sc.next();
            } while (!resposta2.equals("Y") && !resposta2.equals("N"));

            if (resposta2.equals("Y")) {
                System.out.print("Coloque a quantidade de produtos que serão removidas no estoque: ");
                int quantity = sc.nextInt();
                product.removeProducts(quantity);

                System.out.println();
                System.out.println("Atualização de informações: " + product);
            } else {
                System.out.println();
                System.out.println("Atualização de informações: " + product);
            }
        }
    }
}
