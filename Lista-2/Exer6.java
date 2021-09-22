/*POO-Lista-02-METODOS-Parte02
 * 
 * Flávio Guilherme de Oliveira
 */
 
import java.util.Scanner;

public class Exer6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int menor =0 , numero =0;
        char resp;
        boolean a = true;
        
        do{	
			numero = verificaNumero();
			if (a){
			menor = numero; 
			a = false;
			}
			menor = verificaMenor(numero , menor);

		System.out.print(" Inserir outro [s/n]: ");
		resp = sc.nextLine().charAt(0);
		
		}while(resp == 's');
		
		System.out.print(" O menor eh: "+ menor);

    }
    
    static int verificaMenor (int numero, int menor){
		return (numero< menor ? numero : menor);
	}
    
    static int verificaNumero(){
		Scanner sc = new Scanner (System.in);
		System.out.print(" Entre com um numero inteiro: ");
		int valor = sc.nextInt();
		return valor;
	}
}
