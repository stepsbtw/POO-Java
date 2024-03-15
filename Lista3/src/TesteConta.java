public class TesteConta {
    public static void main(String[] Args){
        Data d1 = new Data();
        ContaBancaria c1 = new ContaBancaria();
        d1.setDia(5);
        d1.setMes(1);
        d1.setAno(2005);
        c1.setDataAbertura(d1);
        c1.setSaldo(1000);
        c1.depositar(100);
        c1.sacar(200);
        System.out.println(c1.getDataAbertura());
        System.out.println(c1.getSaldo());
        System.out.println(c1.getDataAberturaFormatada());
        System.out.println(c1.getSaldoFormatado());
    }
}
