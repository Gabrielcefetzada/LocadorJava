
package locadora;


public class Cliente { // olá
    
    private int codigo, numero, max_de_midias_por_emprestimo;
    private long cep, telefone;
    private String nome, logradouro, bairro, municipio, estado;

    public Cliente(int codigo, int numero, int max_de_midias_por_emprestimo, long cep, long telefone, String nome, String logradouro, String bairro, String municipio, String estado) {
        this.codigo = codigo;
        this.numero = numero;
        this.max_de_midias_por_emprestimo = max_de_midias_por_emprestimo;
        this.cep = cep;
        this.telefone = telefone;
        this.nome = nome;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.municipio = municipio;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getMax_de_midias_por_emprestimo() {
        return max_de_midias_por_emprestimo;
    }

    public void setMax_de_midias_por_emprestimo(int max_de_midias_por_emprestimo) {
        this.max_de_midias_por_emprestimo = max_de_midias_por_emprestimo;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
