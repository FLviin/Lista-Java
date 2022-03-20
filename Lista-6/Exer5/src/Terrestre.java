public class Terrestre extends Animal {
    private int quantidadePatas;
    public static int quantidadeTerrestres;

    public Terrestre() {
        quantidadeTerrestres += 1;
    }

    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public int getQuantidadeTerrestres() {
        return quantidadeTerrestres;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "Quantidade de patas: %d\n", getQuantidadePatas());
    }

}
