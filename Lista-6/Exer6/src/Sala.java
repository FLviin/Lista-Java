import java.util.ArrayList;

public class Sala {
    private String nome;
    private Pessoa pessoas[];
    private int capacidade;

    public Sala() {}

    public Sala(int quantidadePessoas) {
        this.pessoas = new Pessoa[quantidadePessoas];
        this.capacidade = quantidadePessoas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void adicionarPessoas(ArrayList<Pessoa> pessoas) {
        for(int i = 0; i < this.pessoas.length; i++) {
            this.pessoas[i] = pessoas.get(i);
        }
    }

    public void listarPessoasNaSala() {
        System.out.println("Pessoas na sala: ");
        for(int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i]);
        }
    }

    @Override
    public String toString() {
        return String.format("\nNome da sala: %s\nCapacidade: %d\n", getNome(), getCapacidade());
    }

}
