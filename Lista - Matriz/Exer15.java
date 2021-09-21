/*POO-Lista-00-MATRIZES
 * 
 * Flávio Guilherme de Oliveira
 */
public class Exer15{
	
	public static void main (String[] args) {
		
		int o[][] = new int [10][10];
		
		System.out.println(" Abaixo da diagonal principal e Acima da Diagonal Secundaria\n");
		for(int i = 0 ; i < o.length ; i++){
			for(int j = 0 ; j < o[i].length ; j++){
				if ( i>=j && i + j <= o.length - 1 ) {
					System.out.print( o[i][j] + " ");
				} else {
					System.out.print( "- ");
				}
			}
			System.out.println();
		}
	}	
}

