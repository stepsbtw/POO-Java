package steps;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> s = new HashSet<>();
		
		try {
			s = LerArquivo.retornaString("CORPOSCELESTES");
		} catch (IOException e) {
			System.out.println("tem nada no arquivo");
			e.printStackTrace();
		}
		
		System.out.println("Insira o ID do corpo celeste que deseja buscar: ");
		String id = sc.nextLine();
	}
}
