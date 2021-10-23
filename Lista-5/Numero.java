public class Numero {

    private int numero;

    public Numero() {

        this.numero = 12;
    }

    public void setNumero(int numero) {

        if (numero >= 0) {

            this.numero = numero;
        }
    }

    public int getNumero() {

        return numero;
    }

    public int inverter() {

        String numeroStr = "" + numero;

        String inverso = "";

        for (int i = 0; i < numeroStr.length(); i++) {

            inverso = numeroStr.charAt(i) + inverso;
        }

        return Integer.parseInt(inverso);
    }

    public boolean ehPrimo() {

        int contador = 0;

        for (int i = 1; i <= numero; i++) {

            if (numero % i == 0) {

                contador++;
            }
        }

        /*
         * if ( contador == 2 ) {
         * 
         * return true;
         * 
         * } else {
         * 
         * return false; }
         */

        return (contador == 2);
    }

}
