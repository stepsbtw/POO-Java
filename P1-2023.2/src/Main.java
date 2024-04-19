import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        sc.close();
        List lista = Utils.getLista();
        Produto produtoBusca = new Produto(id);

        if(Utils.existe(lista,produtoBusca)){
            System.out.println("Produto existe!");
            /*
            for (Object o : lista) {
                if (o.equals(produtoBusca)) {
                    System.out.println("Produto encontrado!");
                    System.out.println(o);
                }
            }
            */
            int idxProduto = lista.indexOf(produtoBusca);
            Produto p = (Produto)lista.get(idxProduto);
            System.out.println(p);
        }else{
            System.out.println("Produto nao encontrado.");
        }
        Produto[] vetor = transformaListEmArray(lista);
        System.out.println(lista);
        System.out.println(Arrays.toString(vetor));
    }
    public static Produto[] transformaListEmArray(List l){
        Produto[] produtos = new Produto[l.size()];
        for(int i = 0; i < l.size(); i++){
            if(l.get(i) instanceof Produto) {
                produtos[i] = (Produto)l.get(i);
            }
        }
        return produtos;
    }
}