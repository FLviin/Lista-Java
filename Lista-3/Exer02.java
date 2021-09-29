/*POO-Lista-02-METODOS-Parte03
 * 
 * Flávio Guilherme de Oliveira
 */
 import java.util.Scanner;
public class Exer2 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		double c = 0, f = 0;
		char resp ;
		
		do{
			do{								
				System.out.print(" [C]Celsius, [F] Fahrenheit e [S] Sair: ");
				resp = leia.nextLine().toLowerCase().charAt(0);
				
				if(resp != 'c' && resp !='f' && resp !='s'){
					System.out.println(" Opcao invalida !");
				}
			}while (resp != 'c'&& resp !='f' && resp !='s');
		
			if( resp == 'c'){
			System.out.print(" Entre Com a Temperatura: ");
			f = sc.nextDouble();
				f = conversaoC(c);
				System.out.println(" Saida: "+f+" Fahrenheit");
			}
			else if( resp == 'f'){
			System.out.print(" Entre Com a Temperatura: ");
			c = sc.nextDouble();
				c = conversaoC(f);
				System.out.println(" Saida: "+c+" Celcius");
			}
			else{
				
			System.out.print(" ");
			}
		
		
		}while( resp != 's' );
		
		
		System.out.print(" FIM !");
	}
	static double conversaoC ( double c ){
		// conversao de Celcius para Fahrenheit	
		return (9*c/5)+32;
	}
	// conversao de Fahrenheit para Celcius
	static double conversaoF ( double f ){	
	return  5.0*(f-32)/9;
	}
}

