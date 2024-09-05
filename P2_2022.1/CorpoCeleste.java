package steps;

public class CorpoCeleste implements Comparable<CorpoCeleste>{
	private String id;
	private String nome;
	private double distancia;
	
	public CorpoCeleste(String id) {
		this.id = id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof CorpoCeleste) {
			CorpoCeleste c = (CorpoCeleste)o;
			return this.id.equals(c.id);
		}
		else {
			return false;
		}
	}
	
	@Override
	public int compareTo(CorpoCeleste c) {
		return Double.compare(this.distancia,c.distancia);
	}
	
	@Override
	public String toString() {
		return id + " " + nome + " " + distancia;
	}
}
