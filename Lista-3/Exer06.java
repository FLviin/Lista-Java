import java.util.Arrays;
import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valores[] = new int[2];

        for (int i = 0; i < valores.length; i++) {
            System.out.printf(" Entre com valor %d: ", i + 1);
            valores[i] = leia.nextInt();
        }
        Arrays.sort(valores);
        int inicio = valores[0];
        int fim = valores[1];

            int primos [] = sequenciaPrimo(inicio,fim);

            for (int i = 0; i< primos.length ; i++) {
                if (primos[i] > 0 ){
                System.out.print(" " +primos[i]);
                }
            }
    }
    static int[] sequenciaPrimo( int inicio, int fim ){
        int numerosPrimos[] = new int[fim];
        int numero, cont = 0, posicao =0;

        for ( int i = inicio ; i <= fim ; i++){
            numero = i;
            cont =0;
            for (int j =1 ; j<= numero; j++){
                if(numero % j ==0){
                    cont++;
                }
            }
            if (cont ==2){
               numerosPrimos[posicao] = numero;
                posicao++;
            }
        }
        return numerosPrimos;
    }
}
