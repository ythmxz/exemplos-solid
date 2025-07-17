package correct.postcondition;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LocalReportProcessor {
	public void process(LocalReportGeneratorInterface reportGenerator) throws FileNotFoundException {
		String path = reportGenerator.generate() + "\n";

		if (!Files.exists(Path.of(path)))
			throw new FileNotFoundException("O arquivo não existe");

		// Lógica para processar o arquivo
	}
}
