/*POO-Lista-00-MATRIZES
 * 
 * Flávio Guilherme de Oliveira
 */

public class Exer8 {
	public static void main (String[] args) {
	
	int linha = (int)(Math.random()*10)+1;
	int coluna = (int)(Math.random()*10)+1;			
	int F[][] = new int [linha][coluna];
	int contarPar =0, contarImpar =0;
		
		System.out.println(" Matriz:");
		System.out.println();
		
		for (int i = 0; i < F.length; i++){
			for(int j = 0; j < F[i].length; j++){
				
				F[i][j] = (int)(Math.random()*50)+1;
				System.out.print(" "+F[i][j]);
				
					if(F[i][j] % 2 == 0){
					contarPar++;
				
					}
					else{
					
					contarImpar++;
					}						
			}	System.out.println();
		}
		int pares [] = new int [contarPar], impares [] = new int [contarImpar];
		int elementoPar =0, elementoImpar =0;
		
		for(int i =0; i < F.length; i++){
			for(int j =0; j < F[i].length; j++){
				if(F[i][j] % 2 == 0){
				pares[elementoPar++] = F[i][j];
				}
				else{
				impares[elementoImpar++] = F[i][j];
				}
			}
		}
		
		
		
		System.out.println("\nPares: " + contarPar);
		for(int i =0; i < pares.length; i++){
			System.out.print(pares[i]+" ");
		}
		
		System.out.println("\nImPares: "+ contarImpar);
		for(int i =0; i < impares.length; i++){
			System.out.print(impares[i]+" ");
		}		
	}
}

