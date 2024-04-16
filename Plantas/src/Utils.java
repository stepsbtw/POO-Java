import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Utils {
    public static boolean existe(ArrayList<String> x, Planta y){
        return x.contains(y.id);
    }
    /*
    public static boolean existe(ArrayList<Planta> x, Planta y){
        return x.contains(y);
        }
    */
    public static Planta[] ordena(List<Planta> x) {
        /*
        LAMBDA!
        x.sort((p1,p2)->Double.compare(p1.getTamanho(),p2.getTamanho()));
        x.sort(Comparator.comparing(Planta::getTamanho));
        */
        x.sort(Comparator.comparingDouble(Planta::getTamanho));
        return x.toArray(new Planta[0]);
    }
    public static ArrayList<String> retornaDados(ArrayList<String> stringsPlantas){
        return stringsPlantas;
    }
}
