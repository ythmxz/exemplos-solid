package incorrect.postcondition;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReportProcessor {
	public void process(ReportGeneratorInterface reportGenerator) throws FileNotFoundException {
		if (reportGenerator instanceof S3ReportGenerator) {
			// ...
		}

		String path = reportGenerator.generate() + "\n";

		if (Files.notExists(Path.of(path)))
			throw new FileNotFoundException("O arquivo não existe");

		// Lógica para processar o arquivo
	}
}
