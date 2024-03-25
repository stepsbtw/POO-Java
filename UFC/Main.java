import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// INICIALIZANDO TUDO
		Scanner sc = new Scanner(System.in);
		System.out.println("Central UFC!\n\nQuantos lutadores serao adicionados?");
		int qtLutadores = Integer.parseInt(sc.nextLine());
		Lutador[] lutadores = new Lutador[qtLutadores];
		for(int i = 0; i< lutadores.length;i++) {
			System.out.println("Insira o nome do lutador: ");
			String nome = sc.nextLine();
				
			System.out.println("Insira a idade do lutador: ");
			int idade = Integer.parseInt(sc.nextLine());
				
			System.out.println("Insira o peso do lutador: ");
			double peso = Double.parseDouble(sc.nextLine());
				
			lutadores[i] = Lutador.criarLutador(nome,peso,idade);
			if(lutadores[i]!=null) {
				System.out.println("Lutador: " + lutadores[i] + " foi adicionado!");
			}else {
				System.out.println("O lutador nao pode ser adicionado, insira novamente.");
				i--;
			}
		}
		int decisao = 1;
		
		// TERMINANDO SETUP
		do {
			System.out.println("\nCHOOSE YOUR CHARACTER\n");
			for(int i = 0; i<lutadores.length;i++) {
				System.out.println(i + ": " + lutadores[i]);
			}
			int x = Integer.parseInt(sc.nextLine());
			Lutador jogador = lutadores[x];
			System.out.println("OK!\n" + lutadores[x].getNome() + " foi escolhido.");
			System.out.println("Sua categoria: " + jogador.categoriaLutador());
			ArrayList<Lutador> possiveisLutas = jogador.possiveisLutas(lutadores);
			
			// START GAME
			do {
				System.out.println("\nYOUR FATE:");
				for(Lutador l : possiveisLutas) {
					System.out.println(l);
				}
				boolean win = false;
				int winCount = 0;
				
				// GAME LOOP
				do{
					Lutador oponente = jogador.sorteioLuta(lutadores); // n preciso mas, aqui eu to calculando dnv os oponentes
					System.out.println("\nFIGHT "+ (winCount+1) + ": " + oponente + "\n");
					win = Math.random() > 0.5;
					if(win) {
						winCount++;
						System.out.println("YOU WIN!\nWin Streak: "+ winCount);
					}else {
						win = false;
						do {
							System.out.println("YOU LOSE.\n1) Tentar novamente.\n2) Escolher um novo personagem e tentar novamente.\n3) Acabou, desisto.");
							decisao = Integer.parseInt(sc.nextLine());
							if(decisao == 3) {return;}
						}while(decisao != 1 && decisao != 2);
					}
				}while(win);
			}while(decisao == 1);
		}while(decisao == 2);
		sc.close();
	}
}