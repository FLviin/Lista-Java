import java.util.Scanner;

public class usaCalculador {
    public static void main(String[] args) {
       
        Scanner leia = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        int opcao =0;
        do{
            System.out.println(" === MENU ===");
            System.out.println(" 1 - Entrar com o primeiro numero");
            System.out.println(" 2 - Entrar com o segundo numero");
            System.out.println(" 3 - Ver os numeros da Calculadora");
            System.out.println(" 4 - Somar");
            System.out.println(" 5 - Subtrair");
            System.out.println(" 6 - Multiplicar");
            System.out.println(" 7 - Dividir");
            System.out.println(" 8 - Sair");
            System.out.println(" --------------------------------------- ");
            System.out.println(" opcao: ");
            opcao = leia.nextInt();
            switch ( opcao ) {
				
				case 1:
					System.out.print("Entre com um numero: ");
					int numero = leia.nextInt();
					calc.setNumero1 ( numero );
					break;
				
				case 2:
					System.out.print("Entre com um numero: ");
					calc.setNumero2 ( leia.nextInt() );
					break;
				
				case 3:
					System.out.println("Numero 1: " + calc.getNumero1() );
					System.out.println("Numero 2: " + calc.getNumero2() );
					break;
				
				case 4:
					System.out.println("Soma: " + calc.somar() );
					break;
				
				case 5:
					System.out.println("Diferenca: " + calc.subtrair() );
					break;
				
				case 6:
					System.out.println("Produto: " + calc.multiplicar() );
					break;
				case 7:
					System.out.println("Divisao: " + calc.dividir() );
					break;

                    case 8:
					System.out.println("\n<<< RESUMO >>>");
					System.out.println("Numero 1.: " + calc.getNumero1() );
					System.out.println("Numero 2.: " + calc.getNumero2() );
					System.out.println("Soma.....: " + calc.somar() );
					System.out.println("Diferenca: " + calc.subtrair() );
					System.out.println("Produto..: " + calc.multiplicar() );
					System.out.println("Divisao..: " + calc.dividir() );
					break;
					
				case 9:
					System.out.println("\n\tFim do programa!\n");
					break;
					
				default:
					System.out.println("\n\tOpcao invalida!\n");
			}
		} while ( opcao != 9 );
    }
}
