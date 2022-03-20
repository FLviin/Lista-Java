import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

    public static Scanner sc = new Scanner(System.in);
    public static Scanner scStr = new Scanner(System.in);
    public static ArrayList<Animal> animais = new ArrayList<Animal>();

    public static void main(String[] args) throws Exception {
        
        int opcao = 0;

        do {
            System.out.println("----- MENU -----");
                System.out.println("1: Cadastrar animal");
                System.out.println("2: Listar animais");
                System.out.println("3: Mostrar quantidade de animais no zoológico");
                System.out.println("4: Mostrar quantidade de animais por tipo");
                System.out.println("5: Mostrar quantidade de animais por habitat");
                System.out.println("6: Mostrar área total ocupada pelos animais");
                System.out.println("7: Sair");
            System.out.print("Sua opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    animais.add(cadastrarAnimal());
                    System.out.println("Animal cadastrado com sucesso!");
                    break;
                case 2:
                    listarAnimais(animais);
                    break;
                case 3:
                    System.out.println("Quantidade de animais no zoológico: " + Animal.quantidadeAnimais);
                    break;
                case 4:
                    System.out.println("Quantidade de animais por tipo: " + mostrarQuantidadePorTipo());
                    break;
                case 5:
                    Habitat jaula = new Jaula(4, 3);
                    jaula.novoAnimal(animais.get(0));
                    System.out.println("Quantidade de animais por habitat: " + mostrarQuantidadePorHabitat(jaula));
                    break;
                case 6:
                    Habitat lago = new Lago(10, 10);
                    System.out.println("Área ocupada pelos animais: " + mostrarAreaOcupada(lago) + "m²");
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opção inexistente!");
                    break;
            }
        } while(opcao != 7);
        
    }

    public static Animal cadastrarAnimal() {
        int tipo = 0;

        do {
            System.out.println("Tipo do animal");
                System.out.println("1: Aquático");
                System.out.println("2: Terrestre");
                System.out.println("3: Voador");
            System.out.print("Escolha o tipo: ");
            tipo = sc.nextInt();
        } while(tipo < 1 || tipo > 3);

        Animal animal = null;

        switch(tipo) {
            case 1:
                animal = new Aquatico();
                System.out.print("Nome do animal aquático: ");
                animal.setNome(scStr.nextLine());
                System.out.print("Espécie do animal aquático: ");
                animal.setEspecie(scStr.nextLine());
                System.out.print("Respira fora da água? ");
                ((Aquatico) animal).setRespiraForaAgua(sc.nextBoolean());
                break;

            case 2:
                animal = new Terrestre();
                System.out.print("Nome do animal terrestre: ");
                animal.setNome(scStr.nextLine());
                System.out.print("Espécie do animal terrestre: ");
                animal.setEspecie(scStr.nextLine());
                System.out.print("Quantidade de patas: ");
                ((Terrestre) animal).setQuantidadePatas(sc.nextInt());
                break;
            case 3:
                animal = new Voador();
                System.out.print("Nome do animal voador: ");
                animal.setNome(scStr.nextLine());
                System.out.print("Espécie do animal voador: ");
                animal.setEspecie(scStr.nextLine());
                System.out.print("Cor da pena: ");
                ((Voador) animal).setCorPena(scStr.nextLine());
                break;
        }
        return animal;
    }

    public static void listarAnimais(ArrayList<Animal> animais) {
        int contador = 1;
        for(int i = 0; i < animais.size(); i++) {
            System.out.println("Animal n° " + contador++);
            System.out.println(animais.get(i).toString());
            System.out.println();
        }
    }

    public static int mostrarQuantidadePorTipo() {
        int tipo = 0;

        do {
            System.out.println("Tipo do animal");
                System.out.println("1: Aquático");
                System.out.println("2: Terrestre");
                System.out.println("3: Voador");
            System.out.print("Escolha o tipo: ");
            tipo = sc.nextInt();
        } while(tipo < 1 || tipo > 3);

        int quantidade = 0;
        Animal animal = null;
        switch(tipo) {
            case 1:
                animal = new Aquatico();
                quantidade = ((Aquatico) animal).getQuantidadeAquaticos();
                break;
            case 2:
                animal = new Terrestre();
                quantidade = ((Terrestre) animal).getQuantidadeTerrestres();
                break;
            case 3:
                animal = new Voador();
                quantidade = ((Voador) animal).getQuantidadeVoadores();
                break;
        }
        return quantidade - 1;
    }

    public static int mostrarQuantidadePorHabitat(Habitat habitat) {
        int quantidade = 0;

        if(habitat instanceof Jaula) {
            quantidade = ((Jaula) habitat).getQuantidadeAnimais();
        } else if(habitat instanceof Gaiola) {
            quantidade = ((Gaiola) habitat).getQuantidadeAnimais();
        } else if(habitat instanceof Aquario) {
            quantidade = ((Aquario) habitat).getQuantidadeAnimais();
        } else if(habitat instanceof Lago) {
            quantidade = ((Lago) habitat).getQuantidadeAnimais();
        } else {
            quantidade = ((Viveiro) habitat).getQuantidadeAnimais();
        }
        return quantidade;
    }

    public static double mostrarAreaOcupada(Habitat habitat) {
        return habitat.getArea();
    }

}
