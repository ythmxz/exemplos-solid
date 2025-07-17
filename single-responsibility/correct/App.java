package correct;

public class App {

    public static void main(String[] args) {
        Order order = new Order(
                "550e8400-e29b-41d4-a716-446655440000",
                500
        );

        InventoryChecker inventoryChecker = new InventoryChecker();
        OrderCalculator orderCalculator = new OrderCalculator();
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        OrderProcessor orderProcessor = new OrderProcessor(
                inventoryChecker,
                orderCalculator,
                paymentProcessor
        );

        orderProcessor.processOrder(order);
    }

}
