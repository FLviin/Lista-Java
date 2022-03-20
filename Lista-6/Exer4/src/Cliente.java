public class Cliente {
    private int codigo;
    private String nome;
    private int idade;
    private double debito;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
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

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getDebito() {
        return debito;
    }

    public void pagar(double valor) {
        System.out.println("Valor pago!");
    }

    public String toString() {
        return String.format("\nCódigo: %d\nNome: %s\nIdade: %d", getCodigo(), getNome(), getIdade());
    }

}
