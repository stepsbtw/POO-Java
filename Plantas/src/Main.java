import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.nio.file.*;
public class Main {
    public static void main(String[] args) throws IOException {

        Path arquivo = Paths.get("Plantas/Arquivos/plantas");
        ArrayList<String> stringsPlantas = (ArrayList<String>) Files.readAllLines(arquivo);
        ArrayList<Planta> plantas = Utils.retornaDados(stringsPlantas);


        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o id da planta a ser buscada.");
        String id = sc.nextLine();
        sc.close();

        Planta plantaBusca = new Planta(id);
        if(Utils.existe(plantas, plantaBusca)){
            System.out.println("Planta encontrada!");
            for(Planta planta : plantas){
                if(Objects.equals(planta.getId(), plantaBusca.getId()))
                System.out.println(planta);
                break;
            }

        }else{
            System.out.println("A planta com ID "+id+" não existe.");
        }

    }
}