/*POO-Lista-00-MATRIZES
 * 
 * Flávio Guilherme de Oliveira
 */
public class Exer18{
	
	public static void main (String[] args) {
		
		int r[][] = new int [10][10];
		
		System.out.println(" Acima da diagonal principal e Acima da Diagonal Secundaria\n");
		for(int i = 0 ; i < r.length ; i++){
			for(int j = 0 ; j < r[i].length ; j++){
				if ( i<=j && i + j <= r.length - 1 ) {
					System.out.print( r[i][j] + " ");
				} else {
					System.out.print( "- ");
				}
			}
			System.out.println();
		}
	}	
}

