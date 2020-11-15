package Funcional;

import java.util.ArrayList;
import entidades.Cliente;
import entidades.Empréstimo;
import entidades.Mídia;
import entidades.PessoaFísica;

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

}
