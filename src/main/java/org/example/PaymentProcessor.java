package org.example;

public class PaymentProcessor {
    private PaymentStrategy strategy;

    public PaymentProcessor(PaymentStrategy strategy) { // Construtor
        this.strategy = strategy;
    }

    public void processo(double amount) {  // Retorno que executa o Strategy
        strategy.processPayment(amount);
    }
}
