public class Main {

    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder("1234");
        OrderStatusService orderStatusService = new OrderStatusService();
        orderStatusService.updateOrderStatus("1234");
        OrderConfirmationService orderConfirmationService = new OrderConfirmationService();
        orderConfirmationService.sendOrderConfirmation("1234");
    }
}
