public class Ano {

    private int ano;

    public Ano() {

        this.ano = 2021;
    }

    public void setAno(int ano) {

        if (ano >= 1 && ano <= 9999) {

            this.ano = ano;
        }
    }

    public int getAno() {

        return ano;
    }

    public boolean ehBissexto() {

        return (ano % 4 == 0);
    }
}
