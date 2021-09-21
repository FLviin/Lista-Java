/*POO-Lista-00-MATRIZES
 * 
 * Flávio Guilherme de Oliveira
 */
import java.util.Scanner;
public class Exer6 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int linha = 0, coluna = 0, valor=0, contador=0, a=0;
		int matriz[][], posicao[][];

		do{	
			System.out.print(" Numero de Linhas: ");
			linha = leia.nextInt();
			
			if (linha >25){
			System.out.println(" Entrada invalida, apenas valores menores que 25\n");
			}
					
		}while(linha >25);
		
		do{
		System.out.print(" Numero de Colunas: ");
		coluna = leia.nextInt();
			if (coluna >25){
			System.out.println(" Entrada invalida, apenas valores menores que 25\n");
			}
					
		}while(coluna >25);
		
		matriz = new int[linha][coluna];
		posicao = new int [50][2];
		
		System.out.print("\n Entre com um Valor: ");
		valor = leia.nextInt();
		
		System.out.println();
		System.out.println(" Matriz: ");
		
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz[i].length; j++){ 
				
				matriz[i][j] = (int)(Math.random()*15);
				System.out.print(" "+matriz[i][j]); 
				
				if(valor == matriz[i][j]){
					posicao[a][0] = i+1;
					posicao[a][1] = j+1;	
					
					contador++;
					a++;
				}
							
			}
			
			System.out.println();
		}
		System.out.print("\n contagem: " + contador);
		
		if (contador > 0){
			for(int i = 0; i < contador ; i++){				
				System.out.print("\n Posicao: ["+ posicao[i][0]+"]["+posicao[i][1]+"]");	
			}
		}
		else{
			System.out.print(" valor nao encontrado");
		}
	}
}

