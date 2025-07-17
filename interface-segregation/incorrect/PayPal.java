package incorrect;

public class PayPal implements PaymentMethodInterface{
	@Override
	public void pay() {
		// Lógica para processar o pagamento via PayPal
	}

	@Override
	public void generateQrCode() {
		throw new IllegalCallerException("Pagamento via PayPal não gera QR Code");
	}

	@Override
	public void generateDocument() {
		throw new IllegalCallerException("Pagamento via PayPal não gera Boleto");
	}
}
