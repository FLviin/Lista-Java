public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    public Pessoa() {
        this.nome = "";
        this.idade = 0;
        this.altura = 0.0;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome) {

        if (!nome.isEmpty()) {

            this.nome = nome;
        }
    }

    public void setIdade(int idade) {

        if (idade >= 0) {

            this.idade = idade;
        }
    }

    public void setAltura(double altura) {

        if (altura > 0 && altura <= 3.5) {

            this.altura = altura;
        }
    }

    public String getNome() {

        return nome;
    }

    public int getIdade() {

        return idade;
    }

    public double getAltura() {

        return altura;
    }

    public void fazAniversario(boolean faz) {

        if (faz) {

            idade++;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura;
    }
}
