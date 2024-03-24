import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos imoveis sua corretora terá? ");
		int qtImoveis = sc.nextInt();
		sc.nextLine(); // come linha
		Corretora minhaCorretora = new Corretora(qtImoveis);
		for(Imovel i: minhaCorretora.imoveis) {
			System.out.println("Insira o Endereco do Imovel.");
			String endereco = sc.nextLine();
			System.out.println("Insira o Preco do Imovel.");
			sc.nextLine();
			float preco = sc.nextFloat();
			System.out.println("Insira o index do Imovel.");
			sc.nextLine();
			int index = sc.nextInt();
			minhaCorretora.adicionarImovel(endereco,preco,index);
		}
		sc.close();
		minhaCorretora.info();
		System.out.println("Valor total = "+ minhaCorretora.precoTotal());
	}
}
