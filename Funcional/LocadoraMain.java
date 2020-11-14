package Funcional;

import java.util.ArrayList;
import java.util.Scanner;
import entidades.Cliente;
import entidades.PessoaFísica;

public class LocadoraMain { // olá

    public static void main(String[] args) {

        Locadora locadora = new Locadora();
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

                                locadora.CadastraPf(cpf, id, cod, num, midias_p_emprestimo, cep, tel, nome, logradouro, bairro, municipio, estado);

                                break;

                            case 2:
                                
                                long cpf_a_excluir = ler.nextLong();
                                locadora.ExcluirPf(cpf_a_excluir);
                                
                                break;
                            case 3:

                                long cpf_a_consultar = ler.nextLong();
                                locadora.ConsultaPf(cpf_a_consultar);

                                break;
                            case 4:
                                
                                locadora.Relatoriopfs();
                                
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
                case 2: // midia

                    int opcao_midia;
                    System.out.println("Escolha uma opção: \n"
                            + "1 para cadastrar uma Mídia\n"
                            + "2 para excluir uma Mídia\n"
                            + "3 para consultar a existência de uma Mídia\n"
                            + "4 para imprimir dados de uma Mídia\n"
                            + "5 para voltar ao menu principal\n");
                    opcao_midia = ler.nextInt();

                    switch (opcao_midia) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Essa não é uma opcão válida.");
                            break;
                    }
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
