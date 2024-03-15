public class ex4 {
    public static void main(String[] Args){
        int soma = 0;
        for(int i = 1; i<=50000;i++){
            if(i >= 100 && i <= 137){continue;}
            soma += i;
        }
        System.out.println(soma);

        // PA DE RAZAO 1 ATE 50000
        int soma_1 = 0;
        for(int i = 1; i<=50000;i++){
            soma_1 += i;
        }
        System.out.println(soma_1);

        // PA de razao 1 até 50000
        int a1 = 1;
        int an = 50000;
        int n = 50000;
        int soma1 = n*(a1+an/2);
        System.out.println(soma1);

        // PA de razao 1 de 100 até 137
        int a1_1 = 100;
        int an_1 = 137;
        int n_1 = 38;
        int soma2 = (n_1*(a1_1+an_1))/2;

        // PA1 - PA2 = resposta
        int resposta = soma1 - soma2;
        System.out.println(resposta);
    }
}
