/*POO-Lista-02-METODOS-Parte02
 * 
 * Flávio Guilherme de Oliveira
 */
import java.util.Scanner;
public class Exer5 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int n1 , n2, n3;
		
		System.out.print(" Primeiro Valor: ");
		n1 = leia.nextInt();

		System.out.print(" Segundo Valor: ");
		n2 = leia.nextInt();
		
		System.out.print(" Terceiro Valor: ");
		n3 = leia.nextInt();
		
		System.out.print("\n Maior Valor eh: "+ maior (n1,n2,n3));
		
	}
	static int maior (int n1 ,int n2){	
		return (n1 < n2 ? n1 : n2);
	}
	static int maior (int n1 ,int n2 ,int n3){	
		if (n1 > n2 && n1 > n3 ){
			return n1;
		}else if(n2 > n1 && n2 > n3 ) {
			return n2;
		}		
			return n3;
	}	
}

