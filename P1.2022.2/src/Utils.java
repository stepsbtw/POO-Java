import java.util.ArrayList;
import java.util.Comparator;

public class Utils {
    public static boolean existe(ArrayList<Planta> x, Planta y){
        return x.contains(y);
    }
    public static Planta[] ordena(ArrayList<Planta> x) {
        /*
        LAMBDA!
        x.sort((p1,p2)->Double.compare(p1.getTamanho(),p2.getTamanho()));
        x.sort(Comparator.comparing(Planta::getTamanho));
        */
        x.sort(Comparator.comparingDouble(Planta::getTamanho));
        return x.toArray(new Planta[0]);
    }
    public static ArrayList<Planta> retornaDados(ArrayList<String> stringsPlantas) {
        ArrayList<Planta> plantas = new ArrayList<Planta>();
        for (String x : stringsPlantas) {
            String[] x_info = x.split("#");
            String x_id = x_info[0];
            String x_nome = x_info[1];
            double x_tamanho = Double.parseDouble(x_info[2]);
            //String x_tipo = x_info[3];
            // if(x_tipo == 'P'){}
            if (x.endsWith("P")) {
                Pteridofita p = new Pteridofita(x_id);
                p.setNome(x_nome);
                p.setTamanho(x_tamanho);
                plantas.add(p);
            }
            else{
                Briofita b = new Briofita(x_id);
                b.setNome(x_nome);
                b.setTamanho(x_tamanho);
                plantas.add(b);
            }
        }
        return plantas;
    }
}
