package steps;

public class Planeta extends CorpoCeleste{
	public Planeta(String id) {
		super(id);
	}
	
	@Override
	public String toString() {
		return "Planeta " + super.toString();
	}
}