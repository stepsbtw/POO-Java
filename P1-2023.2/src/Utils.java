import java.util.List;
import java.util.ArrayList;
public class Utils {
    public static boolean existe(List x, Produto y){
        return x.contains(y); //so funciona caso eu mude o metodo equals da classe.
    }

    public static List getLista(){
        ArrayList lista = new ArrayList();
        lista.add(new Televisao("234"));
        ((Produto)lista.get(0)).setCor("preto");
        ((Produto)lista.get(0)).setPreco(100);
        lista.add(new Televisao("456"));
        return lista;
    }

}
