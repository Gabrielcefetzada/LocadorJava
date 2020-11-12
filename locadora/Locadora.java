package locadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Locadora { // olá

    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        Scanner ler = new Scanner(System.in);
        char continua = 's';
        int opcao;

        do {
            System.out.println("Menu Principal\n" // menu principal
                    + "Digite 1 para manipular Cliente\n"
                    + "Digite 2 para manipular Mídia\n"
                    + "Digite 3 para manipular Empréstimo\n"
                    + "Digite 4 para Sair\n");

            opcao = ler.nextInt();

            switch (opcao) {
                case 1: // submenus relacionados a cliente
                    String pf_ou_pj;
                    System.out.println("digite pf para pessoa física ou pj para pessoa jurídica.");
                    pf_ou_pj = ler.next();

                    if ("pf".equals(pf_ou_pj)) { // pessoa fisica

                        System.out.println("Escolha uma opção: \n"
                                + "1 para cadastrar uma Pessoa Física\n"
                                + "2 para excluir uma Pessoa Física\n"
                                + "3 para consultar a existência de uma Pessoa física\n"
                                + "4 para imprimir dados de uma Pessoa física\n"
                                + "5 para voltar ao menu principal\n");

                        int opcao_pf = ler.nextInt(); // variavel para saber o que fazer com a opção pessoa fisica

                        switch (opcao_pf) {
                            case 1:
                                System.out.println("Digite o nome: ");
                                String nome = ler.next();
                                System.out.println("Digite o logradouro: ");
                                String logradouro = ler.next();
                                System.out.println("Digite o bairro: ");
                                String bairro = ler.next();
                                System.out.println("Digite o município: ");
                                String municipio = ler.next();
                                System.out.println("Digite o estado: ");
                                String estado = ler.next();
                                System.out.println("Digite o código: ");
                                int cod = ler.nextInt();
                                System.out.println("Digite o número: ");
                                int num = ler.nextInt();
                                System.out.println("Digite o maximo de midias por empréstimo: ");
                                int midias_p_emprestimo = ler.nextInt();
                                System.out.println("Digite o cep: ");
                                long cep = ler.nextLong();
                                System.out.println("Digite o telefone: ");
                                long tel = ler.nextLong();
                                System.out.println("Digite cpf: ");
                                long cpf = ler.nextLong();
                                System.out.println("Digite as identidade: ");
                                long id = ler.nextLong();

                                clientes.add(new PessoaFísica(cpf, id, cod, num, midias_p_emprestimo, cep, tel, nome, logradouro, bairro, municipio, estado));
                                System.out.println("Pessoa Física cadastrada com sucesso.");

                                break;

                            case 2:
                                System.out.println("Informe o CPF da pessoa que deseja remover: ");
                                long cpf_a_excluir = ler.nextLong();
                                for (int i = 0; i < clientes.size(); i++) {
                                    if (clientes.get(i) instanceof PessoaFísica) {//verifica se é realmente pessoa fisica
                                        if (cpf_a_excluir == ((PessoaFísica) clientes.get(i)).getCpf()) {//verifica se ele e igual ao da pessoa que tu deseja excluir (fazendo casting para que o elemento vire pessoa fisica)
                                            clientes.remove(i);//se sim remove
                                            System.out.println("Pesso Física removida com sucesso.");
                                            break;
                                        }
                                    }
                                }
                                break;

                            case 3:
                                System.out.println("Informe o CPF da pessoa que deseja consultar: ");
                                long cpf_a_consultar = ler.nextLong();
                                for (int i = 0; i < clientes.size(); i++) {
                                    if (clientes.get(i) instanceof PessoaFísica) {
                                        if (cpf_a_consultar == ((PessoaFísica) clientes.get(i)).getCpf()) {
                                            System.out.println("Pesso Física encontrada.");
                                            break;
                                        } else {
                                            System.out.println("Pessoa física não encontrada.");
                                        }
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Lista de pessoas ");     
                                for (int i = 0; i < clientes.size(); i++) {
                                    if (clientes.get(i) instanceof PessoaFísica) {
                                            System.out.println(clientes.get(i).getNome());
                                        }
                                    }
                                
                                break;
                            case 5: // só de dar o break já volta pro menu principal
                                break;
                            default:
                                System.out.println("Essa não é uma opção válida.");
                                break;
                        }
                    }

                    if ("pj".equals(pf_ou_pj)) { // pessoa juridica

                    }
                    break;
                case 2:
                    // code here and submenu
                    break;
                case 3:
                    // code here and submenu
                    break;
                case 4:
                    // code here
                    break;
                default:
                    System.out.println("Essa não é uma opcção válida.");
                    break;
            }

            System.out.println("Digite s para continuar manipulando dados");
            continua = ler.next().charAt(0);
        } while (continua == 's');

    }

}
