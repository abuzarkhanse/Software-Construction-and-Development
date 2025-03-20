package scd.Lab10.adapter;

public class PaymentAdapter implements NewPaymentProcessor {
    private OldPaymentGateway oldPaymentGateway;

    public PaymentAdapter(OldPaymentGateway oldPaymentGateway) {
        this.oldPaymentGateway = oldPaymentGateway;
    }

    @Override
    public String processPayment(String accountNumber, double amount) {
        return oldPaymentGateway.payWithCard(accountNumber, amount);
    }
}
