/*POO-Lista-02-METODOS-Parte02
 * 
 * Flávio Guilherme de Oliveira
 */

public class Exer8 {
	
	public static void main (String[] args) {
		
		int numero = 0, n = 0;
		int um =0, dois =0, tres =0, quatro =0,cinco =0, seis =0;
		
		for (int i =0; i < 1000000; i++){
			numero = dado(n);
			
			if ( numero == 1 ){
				um+=1;
			}
			if ( numero == 2 ){
				dois+=1;
			}
			if ( numero == 3 ){
				tres+=1;
			}
			if ( numero == 4 ){
				quatro+=1;
			}
			if ( numero == 5 ){
				cinco+=1;
			}
			if ( numero == 6 ){
				seis+=1;
			}
		}
		System.out.printf(" 1: " + um + " - %.2f%%", (float) um/1000000*100);
		System.out.printf("\n 2: " + dois+ " - %.2f%%", (float) dois/1000000*100);
		System.out.printf("\n 3: " + tres+ " - %.2f%%", (float) tres/1000000*100);
		System.out.printf("\n 4: " + quatro+ " - %.2f%%", (float) quatro/1000000*100);
		System.out.printf("\n 5: " + cinco+ " - %.2f%%", (float) cinco/1000000*100);
		System.out.printf("\n 6: " + seis+ " - %.2f%%", (float) seis/1000000*100);
		
	}
	static int dado (int n){
		return (int)(Math.random()*6)+1;
	}
}	

