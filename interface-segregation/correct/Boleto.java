package correct;

public class Boleto implements PaymentMethodInterface, DocumentGenerableInterface {

	@Override
	public void pay() {
		// Lógica para processar o pagamento via Boleto
	}

	@Override
	public void generateDocument() {
		// Lógica para gerar o Boleto
	}
}
