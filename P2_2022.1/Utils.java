package steps;
import java.util.Collection;
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
		x.sort(null);
	}
	
	public Map<String,CorpoCeleste> retornaDados(Set<String> conjunto) throws FormatoIncorretoException{
		Iterator<String> i = conjunto.iterator();
		String corpo = i.next();
		Map<String, CorpoCeleste> mapa = new HashMap<String,CorpoCeleste>();
		
		while(i.hasNext()) {
			String[] s = corpo.split("#");
			if(s.length != 4) {
				throw new FormatoIncorretoException(corpo);
			}
			
			String id = s[0];
			String nome = s[1];
			double distancia = Double.parseDouble(s[2]);
			String tipo = s[3];
			
			if(tipo.equals("E")) {
				Estrela e = new Estrela(id);
				e.setNome(nome);
				e.setDistancia(distancia);
				mapa.put(id, e);
			}
			if(tipo.equals("P")) {
				Planeta p = new Planeta(id);
				p.setNome(nome);
				p.setDistancia(distancia);
				mapa.put(id, p);
			}
		}
		return mapa;
	}
}
