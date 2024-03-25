
public class Teste {
	public static void main(String[] args) {
		
		Lutador l1 = Lutador.criarLutador("Caio", 75.0, 19);
		Lutador l2 = new PesoMedio("Caio",75.0,19);
		PesoMedio l3 = new PesoMedio("Caio",75.0,19);
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		
		System.out.println(l1.getClass());
		System.out.println(l2.getClass());
		System.out.println(l3.getClass());
		
		System.out.println(l1 instanceof PesoMedio);
		System.out.println(l2 instanceof PesoMedio);
		System.out.println(l3 instanceof PesoMedio);
		
		System.out.println(l1 instanceof Lutador);
		System.out.println(l2 instanceof Lutador);
		System.out.println(l3 instanceof Lutador);
		
		System.out.println(l1.categoriaLutador());
	}
}
