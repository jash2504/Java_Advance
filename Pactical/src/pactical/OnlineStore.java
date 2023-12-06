
@FunctionalInterface
interface PaymentStrategy {

    void makePayment(double amount);
}

public class OnlineStore {

    public void processPayment(double amount, PaymentStrategy paymentStrategy) {
        paymentStrategy.makePayment(amount);
    }

    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();

        // Lambda expressions for payment strategies
        PaymentStrategy creditCardPayment = (amount) -> {
            System.out.println("Paid $" + amount + " via Credit Card");
            // Implement the actual credit card payment logic here
        };

        PaymentStrategy upiPayment = (amount) -> {
            System.out.println("Paid $" + amount + " via UPI");
            // Implement the actual UPI payment logic here
        };

        PaymentStrategy debitCardPayment = (amount) -> {
            System.out.println("Paid $" + amount + " via Debit Card");
            // Implement the actual debit card payment logic here
        };

        // Test scenarios using lambda expressions
        store.processPayment(100.0, creditCardPayment);
        store.processPayment(50.0, upiPayment);
        store.processPayment(75.0, debitCardPayment);
    }
}
