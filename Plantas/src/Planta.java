import java.util.Objects;

public class Planta{
    String id;
    String nome;
    private double tamanho;

    Planta(String id){
        this.id = id;
    }

    /*
        CASO EM UTILS EU TIVESSE UM ARRAYLIST DE PLANTAS E NAO STRINGS.
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        else if(o == null || this.getClass() != o.getClass()){
            return false;
        }else{
            Planta planta = (Planta) o;
            return Objects.equals(id, planta.id);
        }
    }
    */

    public double getTamanho(){
        return tamanho;
    }

    @Override
    public String toString(){
        return id+nome+tamanho;
    }
}

class Briofita extends Planta{
    Briofita(String id){
        super(id);
        this.id = id;
    }
    @Override
    public String toString(){
        return "[Briofita] " + super.toString();
    }
}

class Pteridofita extends Planta{
    Pteridofita(String id){
        super(id);
        this.id = id;
    }
    @Override
    public String toString(){ return "[Pteridofita] " + super.toString();}
}

