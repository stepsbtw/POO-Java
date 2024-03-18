 public class Aluno{
    private String nome;
    private int nota1;
    private int nota2;

    public int getNota1(){
        return nota1;
    }
    public int getNota2(){
        return nota2;
    }
    public void setNota1(int x){
        if(x < 0){
            nota1 = 0;
        }else if(x > 10){
            nota1 = 10;
        }else{
            x = nota1;
        }
    }
    public void setNota2(int x){
        if(x < 0){
            nota2 = 0;
        }else if(x > 10){
            nota2 = 10;
        }else{
            x = nota2;
        }
    }
    public int calculaMedia(){
        return (getNota1() + getNota2()) / 2;
    }
}
