package incorrect;

public class Pix implements PaymentMethodInterface{
	@Override
	public void pay() {
		// Lógica para processar o pagamento via PIX
	}

	@Override
	public void generateQrCode() {
		// Lógica para gerar o QR Code
	}

	@Override
	public void generateDocument() {
		throw new IllegalCallerException("Pagamento via PIX não gera Boleto");
	}
}
