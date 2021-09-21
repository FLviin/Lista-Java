/*POO-Lista-00-MATRIZES
 * 
 * Flávio Guilherme de Oliveira
 */
public class Exer10 {
	
	public static void main (String[] args) {
		
		int H[][] = new int [10][10];
		
		System.out.println(" Diagonal Secundaria\n");
		for(int i = 0 ; i < H.length ; i++){
			for(int j = 0 ; j < H[i].length ; j++){
				if ( i+j == H.length -1 ) {
					System.out.print( H[i][j] + " ");
				} else {
					System.out.print( "- ");
				}
			}
			System.out.println();
		}
	}
}

