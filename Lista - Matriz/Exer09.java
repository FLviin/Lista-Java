/*POO-Lista-00-MATRIZES
 * 
 * Flávio Guilherme de Oliveira
 */
public class Exer09 {
	
	public static void main (String[] args) {
		
		int G[][] = new int [10][10];
		
		System.out.println(" Diagonal Principal\n");
		for(int i = 0 ; i < G.length ; i++){
			for(int j = 0 ; j < G[i].length ; j++){
				if ( i == j ) {
					System.out.print( G[i][j] + " ");
				} else {
					System.out.print( "- ");
				}
			}
			System.out.println();
		}
	}
}

