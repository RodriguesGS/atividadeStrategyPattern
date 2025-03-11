package org.example;

import java.util.Random;

public class BoletoPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        StringBuilder boletoCode = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 48; i++) { // Gerá um código com 48 caracteres (Padrão de boleto)
            boletoCode.append(random.nextInt(10));
        }
        System.out.println("Código do Boleto: " + boletoCode);
    }
}
