
package Funcional;

import java.util.ArrayList;
import entidades.Cliente;
import entidades.PessoaFísica;



public class Locadora {
    
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    // Métodos para pessoa física
    
     public void CadastraPf(long cpf, long id, int cod, int num, int midias_p_emprestimo, long cep, long tel, String nome, String logradouro, String bairro, String municipio, String estado) {
        clientes.add(new PessoaFísica(cpf, id, cod, num, midias_p_emprestimo, cep, tel, nome, logradouro, bairro, municipio, estado));
        System.out.println("Pessoa Física cadastrada com sucesso.");
    }
     
      public void ExcluirPf(long cpf_a_excluir) {
        System.out.println("Informe o CPF da pessoa que deseja remover: ");
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i) instanceof PessoaFísica) {//verifica se é realmente pessoa fisica
                if (cpf_a_excluir == ((PessoaFísica) clientes.get(i)).getCpf()) {//verifica se ele e igual ao da pessoa que tu deseja excluir (fazendo casting para que o elemento vire pessoa fisica)
                    clientes.remove(i);//se sim remove
                    System.out.println("Pesso Física removida com sucesso.");
                    break;
                }
            }
        }
    }

    public void ConsultaPf(long cpf_a_consultar) {
        System.out.println("Informe o CPF da pessoa que deseja consultar: ");
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
                System.out.println(clientes.get(i).getNome());
            }
        }
    }
    
}
