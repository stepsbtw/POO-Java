package steps;

public class Estrela extends CorpoCeleste{
	public Estrela(String id) {
		super(id);
	}
	
	@Override
	public String toString() {
		return "[Estrela] " + super.toString();
	}
}