/*POO-Lista-00-MATRIZES
 * 
 * Flávio Guilherme de Oliveira
 */
public class Exer19{
	
	public static void main (String[] args) {
		
		int s[][] = new int [10][10];
		
		System.out.println(" Asa da borboleta\n");
		for(int i = 0 ; i < s.length ; i++){
			for(int j = 0 ; j < s[i].length ; j++){
				if (( i >= j && i + j <= s.length - 1 ) ||
				    ( i <= j && i + j >= s.length - 1 )){
					System.out.print( s[i][j] + " ");
				} else {
					System.out.print( "- ");
				}
			}
			System.out.println();
		}
	}	
}

