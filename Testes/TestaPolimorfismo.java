package Testes;
abstract class Usuario {
    private String id;
    Usuario(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
    public abstract String berroAbstrato();

    @Override
    public String toString(){
        return "USUARIO!";
    }
}
class Jogador extends Usuario{
    private int elo;
    Jogador(String id){
        super(id);
    }
    public int getElo() {
        return elo;
    }
    public void setElo(int elo) {
        this.elo = elo;
    }
    public String berroAbstrato(){
        return "AAAAA";
    }

    public String berro(){
        return "BBBBB";
    }

    @Override
    public String toString(){
        return "JOGADOR!";
    }
}

class Main{
    public static void main(String[] args){
        Usuario[] usuarios = new Usuario[2];
        Usuario[] usuarios2 = new Jogador[2];
        Jogador[] usuarios3 = new Jogador[2];
        Object[] usuarios4 = new Object[2];

        usuarios[0] = new Jogador("a");
        usuarios2[0] = new Jogador("b");
        usuarios3[0] = new Jogador("c");
        usuarios4[0] = new Jogador("d");

        System.out.println(usuarios[0]);
        System.out.println(usuarios2[0]);
        System.out.println(usuarios3[0]);
        System.out.println(usuarios4[0]);

        System.out.println(usuarios[0].berroAbstrato());
        System.out.println(usuarios2[0].berroAbstrato());
        System.out.println(usuarios3[0].berroAbstrato());
        System.out.println(((Usuario)usuarios4[0]).berroAbstrato());


        System.out.println(((Jogador)usuarios[0]).berro());
        System.out.println(((Jogador)usuarios2[0]).berro());
        System.out.println(usuarios3[0].berro());
        System.out.println(((Jogador)usuarios4[0]).berro());

        System.out.println(usuarios[0].getClass());
        System.out.println(usuarios2[0].getClass());
        System.out.println(usuarios3[0].getClass());
        System.out.println(usuarios4[0].getClass());

        System.out.println(usuarios[0] instanceof Jogador);
        System.out.println(usuarios2[0] instanceof Jogador);
        System.out.println(usuarios3[0] instanceof Jogador);
        System.out.println(usuarios4[0] instanceof Jogador);

        System.out.println(usuarios[0] instanceof Usuario);
        System.out.println(usuarios2[0] instanceof Usuario);
        System.out.println(usuarios3[0] instanceof Usuario);
        System.out.println(usuarios4[0] instanceof Usuario);



    }
}
