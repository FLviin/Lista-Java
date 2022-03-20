public class Contrato extends Vaga {
    private boolean temporario;

    public void setTemporario(boolean temporario) {
        this.temporario = temporario;
    }

    public boolean getTemporario() {
        return temporario;
    }

    @Override
    public String toString() {
        return String.format("Descrição: %s\nSalário oferecido: %.2f\nTemporário: %b\n", getDescricao(), getSalarioOferecido(), getTemporario());
    }

}
