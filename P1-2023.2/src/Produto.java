import java.util.Objects;

public class Produto {
    private String id;
    private String cor;
    private double preco;

    Produto(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Produto){
            return ((Produto)o).id.equals(id);
        }
        return false;
    }

    @Override
    public String toString(){
        return id+" "+cor+" "+preco;
    }
}
