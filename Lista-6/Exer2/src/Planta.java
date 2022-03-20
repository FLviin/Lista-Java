public class Planta {
    private String nome;
    private String especie;
    protected int quantidade;
    
    public Planta() {}

    public Planta(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getQuantidade() {
        return quantidade;    
    }

    public void setQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s Espécie: %s", getNome(), getEspecie());
    }

}
