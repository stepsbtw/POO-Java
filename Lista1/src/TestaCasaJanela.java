public class TestaCasaJanela {
    public static void main(String[] Args){
        
        Janela j1 = new Janela();
        j1.cor = "branca";
        j1.material = "madeira";
        Casa c1 = new Casa();
        c1.janela = j1;
        System.out.println("A janela da casa 1 é " + c1.janela.cor + " e feita de " + c1.janela.material);



        Janela j2 = new Janela();
        Casa c2 = new Casa();
        c2.janela = j2;
        j2.cor = "branca";
        j2.material = "madeira";
        System.out.println("A janela da casa 2 é " + c2.janela.cor + " e feita de " + c2.janela.material);


        Janela j3 = new Janela();
        Casa c3 = new Casa();
        c3.janela = j3;
        c3.janela.cor = "branca";
        c3.janela.material = "madeira";
        System.out.println("A janela da casa 3 é " + c3.janela.cor + " e feita de " + c3.janela.material);

    }
}
