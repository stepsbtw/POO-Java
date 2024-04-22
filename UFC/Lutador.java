// CLASSE ABSTRATA PARA EVITAR O INSTANCEAMENTO.
import java.util.ArrayList;
import java.util.Random;

public abstract class Lutador {
	private String nome;
	private double peso;
	private int idade;
	
	Lutador(String nome, double peso, int idade){
		this.nome = nome;
		this.peso = peso;
		this.idade = idade;
	}
	
	public static Lutador criarLutador(String nome, double peso, int idade) {
		if(peso <= 120.2 && peso > 93.0) {
			return new PesoPesado(nome,peso,idade);
		}else if(peso <= 93.0 && peso > 83.9) {
			return new PesoMeioPesado(nome,peso,idade);
		}else if(peso <= 83.9 && peso > 65.0) {
			return new PesoMedio(nome,peso,idade);
		}else if(peso <= 65){
			return new PesoPena(nome,peso,idade);
		}else {
			System.out.println("Lutador acima do peso limite (120.2kg)");
			return null;
		}
	}
	public String getNome() {
		return this.nome;
	}
	public double getPeso() {
		return this.peso;
	}
	public int getIdade() {
		return this.idade;
	}
	// toda vez que printar a classe como string roda esse metodo!
	public String toString() {
		return this.nome+"/"+this.peso+"/"+this.idade;
	}
	
	public ArrayList<Lutador> possiveisLutas(Lutador[] lutadores) {
		int i = 0;
		//Lutador[] possiveisLutadores = new Lutador[lutadores.length];
		ArrayList<Lutador> possiveisLutadores = new ArrayList<Lutador>();
		for(Lutador lutador : lutadores) {
			if(this.getClass() == lutador.getClass() && this != lutador){
				possiveisLutadores.add(lutador);
				i++;
			}
		}
		return possiveisLutadores;
	}
	
	public String categoriaLutador() {
		// class <Classe>
		return ((this.getClass()).toString()).split(" ")[1];
		/*
		if(this instanceof PesoPesado) {
			return "Peso Pesado";
		}else if(this instanceof PesoMeioPesado) {
			return "Peso Meio Pesado";
		}else if(this instanceof PesoMedio) {
			return "Peso Medio";
		}else {
			return "Peso Pena";
		}
		*/
	}
	
	public Lutador sorteioLuta(Lutador[] lutadores) {
		ArrayList<Lutador> possiveisLutadores = possiveisLutas(lutadores);
		Random rnd = new Random();
		int idx = rnd.nextInt(possiveisLutadores.size());
		//int idx = (int)((Math.random()) * possiveisLutadores.size());
		Lutador oponente = possiveisLutadores.get(idx);
		return oponente;
	}
}

class PesoPesado extends Lutador{
	public PesoPesado(String nome, double peso, int idade) {
		super(nome,peso,idade);
	}
}
class PesoMeioPesado extends Lutador{
	public PesoMeioPesado(String nome, double peso, int idade) {
		super(nome,peso,idade);
	}
}
class PesoMedio extends Lutador{
	public PesoMedio(String nome, double peso, int idade) {
		super(nome,peso,idade);
	}
}
class PesoPena extends Lutador{
	public PesoPena(String nome, double peso, int idade) {
		super(nome,peso,idade);
	}
}
