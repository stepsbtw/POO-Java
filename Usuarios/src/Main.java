import java.sql.SQLOutput;

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