
package entidades;


public class PessoaJurídica extends Cliente { // olá
    
    private long cnpj, inscr_estadual;

    public PessoaJurídica(long cnpj, long inscr_estadual, int codigo, int numero, int max_de_midias_por_emprestimo, long cep, long telefone, String nome, String logradouro, String bairro, String municipio, String estado) {
        super(codigo, numero, max_de_midias_por_emprestimo, cep, telefone, nome, logradouro, bairro, municipio, estado);
        this.cnpj = cnpj;
        this.inscr_estadual = inscr_estadual;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public long getInscr_estadual() {
        return inscr_estadual;
    }

    public void setInscr_estadual(long inscr_estadual) {
        this.inscr_estadual = inscr_estadual;
    }
    
}
