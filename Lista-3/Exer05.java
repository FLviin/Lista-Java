import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print(" Entre com um valor: ");
        int valor = leia.nextInt();

        System.out.println("\nO número " + valor + " " + (ePrimo(valor) ? "eh Primo" : "Não eh Primo"));

    }
        static  boolean ePrimo (int valor) {
            boolean ePrimo = false;

            for (int sequencia = 1; sequencia <= 1000; sequencia++) {

                int contador = 0,  numero = sequencia;

                for (int a = 1; a <= sequencia; a++) {
                    if (sequencia % a == 0) {
                        contador++;
                    }
                }
                if (contador == 2) {
                    System.out.print(" " + sequencia);
                    if (sequencia == valor) {
                        ePrimo = true;
                    }
                }
            }
            return ePrimo;
        }
}
