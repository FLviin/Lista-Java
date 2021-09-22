/*POO-Lista-02-METODOS-Parte02
 * 
 * Flávio Guilherme de Oliveira
 */
 
import java.util.Scanner;
public class Exer7 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero = 0, n = 0 ;
		char resp;
		
		do{									
			System.out.print(" Jogar o Dado [s/n]: ");
			resp = leia.nextLine().charAt(0);
				if(resp == 's'){	
					numero = dado( n );
					System.out.println(" Saiu: "+ numero);
				}
		}while( resp == 's');

		}
	static int dado (int n){
		return (int)(Math.random()*6)+1;
	}
}	

