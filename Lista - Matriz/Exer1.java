/*POO-Lista-00-MATRIZES
 * 
 * Flávio Guilherme de Oliveira
 */
 import java.util.Scanner;
public class Exer1 {
    public static void main(String[] args) {
		Scanner leia = new Scanner ( System.in );
		
		int a[][] = new int[4][5];
		
		System.out.println(" == Entre com 20 valores ==\n");
		
		for ( int i = 0 ; i < a.length ; i++ ) {			
			for ( int j = 0 ; j < a[i].length ; j++ ) {				
				System.out.print
				(" Entre com um numero na posicao A["+i+"]["+j+"]:");
				a[i][j] = leia.nextInt();
			}
		}
		
		// Mostrando os elemento digitados na matriz A
		System.out.println("\nMostrando a matriz A:");
		for ( int i = 0 ; i < a.length ; i++ ) {
			for ( int j = 0 ; j < a[i].length ; j++ ) {
				System.out.print( a[i][j] + " " );
			}
			System.out.println();
		}
	}
}
