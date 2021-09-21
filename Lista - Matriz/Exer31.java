/*POO-Lista-00-MATRIZES
 *
 * Flávio Guilherme de Oliveira
 */
import java.util.Scanner;

public class Exer31 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int comeca = 0, termina = 0;
		
		System.out.print(" Valor Inicial: ");
		comeca = leia.nextInt();
		
		do{
		System.out.print(" Valor Final: ");
		termina = leia.nextInt();
		
		if (comeca >= termina){
		System.out.print("\n Valor Final deve ser maior que o inicial\n");
		}
		}while(comeca >= termina);
		
		int linha = (int) (Math.random() * 5) + 1;
		int coluna = (int) (Math.random() * 5) + 1;
		
		int matriz[][] = new int [linha][coluna];
		
		for (int i = 0 ; i < matriz.length ; i++){
			for(int j = 0; j < matriz[i].length; j++){
				
				do{
				matriz[i][j] = (int)(Math.random() * termina ) +1;
				}while(matriz[i][j]< comeca);
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}

