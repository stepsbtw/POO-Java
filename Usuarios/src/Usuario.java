public abstract class Usuario {
    private String id;
    Usuario(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
    public abstract String berroAbstrato();

    @Override
    public String toString(){
        return "USUARIO!";
    }
}
class Jogador extends Usuario{
    private int elo;
    Jogador(String id){
        super(id);
    }
    public int getElo() {
        return elo;
    }
    public void setElo(int elo) {
        this.elo = elo;
    }
    public String berroAbstrato(){
        return "AAAAA";
    }

    public String berro(){
        return "BBBBB";
    }

    @Override
    public String toString(){
        return "JOGADOR!";
    }
}
