package Exer4;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {
        this.dia = 0;
        this.mes = 0;
        this.ano = 0;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public boolean dataValida() {

        return (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && ano >= 1 && ano <= 9999);
    }

    public String mostraData() {

        return dia + "/" + mes + "/" + ano;
    }

}
