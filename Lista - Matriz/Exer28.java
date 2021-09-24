/*POO-Lista-00-MATRIZES
 *
 * Flávio Guilherme de Oliveira
 */

public class Exer28 {

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

        for(int i = (coluna-1); i >=0; i--) {
            for(int j = (linha-1); j >= 0; j--) {
               for(int k = (j - 1); k >= 0; k--) {
                   if(x[j][i] < x[k][i]) {
                       int aux = x[j][i];
                       x[j][i] = x[k][i];
                       x[k][i] = aux;
                    }
               }
            }
        }
        System.out.println(" Matriz X ordenada por Coluna");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++){
                System.out.print(x[i][j]+ " ");
            }
            System.out.println();
        }
	}

}
