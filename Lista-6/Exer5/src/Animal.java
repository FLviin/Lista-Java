public class Animal {
    private String nome;
    private String especie;
    public static int quantidadeAnimais;

    public Animal() {
        quantidadeAnimais += 1;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nEspécie: %s\n", getNome(), getEspecie());
    }

}
