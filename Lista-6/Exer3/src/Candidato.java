public class Candidato {
    private String nome;
    private int idade;
    private String situacao;
    public static int quantidade;

    public Candidato() {
        quantidade++;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getSituacao() {
        return situacao;
    }

    @Override
    public String toString() {
        return String.format("\nNome: %s\nIdade: %d\nSituação: %s\n", getNome(), getIdade(), getSituacao());
    }
    
}
