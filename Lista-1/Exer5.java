/*POO-Lista-01-METODOS-Parte01
 * 
 * Flávio Guilherme de Oliveira
 */
 import java.util.Scanner;
 import java.util.Arrays;
public class Exer5 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double a,b,c;
		
		System.out.print(" Entre com valor de A: ");
		a = leia.nextDouble();
		
		System.out.print(" Entre com valor de B: ");
		b = leia.nextDouble();
		
		System.out.print(" Entre com valor de C: ");
		c = leia.nextDouble();
		
		System.out.println("\n Delta: "+delta (a,b,c)+"\n");
		System.out.print(" Respota: ");
		imprimir(equacaoSegundoGrau(a,b,c));
		
	}
	static void imprimir (double[] array){
		System.out.println(Arrays.toString(array));
		
	}
	static double[] equacaoSegundoGrau (double a,double b,double c){
		double d = delta(a,b,c);
		int raizes = 0;
		
		if (!testeEquacao (a) || d<0.0) return null;
		
		if (d >0) raizes =2;
		else raizes = 1;
		
		double retorna[] = new double[raizes];
			
		if (d>0){
		retorna[0] = (-b + Math.sqrt(d))/2*a;
		retorna[1] = (-b - Math.sqrt(d))/2*a;	
		}else {
		retorna[0] = -b/2*a;	
		}
		
		return retorna;
		
	}
	
	static boolean testeEquacao (double a){
		return (a!=0.0);
	}
	
	static double delta(double a,double b,double c){
			
		return Math.pow(b,2)-4*a*c;
	}
}

