import java.util.Arrays;
import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double notas[] = new double[3];

        for ( int i = 0; i < notas.length ; i++) {
            System.out.printf(" Entre com a nota %d: ", i + 1);
            notas[i] = leia.nextDouble();
            if (notas[i] < 0.0 || notas[i] > 10.0) {
                notas[i] = 0.0;
            }
        }
        String medias = calcularMedias(notas);
        System.out.println(medias);
    }
    static String calcularMedias( double notas[]){
        double mediaMaior = 0, mediaAritimetica = 0, notaMaior =0, notaMenor =0;

        Arrays.sort(notas);

        mediaMaior = (notas[1]+notas[2])/2;
        mediaAritimetica = (notas[0]+notas[1]+notas[2])/3;
        notaMaior = notas[2];
        notaMenor = notas[0];

        return String.format(" Media Maior: %.1f\n Media Aritmetica: %.1f\n Maior Nota: %.1f\n Menor Nota: %.1f\n",
         mediaMaior, mediaAritimetica, notaMaior, notaMenor);
    }
}
