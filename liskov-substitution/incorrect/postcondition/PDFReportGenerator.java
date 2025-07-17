package incorrect.postcondition;

import java.util.UUID;

public class PDFReportGenerator implements ReportGeneratorInterface{
	@Override
	public String generate() {
		// Código para gerar o relatório em PDF

		return "/reports/report_" + UUID.randomUUID() + ".pdf";
	}
}
