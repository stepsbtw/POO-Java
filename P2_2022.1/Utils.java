package steps;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Utils {
	public static boolean existe(
			Collection<CorpoCeleste> x,
			CorpoCeleste y
	) {
		return x.contains(y);
	}
	
	public static void ordena(List<CorpoCeleste> x) {
		Collections.sort(x);
	}
	
	public static Map<String,CorpoCeleste> retornaDados(Set<String> conjunto) throws FormatoIncorretoException{
		Iterator<String> i = conjunto.iterator();
		Map<String, CorpoCeleste> mapa = new HashMap<>();
		
		while(i.hasNext()) {
			String linha = i.next();
			String[] s = linha.split("#");
			if(s.length != 4) {
				throw new FormatoIncorretoException("FormatoIncorretoException: O formato da String ["+ linha +"] está incorreto. ");
			}
			
			String id = s[0];
			String nome = s[1];
			double distancia = Double.parseDouble(s[2]);
			String tipo = s[3];
			
			CorpoCeleste corpoCeleste;
			if(tipo.equals("E")) {
				corpoCeleste = new Estrela(id);
			}
			else if(tipo.equals("P")) {
				corpoCeleste = new Planeta(id);
			}
			else {
				throw new FormatoIncorretoException("FormatoIncorretoException: O formato da String ["+ linha +"] está incorreto. ");
			}
			corpoCeleste.setNome(nome);
            corpoCeleste.setDistancia(distancia);
            mapa.put(id, corpoCeleste);
		}
		return mapa;
	}
}
