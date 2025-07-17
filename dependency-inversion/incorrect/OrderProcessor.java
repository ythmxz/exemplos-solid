package incorrect;

public class OrderProcessor {
	NubankPaymentGateway nubankPaymentGateway;

	public OrderProcessor(NubankPaymentGateway nubankPaymentGateway) {
		this.nubankPaymentGateway = nubankPaymentGateway;
	}

	public void process(Order order) {
		// Lógica para processamento do pedido

		this.nubankPaymentGateway.pay(order);
	}
}
