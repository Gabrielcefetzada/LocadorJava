
package locadora;


public class Mídia { // olá
    private String titulo, sinopse, genero;
    private boolean dublado;
    private double preco_locacao;
    private int codigo;

    public Mídia(String titulo, String sinopse, String genero, boolean dublado, double preco_locacao, int codigo) {
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.genero = genero;
        this.dublado = dublado;
        this.preco_locacao = preco_locacao;
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isDublado() {
        return dublado;
    }

    public void setDublado(boolean dublado) {
        this.dublado = dublado;
    }

    public double getPreco_locacao() {
        return preco_locacao;
    }

    public void setPreco_locacao(double preco_locacao) {
        this.preco_locacao = preco_locacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
}
