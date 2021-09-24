/*POO-Lista-00-MATRIZES
 * 
 * Flávio Guilherme de Oliveira
 */
public class Exer17{
	
	public static void main (String[] args) {
		
		int q[][] = new int [10][10];
		
		System.out.println(" Acima da diagonal principal e Abaixo da Diagonal Secundaria\n");
		for(int i = 0 ; i < q.length ; i++){
			for(int j = 0 ; j < q[i].length ; j++){
				if ( i<=j && i + j >= q.length - 1 ) {
					System.out.print( q[i][j] + " ");
				} else {
					System.out.print( "- ");
				}
			}
			System.out.println();
		}
	}	
}

