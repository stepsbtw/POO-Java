public class GatoTeste {
    public static void main(String[] Args){
        Gato g1 = new Gato();
        Gato g2 = new Gato();
        Gato g3 = new Gato();
        g1.vivo = true;
        g1.nome = "Carlos";
        g1.cor = "Preto";
        g1.idade = 3;
        g1.miar();
        System.out.println(g1.nome + " é " + g1.cor + " e tem " + g1.idade + " anos!");
        g2.vivo = true;
        g2.nome = "Joao";
        g2.cor = "Branco";
        g2.idade = 1;
        g2.miar();
        System.out.println(g2.nome + " é " + g2.cor + " e tem " + g2.idade + " anos!");
    }
}
