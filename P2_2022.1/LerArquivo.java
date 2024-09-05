package steps;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LerArquivo {
	public static Set<String> retornaString(String caminhoArquivo) throws IOException{
		List<String> linhas = Files.readAllLines(Paths.get(caminhoArquivo));
		Set<String> conjuntoCorpos = new HashSet<>(linhas);
		return conjuntoCorpos;
	}
}
