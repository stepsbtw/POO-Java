public class TestaCasa {
    public static void main(String[] Args){
        Casa c1 = new Casa();
        Casa c2 = new Casa();
        c1.cor = "Azul";
        c1.numero = 290;
        c2.cor = "Amarela";
        c2.numero = 415;
        System.out.println("A casa 1 é " + c1.cor + " e o numero é " + c1.numero);
        System.out.println("A casa 2 é " + c2.cor + " e o numero é " + c2.numero);
    }
}
