/*POO-Lista-02-METODOS-Parte03
 * 
 * Flávio Guilherme de Oliveira
 */
import java.util.Scanner;
public class Exer1 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int c = 0, f = 0;
		
		System.out.print(" Entre com a temperatura em Celcius: ");
		c = leia.nextInt();
		
		f = conversao( c );
		System.out.print("\n A temperatura em Fahrenheit eh: " + f);
	}
	
	static int conversao ( int c ){	
		return (9*c/5)+32 ;
	}
}

