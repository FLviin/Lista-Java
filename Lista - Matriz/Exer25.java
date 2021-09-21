/*POO-Lista-00-MATRIZES
 * 
 * Flávio Guilherme de Oliveira
 */
import java.util.Arrays;

public class Exer25 {
	
	public static void main (String[] args) {
		
		int linha = (int)(Math.random() * 10) + 1;
		int coluna = (int)(Math.random() * 10) + 1;
		
		int y[][] = new int [linha][coluna];
		int aux[] = new int [linha * coluna];
		int cont=0;
		System.out.println(" Matriz Y");
		
		for(int i =0; i < y.length; i++){
			for(int j =0; j < y[i].length; j++){
			y[i][j] = (int)(Math.random() * 50)+1;
			aux[cont] = y [i][j]; 
				System.out.print(y[i][j] + " ");
				cont++;
			}
			System.out.println();
		}
		System.out.println();

		Arrays.sort(aux);
		cont =0;
		
		System.out.println(" Matriz Y ordenada");
			for(int i =0; i < linha; i++){
				for(int j =0; j < coluna; j++){
					y[i][j] = aux[cont];
					System.out.print(y[i][j] + " ");
					cont++;
			}
			System.out.println();
		}
		
	}
}
