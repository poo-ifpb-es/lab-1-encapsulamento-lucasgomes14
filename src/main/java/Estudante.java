public class Estudante {
    private int matricula;
    private String nome;

    public Estudante(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}