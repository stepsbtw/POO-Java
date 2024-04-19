import java.util.ArrayList;
import java.util.List;
public class Utils2 {
    public static List getListaObjetos(List<String> stringLista){
        List listaObjetos = new ArrayList<Object>();
        for(String x: stringLista){
            String[] x_info = x.split("/");
            String x_id = x_info[0];
            String x_marca = x_info[1];
            String x_preco = x_info[2];
        }
        return listaObjetos;
    }
}
