package scd.Lab10.adapter;

public class OldPaymentGateway {
    public String payWithCard(String cardNumber, double amount) {
        return "Processing payment of $" + amount + " using card: " + cardNumber;
    }
}
