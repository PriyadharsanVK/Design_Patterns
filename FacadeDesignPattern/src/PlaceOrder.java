public class PlaceOrder {
    private Inventory inventory = new Inventory();
    private Payment payment = new Payment();
    private Invoice invoice = new Invoice();
    private Shipping shipping = new Shipping();

    public void placeOrder(){
        inventory.checkInventory();
        payment.processPayment();
        invoice.generateInvoice();
        shipping.orderShip();
    }
}
