package incorrect.postcondition;

import java.util.UUID;

public class CSVReportGenerator implements ReportGeneratorInterface{
	@Override
	public String generate() {
		// Código para gerar o relatório em CSV

		return "/reports/report_" + UUID.randomUUID() + ".csv";
	}
}
