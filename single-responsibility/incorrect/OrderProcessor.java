package incorrect;

public class OrderProcessor {

    public void processOrder(Order order) {
        checkInventory(order);
        calculateTotal(order);
        processPayment(order);
    }

    public void checkInventory(Order order) {
        // Lógica para verificar o estoque
    }

    public void calculateTotal(Order order) {
        // Lógica para calcular o total
    }

    public void processPayment(Order order) {
        // Lógica para processar o pagamento
    }

}
