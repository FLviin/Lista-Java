
/*POO-Lista-00-MATRIZES
 * 
 * Flávio Guilherme de Oliveira
 */
import java.util.Arrays;

public class Exer26 {

	public static void main(String[] args) {

		int linha = (int) (Math.random() * 10) + 1;
		int coluna = (int) (Math.random() * 10) + 1;

		int w[][] = new int[linha][coluna];
		int aux[] = new int[linha * coluna];
		int cont = 0;
		System.out.println(" Matriz W");

		for (int i = 0; i < w.length; i++) {
			for (int j = 0; j < w[i].length; j++) {
				w[i][j] = (int) (Math.random() * 50) + 1;
				aux[cont] = w[i][j];
				System.out.print(w[i][j] + " ");
				cont++;
			}
			System.out.println();
		}
		System.out.println();

		Arrays.sort(aux);
		cont = (linha * coluna) - 1;

		System.out.println(" Matriz W ordenada");
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				w[i][j] = aux[cont];
				System.out.print(w[i][j] + " ");
				cont--;
			}
			System.out.println();
		}

	}
}