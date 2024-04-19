import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.List;
public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String idBuscar = sc.nextLine();
        sc.close();
        Biscoito biscoitoBuscar = new Biscoito(idBuscar);

        Path arquivo = Paths.get("/Biscoitos/src/mercado");
        List<String> stringLista = Files.readAllLines(arquivo);
        List listaObjetos = Utils2.getListaObjetos(stringLista);

        if(Utils.existe(listaObjetos,biscoitoBuscar)){
            System.out.println("Biscoito encontrado!");
            for(Object b: listaObjetos){
                if(b == biscoitoBuscar){
                    System.out.println(b);
                    break;
                }
            }
        }else{
            System.out.println("Biscoito nao encontrado.");
        }



    }
}