public class Ex1{
    public static void main(String[] args){
        int[] array = new int[20];
        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }
        //Ex1.inverte(array);
        inverte(array);
        System.out.println(array);
        array = inverte(array);
        System.out.println(array);
    }
    // metodo precisa ser declarado como estatico.
    // assim é literalmente uma "funcao", nao preciso chamar a classe
    static int[] inverte(int[] a){
        for(int i = 0; i<a.length; i++){
            int j = a.length;
            a[i] = a[j];
            j--;
        }
        return a;
    }
}