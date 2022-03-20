import java.util.ArrayList;
import java.util.Scanner;

public class Floresta {

    public static Scanner sc = new Scanner(System.in);
    public static Scanner scStr = new Scanner(System.in);
    public static int quantidadePlantas = 0;
    public static ArrayList<Planta> plantas = new ArrayList<Planta>();
    public static Planta planta = new Planta();
    public static Arvore arvore = new Arvore();
    public static Flor flor = new Flor();
    public static Carnivora carnivora = new Carnivora();

    public static void main(String[] args) throws Exception {

        int escolha = 0;

        do {
            System.out.println("----- MENU -----");
                System.out.println("1: Cadastrar planta");
                System.out.println("2: Listar plantas");
                System.out.println("3: Quantidade de plantas na floresta");
                System.out.println("4: Quantidade de uma planta selecionada");
                System.out.println("5: Sair");
            System.out.print("Sua escolha: ");
            escolha = sc.nextInt();
            
            switch(escolha) {
                case 1:
                    cadastrarPlanta();
                    break;
                case 2:
                    String lista = listarPlantas();
                    System.out.println("Lista: \n" + lista);
                    break;
                case 3:
                    System.out.println("Quantidade de plantas na floresta: " + quantidadePlantas);
                    break;
                case 4:
                    verQuantidade();
                    break;
            }
        } while(escolha != 5);
        sc.close();
        scStr.close();

    }

    public static void cadastrarPlanta() {
        int opcao = 0;

        do {
            System.out.println("Cadastro");
                System.out.println("1: Árvore");
                System.out.println("2: Flor");
                System.out.println("3: Planta carnívora");
                System.out.println("4. Sair");
            System.out.print("Sua opção: ");
            opcao = sc.nextInt();

            String nome = "", especie = "";
            if(opcao >= 1 && opcao <= 3) {
                System.out.print("Nome: ");
                nome = scStr.nextLine();
                System.out.print("Espécie: ");
                especie = scStr.nextLine();
            }

            switch(opcao) { 
                case 1:
                    quantidadePlantas++;
                    arvore.setQuantidade(1);
                    System.out.print("É frutífera? ");
                    boolean ehFrutifera = sc.nextBoolean();
                    plantas.add(new Arvore(nome, especie, ehFrutifera));
                    break;
                case 2:
                    quantidadePlantas++;
                    flor.setQuantidade(1);
                    System.out.print("Qual é a cor? ");
                    String cor = scStr.nextLine();
                    plantas.add(new Flor(nome, especie, cor));
                    break;
                case 3:
                    quantidadePlantas++;
                    carnivora.setQuantidade(1);
                    System.out.print("É venenosa? ");
                    boolean ehVenenosa = sc.nextBoolean();
                    plantas.add(new Carnivora(nome, especie, ehVenenosa));
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Não existe! Tente novamente!");
                    break;
                }
        } while(opcao != 4);
    }

    public static String listarPlantas() {
        int opcao = 0;
        String lista = "";
        
        do {
            System.out.println("Listar");
                System.out.println("1: Árvore");
                System.out.println("2: Flor");
                System.out.println("3: Planta carnívora");
                System.out.println("4. Sair");
            System.out.print("Sua opção: ");
            opcao = sc.nextInt();
                
            switch(opcao) {
                case 1: 
                    for(Planta i : plantas) {
                        if(i instanceof Arvore) {
                            lista += i.toString();
                        }
                    }
                    break;
                case 2:
                    for(Planta i : plantas) {
                        if(i instanceof Flor) {
                            lista += i.toString();
                        }
                    }
                    break;
                case 3:
                    for(Planta i : plantas) {
                        if(i instanceof Carnivora) {
                            lista += i.toString();
                        }
                    }   
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Não existe! Tente novamente!");
                    break;
            }
        } while(opcao != 4);
        return lista;
    }

    public static void verQuantidade() {
        int opcao = 0;

        do {
        System.out.println("Visualizar quantidade");
            System.out.println("1: Árvore");
            System.out.println("2: Flor");
            System.out.println("3: Planta carnívora");
            System.out.println("4: Sair");
        System.out.print("Sua opção: ");
        opcao = sc.nextInt();

        switch(opcao) {
            case 1:
                System.out.println("Quantidade de árvores: " + arvore.getQuantidade());
                break;
            case 2:
                System.out.println("Quantidade de flores: " + flor.getQuantidade());
                break;
            case 3:
                System.out.println("Quantidade de plantas carnívoras: " + carnivora.getQuantidade());
                break;
            case 4:
                break;
            default:
                System.out.println("Não existe! Tente novamente!");
                break;
            }
        } while(opcao != 4);
    }

}
