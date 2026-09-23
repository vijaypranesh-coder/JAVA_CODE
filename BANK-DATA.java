class Payment {
    void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " made.");
    }
    void makePayment(double amount, String cardNumber) {
        System.out.println("Card Payment");
        System.out.println("Amount      : Rs." + amount);
        System.out.println("Card Number : " + cardNumber);
    }
    void makePayment(double amount, String cardNumber, String bankName) {
        System.out.println("Bank Payment");
        System.out.println("Amount      : Rs." + amount);
        System.out.println("Card Number : " + cardNumber);
        System.out.println("Bank Name   : " + bankName);
    }
}

class UPIPayment extends Payment {
    void makePayment(double amount) {
        System.out.println("UPI Payment");
        System.out.println("Amount      : Rs." + amount);
        System.out.println("Payment     : Successful");
    }
}

public class Bank_deta {
    public static void main(String[] args) {
        Payment payment = new Payment();
            System.out.println("----- Compile-Time Polymorphism -----");
            payment.makePayment(500);
            System.out.println();
            payment.makePayment(1000, "123456789012");
            System.out.println();
            payment.makePayment(2000, "987654321098", "ABC Bank");
            System.out.println("\n----- Runtime Polymorphism -----");
            Payment upi = new UPIPayment();
            upi.makePayment(1500);
    }
}