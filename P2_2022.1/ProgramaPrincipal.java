package steps;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		Set<String> conjuntoCeleste = new HashSet<>();
		
		try {
			conjuntoCeleste = LerArquivo.retornaString("CORPOSCELESTES");
		} catch (IOException e) {
			e.printStackTrace();
		}

		Map<String,CorpoCeleste> mapaCeleste;
		try {
			 mapaCeleste = Utils.retornaDados(conjuntoCeleste);
		} catch (FormatoIncorretoException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return;
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o ID do corpo celeste que deseja buscar: ");
		String id = sc.nextLine();
		sc.close();
		/*
		CorpoCeleste corpoBusca = new Estrela(id);
		if (Utils.existe(mapaCeleste.values(), corpoBusca)) {
            System.out.println(mapaCeleste.get(id));
        } else {
            System.out.println("A estrela com ID " + id + " não existe.");
        }
        */
		
		if(mapaCeleste.containsKey(id)) {
			System.out.println(mapaCeleste.get(id));
		}else {
			System.out.println("O corpo com ID "+id+" nao existe.");
		}
		
	}
}
