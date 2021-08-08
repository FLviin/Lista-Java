/*POO-Lista-01-METODOS-Parte01
 * 
 * Flávio Guilherme de Oliveira
 */
import java.util.Scanner;

public class Exer3 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		double numero;
		
		System.out.print(" Entre com um numero: ");
		numero = leia.nextDouble();
		
		System.out.println(verifica(numero));
	
		}	static String verifica( double numero){		
			if (isZero (numero)) return " Eh Zero";
			if (isPositivo (numero)) return " Eh Positivo";
			return " Eh Negativo";
		}	
			static boolean isZero( double numero){		
			return (numero == 0.0);
		}
			static boolean isPositivo( double numero){		
			return (numero >=0.0);
	}
}
