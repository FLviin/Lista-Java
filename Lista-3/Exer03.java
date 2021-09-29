/*POO-Lista-02-METODOS-Parte03
 * 
 * Flávio Guilherme de Oliveira
 */
 import java.util.Scanner;
public class Exer03 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int c = 0, f = 0, k = 0;
		char resp;
		
		do{
			do{	
										
				System.out.print(" [C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: ");
				resp = leia.nextLine().toLowerCase().charAt(0);
				
				if(resp != 'c' && resp !='f' && resp !='k' && resp !='s'){
					System.out.println(" Opcao invalida !");
				}
			}while (resp != 'c'&& resp !='f' && resp !='k' && resp !='s');
		
			if( resp == 'c'){
			System.out.print(" Entre Com a Temperatura: ");
			c = sc.nextInt();
				System.out.print(" F: " + celcius(c));
				System.out.println(" K: " + kelvin(c));
			}
			else if( resp == 'f'){
			System.out.print(" Entre Com a Temperatura: ");
			f = sc.nextInt();
				System.out.print(" C: " + farenh(f));
				System.out.println(" K: " +kelvin(farenh(f)));
			}
			else if( resp == 'k'){
			System.out.print(" Entre Com a Temperatura: ");
			k = sc.nextInt();
				System.out.print(" C: "+kelvinC(k));
				System.out.println(" F: "+celcius(kelvinC(k)));
			}
			else{
				
			System.out.print(" ");
			}
			
			
		}while( resp != 's' );
		
		
		System.out.print(" FIM !");
	}
	static int celcius ( int c ){
	// conversao de Celcius para Fahrenheit	
		return (9*c/5)+32;
	}
	// conversao de Fahrenheit para Celcius
	static int farenh ( int f ){	
	return  5*(f-32)/9;
	}
	
	static int kelvin ( int k ){	
	return  k + 273;
	}
	static int  kelvinC( int kc ){	
	return  kc- 273;
	}
}

