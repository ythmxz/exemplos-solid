package correct;

public class OrderProcessor {

    InventoryChecker inventoryChecker;
    OrderCalculator orderCalculator;
    PaymentProcessor paymentProcessor;

    public OrderProcessor(
            InventoryChecker inventoryChecker,
            OrderCalculator orderCalculator,
            PaymentProcessor paymentProcessor
    ) {
        this.inventoryChecker = inventoryChecker;
        this.orderCalculator = orderCalculator;
        this.paymentProcessor = paymentProcessor;
    }

    public void processOrder(Order order) {
        this.inventoryChecker.check(order);
        this.orderCalculator.calculate(order);
        this.paymentProcessor.process(order);
    }

}
