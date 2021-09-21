/*POO-Lista-00-MATRIZES
 * 
 * Flávio Guilherme de Oliveira
 */
 import java.util.Scanner;
public class Exer23 {
	
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
		int primos[] = new int [linha*coluna];
		int posicao = 0, numero=0;
		
		do{ numero++;
			int contador = 0;
			for(int i = 1; i <= numero; i++){
				if(numero % i == 0){
					contador++;
				}
			}
			if(contador == 2){
				primos[posicao++] = numero;
			}
		}while(primos[primos.length - 1] == 0);
   
    posicao = 0;	

		System.out.println("\n Matriz de primos:\n ");
		for (int i =0; i < matriz.length; i++){
			for (int j=0; j < matriz[i].length; j++){
				
				matriz[i][j] = primos[posicao++];			
				System.out.print( matriz[i][j] + " " );	
			}
				System.out.println();
		}				
	}
}
