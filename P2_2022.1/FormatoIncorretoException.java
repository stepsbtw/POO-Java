package steps;

@SuppressWarnings("serial")
public class FormatoIncorretoException extends Exception{

	public FormatoIncorretoException(String s) {
		super("FormatoIncorretoException: O formato da String ["+ s +"] está incorreto. ");
	}

}
