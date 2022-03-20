import java.util.ArrayList;
import java.util.Scanner;

public class Colegio {

    public static Scanner sc = new Scanner(System.in);
    public static Scanner scStr = new Scanner(System.in);
    public static ArrayList<Sala> salas = new ArrayList<Sala>();
    public static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public static void main(String[] args) throws Exception {
        int opcao = 0;

        do {
            System.out.println("----- MENU -----");
                System.out.println("1: Cadastrar sala");
                System.out.println("2: Listar salas");
                System.out.println("3: Cadastrar pessoas");
                System.out.println("4: Adicionas pessoas à sala");
                System.out.println("5: Sair");
            System.out.print("Sua opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    salas.add(cadastrarSala());
                    break;
                case 2:
                    listarSalas();
                    break;
                case 3:
                    System.out.println("Salas disponíveis: ");
                    listarSalas();
                    System.out.println("Digite o número da sala escolhida: ");
                    int numeroSala = sc.nextInt();
                    int capacidade = capacidadeSala(salas.get(numeroSala - 1));
                    cadastrarPessoas(capacidade);
                    break;
                case 4:
                    System.out.println("Quer preencher qual sala? ");
                    listarSalas();
                    System.out.print("Digite o número da sala a ser preenchida: ");
                    int numeroSalaPreencher = sc.nextInt();
                    for(int i = 0; i < salas.size(); i++) {
                        salas.get(numeroSalaPreencher - 1).adicionarPessoas(pessoas);
                        System.out.println("Sala preenchida!\n");
                        salas.get(numeroSalaPreencher - 1).listarPessoasNaSala();
                    }
                    pessoas.clear();
                    break;
                case 5:
                    break;
            }
        } while(opcao != 5);
        sc.close();
        scStr.close();

    }

    public static Sala cadastrarSala() {
        System.out.print("Capacidade da sala: ");
        int capacidade = sc.nextInt();
        Sala sala = new Sala(capacidade);
        System.out.print("Nome da sala: ");
        sala.setNome(scStr.nextLine());
        return sala;
    }

    public static int capacidadeSala(Sala sala) {
        return sala.getCapacidade();
    }

    public static void cadastrarPessoas(int capacidade) {
        int contador = 1;
        while(capacidade > 0) {
            System.out.println(contador + "° pessoa:");
            System.out.print("Nome: ");
            String nome = scStr.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            if(capacidade > 1) {
                System.out.print("Curso: ");
                String curso = scStr.nextLine();
                System.out.print("Mensalidade: ");
                double mensalidade = sc.nextDouble();
                pessoas.add(new Aluno(nome, idade, curso, mensalidade));
            }
            if(capacidade == 1) {
                System.out.print("Disciplinas lecionadas (mín. 1 e máx. 3): ");
                int quantidadeDisciplinas = sc.nextInt();
                String[] disciplinas = new String[quantidadeDisciplinas];
                for(int i = 0; i < disciplinas.length; i++) {
                    System.out.print((i + 1) + "° disciplina: ");
                    disciplinas[i] = scStr.nextLine();
                }
                System.out.print("Salário: ");
                double salario = sc.nextDouble();
                pessoas.add(new Professor(nome, idade, disciplinas, salario));
            }
            capacidade--;
            contador++;
        }
    }

    public static void listarSalas() {
        for(int i = 0; i < salas.size(); i++) {
            System.out.println("Sala " + (i + 1) + ": \n" + salas.get(i).toString());
            System.out.println();
        }
    }

}
