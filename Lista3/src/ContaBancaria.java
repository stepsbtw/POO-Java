public class ContaBancaria {
    private double saldo = 0.0;
    private Data dataAbertura;
    double getSaldo(){
        return saldo;
    }
    void setSaldo(double x){
        saldo = x;
    }
    Data getDataAbertura(){
        return dataAbertura;
    }
    void setDataAbertura(Data x){
        dataAbertura = x;
    }
    String getDataAberturaFormatada(){
        return dataAbertura.getDia() + "/" + dataAbertura.getMes() + "/" + dataAbertura.getAno();
    }
    String getSaldoFormatado(){
        return "R$" + getSaldo();
    }
    void depositar(double x){
        saldo += x;
    }
    void sacar(double x){
        //if(saldo-x < 0){return;}
        if(saldo-x > 0) {
            saldo -= x;
        }
    }
}
