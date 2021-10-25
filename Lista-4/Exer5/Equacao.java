package Exer5;

import java.util.Arrays;

public class Equacao {
    private double a;
    private double b;
    private double c;

    public Equacao() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    // Metodos de entrada (setters)
    public void setA(double a) {
        if (a != 0.0) {
            this.a = a;
        }
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    // Metodos saida (getters)
    public Double getA() {

        return a;
    }

    public Double getB() {

        return b;
    }

    public Double getC() {

        return c;
    }

    private static double delta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    static double[] equacaoSegundoGrau(double a, double b, double c) {
        double d = delta(a, b, c);
        int raizes = 0;

        if (d < 0.0)
            return null;

        if (d > 0)
            raizes = 2;
        else
            raizes = 1;

        double retorna[] = new double[raizes];

        if (d > 0) {
            retorna[0] = (-b + Math.sqrt(d)) / (2 * a);
            retorna[1] = (-b - Math.sqrt(d)) / (2 * a);
        } else {
            retorna[0] = -b / (2 * a);
        }

        return retorna;

    }

    static void imprimir(double[] array) {
        System.out.println(Arrays.toString(array));
    }
}
