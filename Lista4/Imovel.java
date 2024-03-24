public class Imovel{
	private String endereco;
	private float preco;
	
	public Imovel(String endereco, float preco) {
		this.endereco = endereco;
		this.preco = preco;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
}
class Novo extends Imovel {
	public Novo(String endereco, float preco) {
		super(endereco,preco);
	}
	public float getPreco() {
		return super.getPreco() + 1.1f;
	}
}

class Velho extends Imovel {
	public Velho(String endereco, float preco) {
		super(endereco, preco);
	}

	public float getPreco() {
		return super.getPreco() * 0.9f;
	}
}
