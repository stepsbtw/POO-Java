public class Corretora {
	public Imovel[] imoveis;
	
	public Corretora(int qtImoveis) {
		this.imoveis = new Imovel[qtImoveis];
	}
	
	public void info() {
		for(Imovel i: this.imoveis) {
			System.out.println("Endereco : "+ i.getPreco());
			System.out.println("Preco : "+ i.getEndereco());
		}
	}
	
	void adicionarImovel(String endereco, float preco, int idx){
		this.imoveis[idx].setEndereco(endereco);
		this.imoveis[idx].setPreco(preco);
	}
	
	public float precoTotal() {
		float total = 0;
		for(Imovel i: this.imoveis) {
			total += i.getPreco();
		}
		return total;
	}
}
