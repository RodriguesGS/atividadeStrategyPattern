package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("1: Pix");
        System.out.println("2: Cartão de Crédito");
        System.out.println("3: Boleto");
        System.out.println("==========================");

        System.out.print("Digite uma opção: ");
        int op = scanner.nextInt();
        System.out.print("Digite o valor da transação: ");
        double pag = scanner.nextDouble();
        scanner.nextLine();

        PaymentStrategy strategy = null;

        switch(op) {
            case 1:
                strategy = new PixPayment();
                break;
            case 2:
                strategy = new CreditCardPayment();
                break;
            case 3:
                strategy = new BoletoPayment();
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        PaymentProcessor processor = new PaymentProcessor(strategy);
        processor.processo(pag);
    }
}