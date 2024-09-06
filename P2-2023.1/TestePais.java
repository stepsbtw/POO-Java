package q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Pais{
	private String codigo;
	private String nome;
	private double dim;
	private List<Pais> fronteiras = new ArrayList<>();
	private int pop;
	Pais(double d, int p){
		dim = d;
		pop = p;
	}
	double getDensidade() {
		return pop/dim;
	}
	
	Pais(String cod){
		codigo = cod.toUpperCase();
	}
	Pais(String codigo, String nome, double dim){
		this(codigo);
		this.nome = nome;
		this.dim = dim;
	}
	
	static void addFronteira(Pais p1, Pais p2){
		p1.fronteiras.add(p2);
		p2.fronteiras.add(p1);
	}
	public void setPopulacao(int pop) {
		this.pop = pop;
	}
	public void setDimensao(int dim) {
		this.dim = dim;
	}
	public int getPopulacao() {
		return pop;
	}
	public double getDimensao() {
		return dim;
	}
	public List<Pais> getFronteiras(){
		return new ArrayList<>(fronteiras);
	}
	public String getNome() {
		return nome;
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Pais) {
			Pais p = (Pais)o;
			return codigo.equals(p.codigo);
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return this.nome;
	}
}

class CriaPaises{
	static List<Pais> retornaPaises(){
		List<Pais> paises = new ArrayList<>();
		Pais can = new Pais("can","canada",1000.0);
		Pais eua = new Pais("eua","estados unidos", 5000.0);
		Pais mex = new Pais("mex","mexico", 500.0);
		
		paises.add(can);
		paises.add(eua);
		paises.add(mex);
		
		Pais.addFronteira(eua, mex);
		Pais.addFronteira(eua, can);

		return paises;
	}
	static List<Pais> retornaPaises(String[] arr) throws FormatoIncorretoException{
		List<Pais> paises = new ArrayList<>();
		for(String s : arr) {
			String[] temp = s.split("#");
			if(temp.length != 4) {
				throw new FormatoIncorretoException(temp.length-1,s);
			}
			Pais p = new Pais(temp[0],temp[1],Double.parseDouble(temp[2]));
			p.setPopulacao(Integer.parseInt(temp[3]));
			paises.add(p);
		}
		return paises;
	}
}

class FormatoIncorretoException extends Exception {

	public FormatoIncorretoException(int qt, String str) {
		super("A string"+str+"é inválida, possui"+qt+"elementos");
	}

}

public class TestePais {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o codigo do pais a ser buscado");
		String codigo = sc.nextLine().toUpperCase();
		sc.close();
		List<Pais> paises = CriaPaises.retornaPaises();
		Pais pBusca = new Pais(codigo);
		if(paises.contains(pBusca)) {
			pBusca = paises.get(paises.indexOf(pBusca));
			System.out.println(pBusca.getNome() +" "+ pBusca.getDensidade());
			System.out.println(pBusca.getFronteiras());
		}
	}
}
