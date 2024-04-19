import java.util.Objects;

public class Biscoito{
    private String id;

    private int preco;

    Biscoito(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public int getPreco() {
        return preco;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o){
        Biscoito b = (Biscoito) o;
        return (Objects.equals(id, b.id));
    }

    @Override
    public String toString(){
        return id+preco;
    }
}
class Trakinas extends Biscoito implements Comestivel{
    Trakinas(String id){
        super(id);
    }
}
class Negresco extends Biscoito implements Comestivel{
    Negresco(String id){
        super(id);
    }
}