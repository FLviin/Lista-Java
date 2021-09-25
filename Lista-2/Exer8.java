/*POO-Lista-02-METODOS-Parte02
 * 
 * Flávio Guilherme de Oliveira
 */

public class Exer8 {
	
	public static void main (String[] args) {
		
		int[] numero = new int [6];
		int jogadas = 1000000;
		
		for (int i =0; i < jogadas; i++){		
			numero[dado()-1]++;
		}
		
		double [] porcet = new double [6];
		
		for (int i =0; i < 6; i++){
			porcet[i] = (numero[i] *100)/(double) jogadas;
			System.out.printf(" %d: %d - %.2f%%\n",i+1,numero[i], porcet[i]);
			
		}
		
	}	
	static int dado (){
		return (int)(Math.random()*6)+1;
	}
}	

