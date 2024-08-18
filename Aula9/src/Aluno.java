public class Aluno implements Comparable<Aluno>{
    private String id;
    private String nome;
    private double nota;
    public Aluno(String id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNota(double nota){
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Aluno){
            Aluno a = (Aluno)o;
            return id.equals(a.id);
        }
        else{ return false; }
    }

    @Override
    public int compareTo(Aluno outroAluno){
        return nome.compareTo(outroAluno.nome);
    }    

    @Override
    public String toString(){
        return id +" "+ nome + " "+ nota;
    }
}

class AlunoRegular extends Aluno{
    public AlunoRegular(String id){
        super(id);
    }
}

class AlunoEspecial extends Aluno{
    public AlunoEspecial(String id){
        super(id);
    }
}