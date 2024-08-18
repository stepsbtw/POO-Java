import java.util.Collections;
import java.util.List;
// import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.HashMap;

public class Utils {
    public static boolean existe(List<Aluno> x, Aluno y){
        return x.contains(y);
    }
    
    public static void ordena(List<Aluno> x){
        Collections.sort(x);
    }

    /*
    public static void ordena2(List<Aluno> x){
        x.sort(Comparator.comparing(Aluno::getNome));
    }
    */

    public Map<String, Aluno> retornaDados(Set conjuntoAlunos){
        Map<String,Aluno> mapaAlunos = new HashMap<>();
        for(Object o : conjuntoAlunos){
            if(o instanceof String){ 
                String s = (String)o;
                String[] s_info = s.split("#");
                /*
                if(s_info.length !=4){
                    throw new IllegalArgumentException("Formato inválido pra string");
                }
                */
                String id = s_info[0];
                String nome = s_info[1];
                double nota = Double.parseDouble(s_info[2]);
                String tipo = s_info[3];
                
                if(tipo.equals("R")){
                    AlunoRegular aluno = new AlunoRegular(id);
                    aluno.setNome(nome);
                    aluno.setNota(nota);
                    mapaAlunos.put(id,aluno);
                }else if(tipo.equals("E")){
                    AlunoEspecial aluno = new AlunoEspecial(id);
                    aluno.setNome(nome);
                    aluno.setNota(nota);
                    mapaAlunos.put(id,aluno);
                }else{
                    throw new RuntimeException("Insira o tipo do aluno. R - regular / E - especial");
                }  
            }
        }
        return mapaAlunos;
    }
}
