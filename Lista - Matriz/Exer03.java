/*POO-Lista-00-MATRIZES
 * 
 * Flávio Guilherme de Oliveira
 */

import java.util.Scanner;
public class Exer03 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int a=0;
		int c[][];
		
		do{
		System.out.print(" Digite o tamanha da Matriz: ");
		a = leia.nextInt();
			
			if (a<1 || a>20){
			System.out.println(" Valor invalida! valore aceitos [1 a 20]\n");
			}
		
		}while (a<1 || a>20);
	
		c = new int[a][a];
		
		System.out.println();
		for (int i = 0 ; i< c.length; i++){
			for (int j = 0 ; j< c[i].length; j++){
				
				c[i][j] = (int)(Math.random()*100);
				System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}	
	}
}

