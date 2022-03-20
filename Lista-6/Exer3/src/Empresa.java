import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {

    public static Scanner sc = new Scanner(System.in);
    public static Scanner scStr = new Scanner(System.in);
    public static ArrayList<Candidato> candidatos = new ArrayList<Candidato>();
    public static ArrayList<Vaga> vagas = new ArrayList<Vaga>();

    public static void main(String[] args) throws Exception {

        int opcao = 0;

        do {
            System.out.println("----- MENU -----");
                System.out.println("1: Cadastrar candidato");
                System.out.println("2: Cadastrar vaga");
                System.out.println("3: Cadastrar candidato à vaga");
                System.out.println("4: Listar vagas por tipo");
                System.out.println("5: Mostrar quantidade de candidatos e sua situação");
                System.out.println("6: Mostrar candidatos X vagas");
                System.out.println("7: Sair");
            System.out.print("Sua opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    Candidato candidato = cadastrarCandidato();
                    candidatos.add(candidato);
                    break;
                case 2:
                    cadastrarVaga();
                    break;
                case 3:
                    int cont = 0;
                    for(Candidato i : candidatos) {
                        System.out.println("Candidato " + (cont + 1) + ": " + i.getNome());
                        cont++;
                    }
                    System.out.print("Número do candidato escolhido: ");
                    int numeroCandidato = sc.nextInt();
                    cont = 0;
                    for(Vaga i : vagas) {
                        System.out.println("Vaga " + (cont + 1) + ":  " + i.getDescricao());
                        cont++;
                    }
                    System.out.print("Número da vaga escolhida: ");
                    int numeroVaga = sc.nextInt();
                    Vaga.inscreverCandidato(candidatos.get(numeroCandidato - 1), vagas.get(numeroVaga - 1));
                    break;
                case 4:
                    listarCandidatos();
                    listarVagas(vagas);
                    break;
                case 5:
                    mostrarCandidatosSituacao();
                    break;
                case 6:
                    System.out.println("Candidato X Vaga:");
                    System.out.println(Vaga.getInscricoes());
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opção inexistente!");
                    break;
            }
        } while(opcao != 7);
        sc.close();

    }

    public static Candidato cadastrarCandidato() {
        int situacao = 0;
        Candidato candidato = null;

        do {
            System.out.println("Situação");
                System.out.println("1. Empregado");
                System.out.println("2. Desempregado");
            System.out.print("Situação do candidato: ");
            situacao = sc.nextInt();

            switch(situacao) {
                case 1:
                    candidato = new Empregado();
                    candidato.setSituacao("Empregado");
                    System.out.print("Empresa em que trabalha: ");
                    String empresa = scStr.nextLine();
                    ((Empregado) candidato).setEmpresa(empresa);
                    break;
                case 2:
                    candidato = new Desempregado();
                    candidato.setSituacao("Desempregado");
                    System.out.print("Está desempregado há quanto tempo? ");
                    int tempo = sc.nextInt();
                    ((Desempregado) candidato).setTempoDesempregado(tempo);
                    break;
                default:
                    System.out.println("Situação inexistente!");
                    break;
            }
        } while(situacao < 1 || situacao > 2);
        System.out.print("Nome do candidato: ");
        String nome = scStr.nextLine();
        candidato.setNome(nome);
        System.out.print("Idade do candidato: ");
        int idade = sc.nextInt();
        candidato.setIdade(idade);
        return candidato;
    }

    public static void listarCandidatos() {
        for(int i = 0; i < candidatos.size(); i++) {
            System.out.println(candidatos.get(i));
        }
    }

    public static void cadastrarVaga() {
        int tipo = 0;
        Vaga vaga = null;

        do {
            System.out.println("Tipo");
                System.out.println("1. Estágio");
                System.out.println("2. Contrato");
            System.out.print("Tipo da vaga: ");
            tipo = sc.nextInt();

            switch(tipo) {
                case 1:
                    vaga = new Estagio();
                    System.out.print("Tempo de estágio: ");
                    int tempo = sc.nextInt();
                    ((Estagio) vaga).setTempo(tempo);
                    vagas.add(vaga);
                    break;
                case 2:
                    vaga = new Contrato();
                    System.out.print("A vaga é temporária? ");
                    boolean temporario = sc.nextBoolean();
                    ((Contrato) vaga).setTemporario(temporario);
                    vagas.add(vaga);
                    break;
                default:

                    break;
            }
        } while(tipo < 1 || tipo > 2);
        System.out.print("Descrição da vaga: ");
        String descricao = scStr.nextLine();
        vaga.setDescricao(descricao);
        System.out.print("Salário oferecido: ");
        double salario = sc.nextDouble();
        vaga.setSalarioOferecido(salario);
    }

    public static void listarVagas(ArrayList<Vaga> vagas) {
        int opcao = 0;

        do {
            System.out.println("Listar vagas");
                System.out.println("1: Estágio");
                System.out.println("2: Contrato");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    for(Vaga i : vagas) {
                        if(i instanceof Estagio) {
                            System.out.println(i.toString());
                        }
                    }
                    break;
                case 2: 
                    for(Vaga i : vagas) {
                        if(i instanceof Contrato) {
                            System.out.println(i.toString());
                        }
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Inexistente!");
                    break;
            }
        } while(opcao != 3);
    }

    public static void mostrarCandidatosSituacao() {
        System.out.println("Quantidade de candidatos: " + Candidato.quantidade);
        System.out.println("Situação dos candidatos: ");
        for(Candidato i : candidatos) {
            System.out.println(i.getNome() + ": " + i.getSituacao());
        }
    }

}
