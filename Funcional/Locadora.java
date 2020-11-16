package Funcional;

import java.util.ArrayList;
import entidades.Cliente;
import entidades.Empréstimo;
import entidades.Mídia;
import entidades.PessoaFísica;
import entidades.PessoaJurídica;

public class Locadora {

    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    ArrayList<Mídia> midias = new ArrayList<Mídia>();
    ArrayList<Empréstimo> emprestimos = new ArrayList<Empréstimo>();

    /////////////// Métodos para pessoa física /////////////////
    public void CadastraPf(long cpf, long id, int cod, int num, int midias_p_emprestimo, long cep, long tel, String nome, String logradouro, String bairro, String municipio, String estado) {
        clientes.add(new PessoaFísica(cpf, id, cod, num, midias_p_emprestimo, cep, tel, nome, logradouro, bairro, municipio, estado));
        System.out.println("Pessoa Física cadastrada com sucesso.");
    }

    public void ExcluirPf(long cpf_a_excluir) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i) instanceof PessoaFísica) { //verifica se é realmente pessoa fisica
                if (cpf_a_excluir == ((PessoaFísica) clientes.get(i)).getCpf()) { //verifica se ele é igual ao da pessoa que tu deseja excluir (fazendo casting para que o elemento vire pessoa fisica)
                    clientes.remove(i); //se sim remove
                    System.out.println("Pesso Física removida com sucesso.");
                    break;
                }
            }
        }
    }

    public void ConsultaPf(long cpf_a_consultar) {
        boolean achou = false;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i) instanceof PessoaFísica) {
                if (cpf_a_consultar == ((PessoaFísica) clientes.get(i)).getCpf()) {
                    achou = true;
                    break;
                }
            }
        }

        if (achou) {
            System.out.println("Pessoa física encontrada.");
        } else {
            System.out.println("Pessoa física não encontrada");
        }
    }

    public void Relatoriopfs() {
        System.out.println("Lista de pessoas físicas");
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i) instanceof PessoaFísica) {
                System.out.println(clientes.get(i).getNome() + 
                        "\n" + "CPF: " + ((PessoaFísica) clientes.get(i)).getCpf() +
                        "\n" + "Cep: " + clientes.get(i).getCep() + 
                        "\n" + "Número: " + clientes.get(i).getNumero() +
                        "\n" + "Telefone: " + clientes.get(i).getTelefone() + 
                        "\n");
            }
        }
    }

    //////////////// MÉTODOS PARA MÍDIA /////////////////
    public void CadastrarMídia(String titulo, String sinopse, String genero, boolean dublado, double preco_locacao, int codigo) {
        midias.add(new Mídia(titulo, sinopse, genero, dublado, preco_locacao, codigo));
    }

    public void ExcluirMídia(String titulo_a_consultar) {
        for (int i = 0; i < midias.size(); i++) {
            if (titulo_a_consultar.equals(midias.get(i).getTitulo())) {
                midias.remove(i);
                break;
            }
        }
    }

    public void ConsultaMídia(String titulo_a_consultar) {
        boolean achou = false;
        for (int i = 0; i < midias.size(); i++) {
            if (titulo_a_consultar.equals(midias.get(i).getTitulo())) {
                achou = true;
                break;
            }

        }

        if (achou) {
            System.out.println("Mídia encontrada.");
        } else {
            System.out.println("Mídia não encontrada.");
        }

    }

    public void RelatórioMídia() {
        for (int i = 0; i < midias.size(); i++) {
            System.out.println("Lista de mídias\n" + "título: " + midias.get(i).getTitulo() + "\n" + "código: " + midias.get(i).getCodigo() + "\n");
        }
    }
    
    public void CadastrarPj(long cnpj, long inscricao_estadual, int cod, String nome, String logradouro, int num, String bairro, String estado, long cep, long tel, int max_midias_p_emprest){
        clientes.add(new PessoaJurídica(cnpj, inscricao_estadual, cod, num, max_midias_p_emprest, cep, tel, nome, logradouro, bairro, bairro, estado));
    }
    
    public void ExcluirPj(long cnpj_a_excluir){
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i) instanceof PessoaJurídica){ 
                if(cnpj_a_excluir == ((PessoaJurídica) clientes.get(i)).getCnpj()){
                    clientes.remove(i);
                    break;
                }
            }
        }
    }
    
    public void ConsultaPj(long cnpj_a_consultar){
        boolean achou = false;
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i) instanceof PessoaJurídica){ 
                if(cnpj_a_consultar == ((PessoaJurídica) clientes.get(i)).getCnpj()){
                    achou = true;
                    break;
                }
            }
        }
        
        if(achou){
            System.out.println("Pessoa jurídica encontrada.");
        } else {
            System.out.println("Pessoa jurídica não encontrada.");
        }
        
    }
    
    public void RelatótioPjs(){
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i) instanceof PessoaJurídica){ 
                System.out.println("Nome: " + clientes.get(i).getNome() +
                        "\n" + "Cnpj: " + ((PessoaJurídica) clientes.get(i)).getCnpj() + "\n");
            }
        }
    }

}
