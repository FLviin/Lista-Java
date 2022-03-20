public class Midia {
    private int codigo;
    private String descricao;
    private String tipo;
    private String genero;
    private double valor;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String toString() {
        return String.format("\nCódigo: %d\nDescrição: %s\nTipo: %s\nGênero: %s\nValor: %.2f", getCodigo(), getDescricao(), getTipo(), getGenero(), getValor());
    }

}
