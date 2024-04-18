import java.util.Objects;

public class Planta{

    private String id;
    private String nome;
    private double tamanho;

    Planta(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getTamanho(){
        return tamanho;
    }
    @Override
    public String toString(){
        return id+"#"+nome+"#"+tamanho;
    }

    @Override
    public boolean equals(Object o){
        Planta planta = (Planta) o;
        return Objects.equals(id, planta.id);
    }

}

class Briofita extends Planta{
    Briofita(String id){
        super(id);
    }
    @Override
    public String toString(){
        return "[Briofita] " + super.toString();
    }
}

class Pteridofita extends Planta{
    Pteridofita(String id){
        super(id);
    }
    @Override
    public String toString(){ return "[Pteridofita] " + super.toString();}
}

