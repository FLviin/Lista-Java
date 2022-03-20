public class Arvore extends Planta {
    private boolean ehFrutifera;

    public Arvore() {}

    Arvore(String nome, String especie, boolean ehFrutifera) {
        super(nome, especie);
        this.ehFrutifera = ehFrutifera;
        this.quantidade++;
    }

    public boolean getEhFrutifera() {
        return ehFrutifera;
    }

    @Override
    public String toString() {
        return String.format("\nNome: %s Espécie: %s É frutífera: %b", getNome(), getEspecie(), getEhFrutifera());
    }

}
