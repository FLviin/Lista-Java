/*POO-Lista-00-MATRIZES
 * 
 * Flávio Guilherme de Oliveira
 */
public class Exer14{
	
	public static void main (String[] args) {
		
		int l[][] = new int [10][10];
		
		System.out.println(" Acima da Diagonal Secundaria\n");
		for(int i = 0 ; i < l.length ; i++){
			for(int j = 0 ; j < l[i].length ; j++){
				if ( i + j <= l.length - 1 ) {
					System.out.print( l[i][j] + " ");
				} else {
					System.out.print( "- ");
				}
			}
			System.out.println();
		}
	}
}

