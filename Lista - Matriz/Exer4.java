/*POO-Lista-00-MATRIZES
 * 
 * Flávio Guilherme de Oliveira
 */
import java.util.Scanner;

public class Exer4 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
			
		int linha = 0, coluna = 0 , elementos = 0;
		int D[][];
		
		do {
			System.out.print(" Numero de Linhas: ");
			linha = leia.nextInt();

			System.out.print(" Numero de Colunas: ");
			coluna = leia.nextInt();
			if (linha < 1 || coluna <1){
				System.out.println(" Entrada invalida, apenas valores maiores que 1\n");
				}
			
		}while (linha <1 || coluna <1);
		
		System.out.print(" Valor Maximo para os Elementos da Matriz: ");
		elementos = leia.nextInt();	
		
		D = new int[linha][coluna];
		
		System.out.println();
		System.out.println(" Matriz: ");
		
		for (int i = 0; i < D.length; i++){
			for (int j = 0; j < D[i].length; j++){
				
				D[i][j] = (int)(Math.random()*elementos)+1;
				System.out.print(D[i][j]+" ");				
			}
			
			System.out.println();
		}
		
		
	}
}

