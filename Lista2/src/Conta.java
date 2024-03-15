public class Conta {
    double saldo;
    public void calcula(){
        if(saldo < 1000){
            double testeSaldo = saldo*0.1;
            System.out.println(testeSaldo);
        }
        //System.out.println(testeSaldo);
    }
    public void calcula2(){
        if(saldo < 1000){
            //int teste = saldo - 1000;
            double teste = saldo - 1000;
            // nao declara como int um valor double.
            if(teste < 0){
                System.out.println("Deu zebra");
            }
        }
    }
    public void calcula3(){
        //if(saldo){
        if(saldo > 0){
            System.out.println("saldo");
        }else{
            System.out.println("sem saldo");
        }
    }
}
