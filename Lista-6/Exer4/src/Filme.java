public class Filme extends Midia {
    private String classificacao;
    private int duracao;

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return String.format("Classificação: %s\nDuração: %d\n", getClassificacao(), getDuracao());
    }

}
