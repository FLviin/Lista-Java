/*POO-Lista-02-METODOS-Parte02
 * 
 * Flávio Guilherme de Oliveira
 */
 
import java.util.Scanner;
public class Exer1 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n1,n2;
		
		System.out.print(" Primeiro valor: ");
		n1 = leia.nextInt();

		System.out.print(" Segundo valor: ");
		n2 = leia.nextInt();
		
		System.out.println("\n Maior valor eh: "+maior(n1,n2));
	}
	
	static int maior(int numero1, int numero2){
		
		return (numero1>numero2 ? numero1 : numero2);
		
	}
}

