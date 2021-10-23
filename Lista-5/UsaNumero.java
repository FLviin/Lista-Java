import java.util.Scanner;

public class UsaNumero {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        Numero num = new Numero();

        int valor = 0;

        do {

            System.out.print("Entre com um numero: ");
            valor = leia.nextInt();

            if (valor >= 0) {

                num.setNumero(valor);

                System.out.println("O inverso do numero eh : " + num.inverter());

                System.out.println("\nO numero " + (num.ehPrimo() ? "eh" : "naum eh") + " primo\n");
            }

        } while (valor >= 0);

        System.out.println("\n\tFim do programa!\n");
    }
}
