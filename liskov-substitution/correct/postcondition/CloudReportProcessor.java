package correct.postcondition;

import org.w3c.dom.DOMException;

import java.nio.file.Path;

public class CloudReportProcessor {
	public void process(CloudReportGeneratorInterface reportProcessor) {
		String url = reportProcessor.generate() + "\n";

		if (!Path.of(url).toFile().exists())
			throw new DOMException(DOMException.NOT_FOUND_ERR, "O endereço não existe");

		// Lógica para processar o arquivo
	}
}
