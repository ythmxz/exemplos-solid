package incorrect;

public class Boleto implements PaymentMethodInterface{

	@Override
	public void pay() {
		// Lógica para processar o pagamento via Boleto
	}

	@Override
	public void generateQrCode() {
		throw new IllegalCallerException("Pagamento via Boleto não gera QR Code");
	}

	@Override
	public void generateDocument() {
		// Lógica para gerar o Boleto
	}
}
