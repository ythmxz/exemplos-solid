package correct.postcondition;

import java.util.UUID;

public class S3ReportGenerator implements CloudReportGeneratorInterface {
	@Override
	public String generate() {
		// Código para gerar o relatório e salvar no S3 AWS

		String fileKey = "s3_report_" + UUID.randomUUID() + ".txt";

		return "https://s3.amazonaws.com/my-bucket/" + fileKey;
	}
}
