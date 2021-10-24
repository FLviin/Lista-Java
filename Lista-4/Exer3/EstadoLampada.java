public class EstadoLampada {

    private String aceso;
    private String apagado;
    private String meiaLuz;

    public EstadoLampada() {
        this.aceso = " Acesa";
        this.apagado = " Apagada";
        this.meiaLuz = " Meia-Luz";
    }

    public void setAceso(String aceso) {
        this.aceso = aceso;
    }

    public void setApagado(String apagado) {
        this.apagado = apagado;
    }

    public void setMeiaLuz(String meiaLuz) {
        this.meiaLuz = meiaLuz;
    }

    public String getAceso() {
        return aceso;
    }

    public String getApagado() {
        return apagado;
    }

    public String getMeiaLuz() {
        return meiaLuz;
    }

}
