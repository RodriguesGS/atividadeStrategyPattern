package org.example;

import java.util.Random;

public class    PixPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        String codigoPix = "Pix: " + new Random().nextInt(10000000); // Gera uma simulação do que seria um código Pix
        System.out.println("Código Pix gerado: " + codigoPix);
    }
}
