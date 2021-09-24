/*POO-Lista-00-MATRIZES
 * 
 * Flávio Guilherme de Oliveira
 */
public class Exer20{
	
	public static void main (String[] args) {
		
		int t[][] = new int [10][10];
		
		System.out.println(" Ampulheta\n");
		for(int i = 0 ; i < t.length ; i++){
			for(int j = 0 ; j < t[i].length ; j++){
				if (( i <= j && i + j <= t.length - 1 ) ||
				    ( i >= j && i + j >= t.length - 1 )){
					System.out.print( t[i][j] + " ");
				} else {
					System.out.print( "- ");
				}
			}
			System.out.println();
		}
	}	
}

