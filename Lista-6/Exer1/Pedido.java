import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
	static Double total = 0.0;
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Scanner leiaStr = new Scanner(System.in);
		
		ArrayList<Produto> produto = new ArrayList<>();
		
		int opcao = 0;
        do {
			System.out.println();
			System.out.println(" == Faça seu Pedido ==");
			System.out.println("1) Add Frios");
			System.out.println("2) Add Paozinho");
            		System.out.println("3) Add Doces");
			System.out.println("4) Ver Pedido");
			System.out.println("5) Ver Total do Pedido");
			System.out.println("6) Sair");
			System.out.println("----------------");
			System.out.print("Opcao: ");
			opcao = leia.nextInt();
			
			switch ( opcao ) {
				
				case 1:	
					System.out.print(" Qual Frios: ");
					String tipo = leiaStr.nextLine();

					System.out.print(" Qual a quantidade: ");
					Double quantidade = leia.nextDouble();

					produto.add( new Frios ( quantidade , tipo ));
				break;

				case 2:
					System.out.print(" Qual Pao: ");
					String tipoPao = leiaStr.nextLine();

					System.out.print(" Qual a quantidade: ");
					Double quantidadePao = leia.nextDouble();

					produto.add( new Paozinho(quantidadePao, tipoPao));
					break;
				case 3:
					System.out.print(" Qual Doce: ");
					String tipoDoce = leiaStr.nextLine();

					System.out.print(" Qual a quantidade: ");
					Double quantidadeDoce = leia.nextDouble();

					produto.add( new Doces ( quantidadeDoce , tipoDoce ));
				break;

				case 4:
					System.out.println("Pedido:");
						for (Produto produto2 : produto) {
							System.out.println(produto2);
						}
					break;
					
				case 5:
					System.out.println(" Total do Pedido = "+ total+" R$");
					break;
				case 6:
					System.out.println("\n\t -- fim do programa --");
					break;
					
				default:
					System.out.println("opcao invalida");
			}
			
		} while ( opcao != 6 );

		leia.close();
		leiaStr.close();
		System.out.println();
		System.out.println("\t Total do Pedido ficou em "+total+" R$");

    }

}
