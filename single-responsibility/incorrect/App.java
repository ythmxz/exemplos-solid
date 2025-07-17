package incorrect;

public class App {

    public static void main(String[] args) {
        Order order = new Order(
                "550e8400-e29b-41d4-a716-446655440000",
                500);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder(order);
    }

}
