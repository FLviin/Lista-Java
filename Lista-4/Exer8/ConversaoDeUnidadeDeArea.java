package Exer8;

public class ConversaoDeUnidadeDeArea {
    private double valorParaConversao;

    public ConversaoDeUnidadeDeArea() {
        this.valorParaConversao = 0.0;
    }

    // setter
    public void setValorParaConversao(double valorParaConversao) {
        if (valorParaConversao > 0) {
            this.valorParaConversao = valorParaConversao;
        }
    }

    // getters
    public double getValorParaConversao() {
        return valorParaConversao;
    }

    public String converterAreaMetros() {

        double metros = getValorParaConversao();

        double pes = metros * 10.76;
        double centimetros = metros * 10000;
        double acres = metros * 0.0003;
        double milhas = metros * 0.0000004;

        return String.format(
                " Pes: " + pes + "\n Centimetros: " + centimetros + "\n Acres: " + acres + "\n Milhas: " + milhas);
    }

    public String converterAreaPes() {

        double pes = getValorParaConversao();

        double metros = pes * 0.0929;
        double centimetros = pes * 929.0304;
        double acres = pes * 0.0000230;
        double milhas = pes * 0.000000004;

        return String.format(" Metros: " + metros + "\n Centimetros: " + centimetros + "\n Acres: " + acres
                + "\n Milhas: " + milhas);
    }

    public String converterAreaCentimetros() {

        double centimetros = getValorParaConversao();

        double pes = centimetros * 0.0011;
        double metros = centimetros * 0.0001;
        double acres = centimetros * 0.000000025;
        double milhas = centimetros * 0.0000004;

        return String.format(" Pes: " + pes + "\n Metros: " + metros + "\n Acres: " + acres + "\n Milhas: " + milhas);
    }

    public String converterAreaAcres() {

        double acres = getValorParaConversao();

        double pes = acres * 43560.1462;
        double centimetros = acres * 404687000.0000;
        double metros = acres * 4046.8700;
        double milhas = acres * 0.0016;

        return String.format(
                " Pes: " + pes + "\n Centimetros: " + centimetros + "\n Metros: " + metros + "\n Milhas: " + milhas);
    }

    public String converterAreaMilhas() {

        double milhas = getValorParaConversao();

        double pes = milhas * 278784000.0000;
        double centimetros = milhas * 25899881.3600;
        double acres = milhas * 639.9979;
        double metros = milhas * 2589988.1103;

        return String.format(
                " Pes: " + pes + "\n Centimetros: " + centimetros + "\n Acres: " + acres + "\n Metros: " + metros);
    }

}
