public class DividirConta {

    private double conta;
    private int pessoas;

    public DividirConta() {
        this.conta = 0.0;
        this.pessoas = 0;
    }

    public void setConta(double conta) {
        if (conta > 0) {
            this.conta = conta;
        }
    }

    public void setPessoas(int pessoas) {
        if (conta > 0 && conta < 100) {
            this.pessoas = pessoas;
        }
    }

    public double getConta() {
        return conta;
    }

    public int getPessoas() {
        return pessoas;
    }

    public Double contaDividida(double conta, int pessoas) {
        return conta / pessoas;
    }
}
