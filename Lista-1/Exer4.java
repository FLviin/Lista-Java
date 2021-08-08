/*POO-Lista-01-METODOS-Parte01
 * 
 * Flávio Guilherme de Oliveira
 */
 import java.util.Scanner;
 
public class Exer4 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double a,b,c;
		
		System.out.print(" Entre com valor de A: ");
		a = leia.nextDouble();
		
		System.out.print(" Entre com valor de B: ");
		b = leia.nextDouble();
		
		System.out.print(" Entre com valor de C: ");
		c = leia.nextDouble();
		
		System.out.println("\n Delta: "+delta (a,b,c));
		
	}
	
	static double delta(double a,double b,double c){
			
		return Math.pow(b,2)-4*a*c;
	}
}

