package correct;

public class OrderProcessor {
	PaymentGatewayInterface paymentGateway;

	public OrderProcessor(PaymentGatewayInterface paymentGateway) {
		this.paymentGateway = paymentGateway;
	}

	public void process(Order order) {
		// Lógica para processamento do pedido

		this.paymentGateway.pay(order);
	}
}
