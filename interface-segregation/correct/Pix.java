package correct;

public class Pix implements PaymentMethodInterface, QrCodeGenerableInterface {
	@Override
	public void pay() {
		// Lógica para processar o pagamento via PIX
	}

	@Override
	public void generateQrCode() {
		// Lógica para gerar o QR Code
	}
}
