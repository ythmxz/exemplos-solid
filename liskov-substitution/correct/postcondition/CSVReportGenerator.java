package correct.postcondition;

import java.util.UUID;

public class CSVReportGenerator implements LocalReportGeneratorInterface {
	@Override
	public String generate() {
		// Código para gerar o relatório em CSV

		return "/reports/report_" + UUID.randomUUID() + ".csv";
	}
}
