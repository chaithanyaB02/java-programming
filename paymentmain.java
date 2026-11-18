import java.util.Scanner;

// --- Parent Class ---
class Payment {

    // Base method to be overridden
    public double calculateAmount(double amount) {
        return amount; // Base implementation returns the raw amount
    }

    // Overloaded method: accepts an amount and a discount percentage
    public double calculateAmount(double amount, double discountPercentage) {
        double discount = amount * (discountPercentage / 100.0);
        return amount - discount;
    }
}

// --- Subclasses ---
class CardPayment extends Payment {
    // Overriding: Apply 2% transaction fee for credit cards
    @Override
    public double calculateAmount(double amount) {
        double fee = amount * 0.02;
        return amount + fee;
    }
}

class UPIPayment extends Payment {
    // Overriding: Apply flat 0.5% cashback/discount for UPI promotional offer
    @Override
    public double calculateAmount(double amount) {
        double discount = amount * 0.005;
        return amount - discount;
    }
}

// --- Main Demonstration ---
public class paymentmain {
    public static void main(String[] args) {
        double basePrice = 1000.0;
        double discountPercent = 10.0;

        System.out.println("=== 1. Compile-Time Polymorphism (Method Overloading) ===");
        Payment basePayment = new Payment();

        // The compiler determines which method to bind based on the arguments passed
        double finalPriceNoDiscount = basePayment.calculateAmount(basePrice);
        double finalPriceWithDiscount = basePayment.calculateAmount(basePrice, discountPercent);

        System.out.println("Original Price: $" + basePrice);
        System.out.println("Without Discount (Single Param): $" + finalPriceNoDiscount);
        System.out.println("With " + discountPercent + "% Discount (Two Params): $" + finalPriceWithDiscount);
        System.out.println();

        System.out.println("=== 2. Run-Time Polymorphism (Method Overriding) ===");
        // Using a parent reference to point to subclass objects
        Payment payment1 = new CardPayment();
        Payment payment2 = new UPIPayment();

        // The JVM determines which implementation to execute at runtime based on the actual object type
        System.out.println("Card Payment Total (2% fee applied): $" + payment1.calculateAmount(basePrice));
        System.out.println("UPI Payment Total (0.5% discount applied): $" + payment2.calculateAmount(basePrice));
    }
}
