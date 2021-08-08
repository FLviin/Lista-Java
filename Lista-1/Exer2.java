/*POO-Lista-01-METODOS-Parte01
 * 
 * Flávio Guilherme de Oliveira
 */

import java.util.Scanner;

public class Exer2{
   
    public static void main(String[] args) {
	
	Scanner leia = new Scanner (System.in);
	double numero;
	
	System.out.print(" Entre com um numero: ");
	numero = leia.nextDouble();
	
	if (isZero (numero)){
		System.out.println("\n O numero Digitado eh zero");
	}else{
		System.out.println("\n O numero Digitado NAO eh zero");
	 } 
	}
	static boolean isZero( double numero){		
		return (numero == 0.0);
	}	
}
