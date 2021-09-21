/*POO-Lista-00-MATRIZES
 * 
 * Flávio Guilherme de Oliveira
 */
public class Exer13{
	
	public static void main (String[] args) {
		
		int k[][] = new int [10][10];
		
		System.out.println(" Acima da Diagonal Principal\n");
		for(int i = 0 ; i < k.length ; i++){
			for(int j = 0 ; j < k[i].length ; j++){
				if ( i<=j ) {
					System.out.print( k[i][j] + " ");
				} else {
					System.out.print( "- ");
				}
			}
			System.out.println();
		}
	}
}

