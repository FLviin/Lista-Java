public class Carnivora extends Planta {
    private boolean ehVenenosa;

    public Carnivora() {}

    public Carnivora(String nome, String especie, boolean ehVenenosa) {
        super(nome, especie);
        this.ehVenenosa = ehVenenosa;
        this.quantidade++;
    }

    public boolean getEhVenenosa() {
        return ehVenenosa;
    }

    @Override
    public String toString() {
        return String.format("\nNome: %s Espécie: %s É venenosa: %b", getNome(), getEspecie(), getEhVenenosa());
    }

}

