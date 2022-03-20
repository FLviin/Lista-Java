public class Estagio extends Vaga {
    private int tempo;

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return String.format("Descrição: %s\nSalário oferecido: %.2f\nTempo: %d\n", getDescricao(), getSalarioOferecido(), getTempo());
    }

}
