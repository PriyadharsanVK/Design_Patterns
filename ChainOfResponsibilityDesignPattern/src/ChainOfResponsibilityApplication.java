public class ChainOfResponsibilityApplication {
    public static void main(String[] args){
        PaymentHandler bank = new BankPaymentHandler();
        PaymentHandler creditCard = new CreditCardPaymentHandler();
        PaymentHandler payPal = new PaypalPaymentHandler();
        bank.setNext(creditCard);
        creditCard.setNext(payPal);

        bank.handlePayment(600);
        bank.handlePayment(200);
        bank.handlePayment(1200);
        bank.handlePayment(600);
    }
}
