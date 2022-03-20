public class Voador extends Animal {
    private String corPena;
    public static int quantidadeVoadores;

    public Voador() {
        quantidadeVoadores += 1;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }

    public int getQuantidadeVoadores() {
        return quantidadeVoadores;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "Cor da pena: %s\n", getCorPena());
    }

}
