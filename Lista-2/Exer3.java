/*POO-Lista-02-METODOS-Parte02
 * 
 * Flávio Guilherme de Oliveira
 */
import java.util.Scanner;
public class Exer3 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int n1 , n2;
		
		System.out.print(" Primeiro Valor: ");
		n1 = leia.nextInt();

		System.out.print(" Segundo Valor: ");
		n2 = leia.nextInt();
		
		System.out.print(" Maior Valor eh: "+ maior (n1,n2));
		
	}
	static int maior(int N1, int N2){
	return Math.max( N1 , N2);		
	}
}


