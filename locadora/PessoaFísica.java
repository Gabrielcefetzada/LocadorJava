
package locadora;


public class PessoaFísica extends Cliente { // olá
    
    private long cpf, iddentidade;

    public PessoaFísica(long cpf, long iddentidade, int codigo, int numero, int max_de_midias_por_emprestimo, long cep, long telefone, String nome, String logradouro, String bairro, String municipio, String estado) {
        super(codigo, numero, max_de_midias_por_emprestimo, cep, telefone, nome, logradouro, bairro, municipio, estado);
        this.cpf = cpf;
        this.iddentidade = iddentidade;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getIddentidade() {
        return iddentidade;
    }

    public void setIddentidade(long iddentidade) {
        this.iddentidade = iddentidade;
    }

    
}
