/*POO-Lista-00-MATRIZES
 *
 * Flávio Guilherme de Oliveira
 */
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class Exer29 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int elementos = 0, contador =0;
		
		System.out.print(" Quantidade de elementos: ");
		elementos = leia.nextInt();
		
		int vetor[] = new int [elementos];
			
		System.out.println();
		System.out.print("Vetor Gerado: ");
			for(int i =0; i < vetor.length; i++){
				vetor[i] = (int)(Math.random()*10);
				System.out.print(vetor[i]+" ");
				}
		int matriz [][];
		
		System.out.println();
		System.out.println("Matriz: ");
		System.out.println();
		for (int i = 0; i < elementos; i++){
			System.out.print( vetor[i]+", ");
			contador=0;

			matriz = new int [elementos][vetor[i]+1];
			matriz[i][0] = vetor[i];
			int j =0;
			
			while (contador<vetor[i]){
				int conta = 0 ;
				matriz[i][contador] = vetor[i];
				for (int y=1; y<=j; y++){
					if(j%y==0)conta++;
				}
				if (conta==2){
					System.out.print(j+ " " );
					contador++;
					}
				j++;
			}
            System.out.println();
        }
		
	}
}

