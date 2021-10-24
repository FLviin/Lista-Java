public class Lampada {

    private String marca;
    private String modelo;
    private String tipo;
    private String estado;
    private String estado2;

    public Lampada() {
        this.marca = "Philips Electronics";
        this.modelo = "LED Bulbo";
        this.tipo = "LED";
        this.estado = "Aceso";
        this.estado2 = "Apagado";
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setEstado2(String estado2) {
        this.estado = estado2;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    public String getEstado2() {
        return estado2;
    }

}
