package Exer6;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private int dia2;
    private int mes2;
    private int ano2;

    public Data() {
        this.dia = 0;
        this.mes = 0;
        this.ano2 = 0;
        this.dia2 = 0;
        this.mes2 = 0;
        this.ano2 = 0;
    }

    // setData 1
    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        }
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        }
    }

    public void setAno(int ano) {
        if (ano >= 1 && ano <= 9999) {
            this.ano = ano;
        }
    }

    // setData 2
    public void setDia2(int dia2) {
        if (dia2 >= 1 && dia2 <= 31) {
            this.dia2 = dia2;
        }
    }

    public void setMes2(int mes2) {
        if (mes2 >= 1 && mes2 <= 12) {
            this.mes2 = mes2;
        }
    }

    public void setAno2(int ano2) {
        if (ano2 >= 1 && ano2 <= 9999) {
            this.ano2 = ano2;
        }
    }

    // getData 1
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    // getData 2
    public int getDia2() {
        return dia2;
    }

    public int getMes2() {
        return mes2;
    }

    public int getAno2() {
        return ano2;
    }

    public String mostraData() {

        return dia + "/" + mes + "/" + ano;
    }

    public String mostraData2() {

        return dia2 + "/" + mes2 + "/" + ano2;
    }

    public boolean dataValida() {

        return (dia != 0 && mes != 0 && ano != 0);
    }

    public boolean dataValida2() {

        return (dia2 != 0 && mes2 != 0 && ano2 != 0);
    }

    private String pegaData() {
        ano = getAno();
        mes = getMes();
        dia = getDia();
        LocalDate data = LocalDate.of(ano, mes, dia);
        return String.valueOf(data);
    }

    private String pegaData2() {
        ano2 = getAno2();
        mes2 = getMes2();
        dia2 = getDia2();
        LocalDate data2 = LocalDate.of(ano2, mes2, dia2);
        return String.valueOf(data2);

    }

    public String compararData() {

        if (pegaData().compareTo(pegaData2()) > 0) {
            return String.format(" primeira Data é maior");
        } else if (pegaData().compareTo(pegaData2()) < 0) {
            return String.format(" Segunda Data é maior");
        } else if (pegaData().compareTo(pegaData2()) == 0) {
            return String.format(" Datas Iguais ");
        }
        return null;
    }

    public long diferencaDias() {

        ano = getAno();
        mes = getMes();
        dia = getDia();
        LocalDate data = LocalDate.of(ano, mes, dia);

        ano2 = getAno2();
        mes2 = getMes2();
        dia2 = getDia2();
        LocalDate data2 = LocalDate.of(ano2, mes2, dia2);

        Long distaciaDias = ChronoUnit.DAYS.between(data, data2);

        return distaciaDias;
    }

}
