/*POO-Lista-00-MATRIZES
 * 
 * Flávio Guilherme de Oliveira
 */
public class Exer7 {
	
	public static void main (String[] args) {
		
		
		int maior=0, menor=100, a=0;
		int linha = (int)(Math.random()*10)+1;
		int coluna = (int)(Math.random()*10)+1;
		
		
		int E[][] = new int [linha][coluna];
		int posicao[] = new int [2];
		int posicaoMenor[] = new int [2];
		
		System.out.println(" Matriz:");
		System.out.println();
		
		for(int i=0; i < E.length; i++){
			for(int j=0; j < E[i].length; j++){
				
				E[i][j] = (int)(Math.random()*50)+1;
				System.out.print(" "+E[i][j]);
				
				if(E[i][j] >= maior){
					maior = E[i][j];
					posicao[0] = i+1;
					posicao[1] = j+1;

				}
				
				if(E[i][j] <= menor){
					menor = E[i][j];
					posicaoMenor[0] = i+1;
					posicaoMenor[1] = j+1;
					
				}
			}
			System.out.println();
		}
	System.out.println();
	System.out.print(" O Maior valor : "+maior);
	System.out.print("\n Posicao: ["+ posicao[0]+"]["+posicao[1]+"]\n");
    System.out.print(" O Menor valor : "+menor);
    System.out.print("\n Posicao: ["+ posicaoMenor[0]+"]["+posicaoMenor[1]+"]");
		
	}
}


