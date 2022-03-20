public class Aquatico extends Animal {
    private boolean respiraForaAgua;
    public static int quantidadeAquaticos;

    public Aquatico() {
        quantidadeAquaticos += 1;
    }

    public void setRespiraForaAgua(boolean respiraForaAgua) {
        this.respiraForaAgua = respiraForaAgua;
    }

    public boolean getRespiraForaAgua() {
        return respiraForaAgua;
    }

    public int getQuantidadeAquaticos() {
        return quantidadeAquaticos;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "Respira fora da água? %s", (getRespiraForaAgua() ? "Sim" : "Não"));
    }

}
