public class NullPtrException {
    public static void main(String[] args){
        Teste t = new Teste();
        t.x = 1;
        System.out.println(t);
        t = null;
        t.x = 0;
        // NULL POINTER EXCEPTION.
    }
}
class Teste{
    int x;
    @Override
    public String toString(){
        return x+"";
    }
}