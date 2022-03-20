public class Livro extends Midia {
    private String autor;
    private String editora;
    private int edicao;

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    @Override
    public String toString() {
        return String.format("Autor: %s\nEditora: %s\nEdição: %d\n", getAutor(), getEditora(), getEdicao());
    }

}
