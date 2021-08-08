/*POO-Lista-01-METODOS-Parte01
 * 
 * Flávio Guilherme de Oliveira
 */

import java.util.Scanner;

public class Exer1{
   
    public static void main(String[] args) {
	
	Scanner leia = new Scanner (System.in);
	double numero;
	
	System.out.print(" Entre com um numero: ");
	numero = leia.nextDouble();
	
		System.out.println( isPositivo(numero)? "\n O numero "+numero+" eh POSITIVO":
		"\n O numero "+numero+" eh NEGATIVO");
	}	
	static boolean isPositivo( double numero){		
		return (numero >=0.0);
	}	
}
