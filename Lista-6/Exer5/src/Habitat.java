import java.util.ArrayList;

public class Habitat {
    private double area;
    private double comprimento;
    private double largura;
    private int quantidadeAnimaisHabitat;
    private ArrayList<Animal> animais = new ArrayList<Animal>();

    public Habitat(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
        setArea(this.comprimento * this.largura);
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void novoAnimal(Animal animal) {
        animais.add(animal);
        setQuantidadeAnimais(1);
    }

    public void setQuantidadeAnimais(int quantidadeAnimaisHabitat) {
        this.quantidadeAnimaisHabitat += quantidadeAnimaisHabitat;
    }

    public int getQuantidadeAnimais() {
        return quantidadeAnimaisHabitat;
    }

    public void listarAnimaisNoHabitat() {
        int contador = 1;
        for(Animal i : animais) {
            System.out.println("Animal " + contador + "\n" + i.toString());
        }
    }

}
