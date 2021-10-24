import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        EstadoLampada estadoLampada = new EstadoLampada();

        int opcao = 0;

        do {

            System.out.println("\n=== MENU ===");
            System.out.println("1) Acender Lampada? ");
            System.out.println("2) Apagar Lampada?");
            System.out.println("3) Deixar Meia Luz ?");
            System.out.println("4) Sair");
            System.out.println("---------------------------------");
            System.out.print("Opcao: ");
            opcao = leia.nextInt();

            switch (opcao) {
            case 1:
                System.out.println("\n Lampada" + estadoLampada.getAceso());
                break;
            case 2:
                System.out.println("\n Lampada" + estadoLampada.getApagado());
                break;
            case 3:
                System.out.println("\n Lampada" + estadoLampada.getMeiaLuz());
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
