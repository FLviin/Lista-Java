/*POO-Lista-00-MATRIZES
 * 
 * Flávio Guilherme de Oliveira
 */
 import java.util.Scanner;
public class Exer24 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int linha=0, coluna =0;
		
		System.out.println(" Entre com a Dimensao da Matriz\n");
		
		do{
		System.out.print(" Linha: ");
		linha = leia.nextInt();
		if(linha <=0){System.out.println(" Valor deve ser Maior que 0");}
		}while(linha <=0);
		do{
		System.out.print(" Coluna: ");
		coluna = leia.nextInt();
		if(coluna <=0){System.out.println(" Valor deve ser Maior que 0");}
		}while(coluna <=0);
		
		int matriz[][] = new int [linha][coluna];
		int a =0, b=1, c=0;
	
		System.out.println("\n Matriz de Fibonacci:\n ");
		for (int i =0; i < matriz.length; i++){
			for (int j=0; j < matriz[i].length; j++){
				
				matriz[i][j] = a;			
				System.out.print( matriz[i][j] + " " );
				c = a + b;
				a = b;
				b = c;				
					
			}
				System.out.println();
		}				
	}
}
