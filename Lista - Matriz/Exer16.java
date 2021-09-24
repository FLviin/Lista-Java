/*POO-Lista-00-MATRIZES
 * 
 * Flávio Guilherme de Oliveira
 */
public class Exer16{
	
	public static void main (String[] args) {
		
		int p[][] = new int [10][10];
		
		System.out.println(" Abaixo da diagonal principal e Abaixo da Diagonal Secundaria\n");
		for(int i = 0 ; i < p.length ; i++){
			for(int j = 0 ; j < p[i].length ; j++){
				if ( i>=j && i + j >= p.length - 1 ) {
					System.out.print( p[i][j] + " ");
				} else {
					System.out.print( "- ");
				}
			}
			System.out.println();
		}
	}	
}

