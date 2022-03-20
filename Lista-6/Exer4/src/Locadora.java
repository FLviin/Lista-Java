import java.util.ArrayList;
import java.util.Scanner;

public class Locadora {

    public static Scanner sc = new Scanner(System.in);
    public static Scanner scStr = new Scanner(System.in);
    public static ArrayList<Midia> midias = new ArrayList<Midia>();
    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public static void main(String[] args) throws Exception {

        int opcao = 0;

        do {
            System.out.println("----- MENU -----");
                System.out.println("1: Cadastrar cliente");
                System.out.println("2: Listar clientes");
                System.out.println("3: Cadastrar mídia");
                System.out.println("4: Listar mídias");
                System.out.println("5: Alugar mídia");
                System.out.println("6: Devolver mídia");
                System.out.println("7: Sair");
            System.out.print("Sua opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    Cliente cliente = new Cliente();
                    cliente = cadastrarCliente(cliente);
                    clientes.add(cliente);
                    System.out.println(cliente.toString());
                    break;
                case 2:
                    listarClientes();
                    break;
                case 3:
                    Midia midia = new Midia();
                    midia = cadastrarMidia(midia);
                    midias.add(midia);
                    System.out.println(midia.toString());
                    break;
                case 4: 
                    listarMidias();
                    break;
                case 5: 
                   Aluguel aluguel1 = new Aluguel();
                   System.out.print("Mídias disponíveis: ");
                   int cont = 0;
                   for(Midia i : midias) {
                       System.out.println("Mídia " + (cont + 1) + ": " + i.toString());
                   }
                   System.out.print("Qual mídia deseja alugar? ");
                   int opcaoMidia = sc.nextInt();
                   cont = 0;
                   System.out.println("Clientes cadastrados: ");
                   for(Cliente i : clientes) {
                       System.out.println("Cliente " + (cont + 1) + ": " + i.toString());
                   }
                   System.out.print("Qual é o cliente que vai alugar a mídia? ");
                   int opcaoCliente = sc.nextInt();
                   aluguel1.alugarMidia(midias.get(opcaoMidia - 1), clientes.get(opcaoCliente - 1));
                   break;
                case 6:
                    Aluguel aluguel2 = new Aluguel();
                    System.out.println("Mídia que foram alugadas: ");
                    cont = 0;
                    for(Midia i : midias) {
                       System.out.println("Mídia " + (cont + 1) + ": " + i.toString());
                    }
                    System.out.print("Qual mídia deseja devolver? ");
                    opcaoMidia = sc.nextInt();
                    cont = 0;
                    System.out.println("Clientes cadastrados: ");
                    for(Cliente i : clientes) {
                        System.out.println("Cliente " + (cont + 1) + ": " + i.toString());
                    }
                    System.out.print("Qual é o cliente que vai devolver a mídia? ");
                    opcaoCliente = sc.nextInt();
                    aluguel2.devolverMidia(midias.get(opcaoMidia - 1), clientes.get(opcaoCliente - 1));
                    break;
                default:
                    break;
            }
        } while(opcao != 7);
        sc.close();

    }

    public static Cliente cadastrarCliente(Cliente cliente) {
        System.out.print("Código do cliente: ");
        int codigo = sc.nextInt();
        cliente.setCodigo(codigo);
        System.out.print("Nome do cliente: ");
        String nome = scStr.nextLine();
        cliente.setNome(nome);
        System.out.print("Idade do cliente: ");
        int idade = sc.nextInt();
        cliente.setIdade(idade);
        return cliente;
    }

    public static void listarClientes() {
        for(int i = 0; i < clientes.size(); i++) {
            System.out.println("Cliente " + (i + 1));
            System.out.println(clientes.get(i).toString());
        }
    }

    public static Midia cadastrarMidia(Midia midia) {
        System.out.print("Código da mídia: ");
        int codigo = sc.nextInt();
        midia.setCodigo(codigo);
        System.out.print("Descrição da mídia: ");
        String descricao = scStr.nextLine();
        midia.setDescricao(descricao);

        int tipo = 0;
        do {
            System.out.println("Tipo da mídia: ");
                System.out.println("1: Filme");
                System.out.println("2: Livro");
                System.out.println("3: Jogo");
            tipo = sc.nextInt();
            switch(tipo) {
                case 1:
                    midia.setTipo("Filme");
                    midia = new Filme();
                    System.out.print("Classificação do filme: ");
                    String classificacao = scStr.nextLine();
                    ((Filme) midia).setClassificacao(classificacao);
                    System.out.print("Duração do filme: ");
                    int duracao = sc.nextInt();
                    ((Filme) midia).setDuracao(duracao);
                    break;
                case 2:
                    midia.setTipo("Livro");
                    midia = new Livro();
                    System.out.print("Autor do livro: ");
                    String autor = scStr.nextLine();
                    ((Livro) midia).setAutor(autor);
                    System.out.print("Editora do livro: ");
                    String editora = scStr.nextLine();
                    ((Livro) midia).setEditora(editora);
                    System.out.print("Edição do livro: ");
                    int edicao = sc.nextInt();
                    ((Livro) midia).setEdicao(edicao);
                    break;
                case 3:
                    midia.setTipo("Jogo");
                    midia = new Jogo();
                    System.out.print("Console do jogo: ");
                    String console = scStr.nextLine();
                    ((Jogo) midia).setConsole(console);
                    break;
                default:
                    System.out.println("Tipo inválido!");
                    break;
            }
        } while(tipo < 1 && tipo > 3);
        System.out.print("Gênero da mídia: ");
        String genero = scStr.nextLine();
        midia.setGenero(genero);
        System.out.print("Valor da mídia: ");
        double valor = sc.nextDouble();
        midia.setValor(valor);
        return midia;
    }

    public static void listarMidias() {
        for(int i = 0; i < midias.size(); i++) {
            System.out.println("Mídia " + (i + 1));
            System.out.println(midias.get(i).toString());
        }
    }

}
