public class Flor extends Planta {
    private String cor;

    public Flor() {}

    public Flor(String nome, String especie, String cor) {
        super(nome, especie);
        this.cor = cor;
        this.quantidade++;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return String.format("\nNome: %s Espécie: %s Cor: %s", getNome(), getEspecie(), getCor());
    }

}
