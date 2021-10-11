import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero, numeroInverso;

        System.out.print("Entre com um número inteiro: ");
        numero = leia.nextInt();
        leia.close();

        numeroInverso = numeroAoContrario(numero);
        System.out.print("Número Invetido: " + numeroInverso);
    }

    static int numeroAoContrario(int numero) {
        String numeroStr = Integer.toString(numero), numeroInvertido = "";
        int controladora;
        if (numero < 0) {
            controladora = 1;
            numeroInvertido += numeroStr.charAt(0);
        } else {
            controladora = 0;
        }
        for (int i = (numeroStr.length() - 1); i >= controladora; i--) {
            numeroInvertido += numeroStr.charAt(i);
        }
        return Integer.parseInt(numeroInvertido);
    }

}
