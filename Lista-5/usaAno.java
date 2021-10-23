import java.util.Scanner;

public class usaAno {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        Ano ano = new Ano();

        int opcao = 0;

        do {

            System.out.println("\n=== MENU ===");
            System.out.println("1) Entrar com o ano");
            System.out.println("2) Mostrar o ano");
            System.out.println("3) Eh bissexto?");
            System.out.println("4) Sair");
            System.out.println("--------------------");
            System.out.print("Opcao: ");
            opcao = leia.nextInt();

            switch (opcao) {

            case 1:
                System.out.print("Entre com o ano: ");

                ano.setAno(leia.nextInt());

                break;

            case 2:
                System.out.println("Ano: " + ano.getAno());

                break;

            case 3:
                System.out.println("Eh bissexto: " + (ano.ehBissexto() ? "sim" : "nao"));

                break;

            case 4:
                System.out.println("\n\tFim do programa!\n");

                break;

            default:
                System.out.println("\n\tOpcao invalida!\n");
            }
        } while (opcao != 4);
    }
}
