package incorrect;

public class CreditCard implements PaymentMethodInterface{
	@Override
	public void pay() {
		// Lógica para processar o pagamento via Cartão de Crédito
	}

	@Override
	public void generateQrCode() {
		throw new IllegalCallerException("Pagamento via Cartão de Crédito não gera QR Code");
	}

	@Override
	public void generateDocument() {
		throw new IllegalCallerException("Pagamento via Cartão de Crédito não gera Boleto");
	}
}
