public class ex3 {
    public static void main(String[] Args){
        int soma = 0;
        for(int i = 1; i < 10000; i+=2){soma += i;}
        System.out.println(soma);

        int a1 = 1;
        int an = 9999;
        int n = 10000/2;
        int soma2 = n*(an+a1)/2;
        System.out.println(soma2);
    }
}
