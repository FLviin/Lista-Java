/*POO-Lista-00-MATRIZES
 * 
 * Flávio Guilherme de Oliveira
 */

import java.util.Random;
public class Exer02 {
	
	public static void main (String[] args) {
	
		Random aleatorio = new Random();
		
		int b[][];
		b = new int [6][3];
		System.out.println("Matriz B: ");
		for (int i = 0 ; i < b.length ; i++){			
			for (int j = 0 ; j < b[i].length ; j++){	
				 
				b[i][j] = aleatorio.nextInt(100);
				System.out.print(b[i][j]+" ");
			}	
			System.out.println();					
		}
		System.out.println("\nMatriz B (invertiva):");
		
		for (int i = b.length-1; i>=0 ; i-- ){
			for (int j= b[i].length-1; j>=0; j-- ){
					
				System.out.print(b[i][j]+" ");
			}
					System.out.println();
		}
	}
}

