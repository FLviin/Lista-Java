/*POO-Lista-00-MATRIZES
 * 
 * Flávio Guilherme de Oliveira
 */

public class Exer27 {
	
	public static void main (String[] args) {
		
		int linha = (int) (Math.random() * 10) + 1;
		int coluna = (int) (Math.random() * 10) + 1;

		int x[][] = new int[linha][coluna];
		System.out.println(" Matriz X");

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = (int) (Math.random() * 50) + 1;			
				System.out.print(x[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println();
		   
		for(int i = 0; i < x.length; i++) {
            for(int j = (x[i].length - 1); j >= 0; j--) {
               for(int k = (j - 1); k >= 0; k--) {
                   if(x[i][j] < x[i][k]) {
                        int aux = x[i][j];
                        x[i][j] = x[i][k];
                        x[i][k] = aux;
                    }
                }
            }
        }


		System.out.println(" Matriz X ordenada por Linha");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++){
				System.out.print(x[i][j]+ " ");
				 
			}
			System.out.println();
		}

	}

}
