package Funcional;

import java.util.Scanner;

public class LocadoraMain { // olá

    public static void main(String[] args) {

        Locadora locadora = new Locadora();

        // Deve-se iniciar o array Clientes com os dados dos integrantes do grupo
        locadora.CadastraPf(15148677619l, 7890677, 0001, 4185, 3, 12345678, 954097322, "Gabriel", "Rua NeymarJR", "Meninos da Vila", "Santos", "São Paulo");
        locadora.CadastraPf(15148377620l, 3434343, 0002, 4100, 2, 12345679, 40028922, "Gustavo Boeira Silva", "Rua das Palhas Queimadas", "Cigarette", "Dourados", "Mato Grosso do Sul");
        locadora.CadastraPf(10148600619l, 1111111, 0003, 77, 3, 12345670, 33331111, "Igor Moura Martins", "Avenida Professor Lincolau", "Morro das Jogatinas", "Belo Horizonte", "Minas Gerais");
        locadora.CadastraPf(25148877619l, 5675670, 0004, 23, 1, 12345600, 99876523, "Pedro Rabelo de Freitas", "Rua 可愛いLoL", "Rua Romero Britto Neto", "Rio de Janeiro", "Rio de Janeiro");

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
                case 1:     // cliente
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
                                System.out.println("Digite a identidade: ");
                                long id = ler.nextLong();

                                locadora.CadastraPf(cpf, id, cod, num, midias_p_emprestimo, cep, tel, nome, logradouro, bairro, municipio, estado);

                                break;

                            case 2:

                                System.out.println("Informe o cpf a ser excluído.");
                                long cpf_a_excluir = ler.nextLong();
                                locadora.ExcluirPf(cpf_a_excluir);

                                break;
                            case 3:

                                System.out.println("Informe o cpf a ser consultado.");
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

                        System.out.println("Escolha uma opção: \n"
                                + "1 para cadastrar uma Pessoa Jurídica\n"
                                + "2 para excluir uma Pessoa Jurídica\n"
                                + "3 para consultar a existência de uma Pessoa Jurídica\n"
                                + "4 para imprimir dados de uma Pessoa Jurídica\n"
                                + "5 para voltar ao menu principal\n");

                        int opcao_pj = ler.nextInt();
                        switch (opcao_pj) {
                            case 1:

                                System.out.println("Digite o Cnpj: ");
                                long cnpj = ler.nextLong();
                                System.out.println("Digite o numéro da inscrição estadual: ");
                                long inscricao_estadual = ler.nextLong();
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

                                locadora.CadastrarPj(cnpj, inscricao_estadual, cod, nome, logradouro, num, bairro, estado, cep, tel, midias_p_emprestimo);

                                break;
                            case 2:

                                System.out.println("Digite o cnpj a ser excluído: ");
                                long cnpj_a_excluir = ler.nextLong();
                                locadora.ExcluirPj(cnpj_a_excluir);

                                break;

                            case 3:

                                System.out.println("Digite o cnpj a ser consultado: ");
                                long cnpj_a_consultar = ler.nextLong();
                                locadora.ConsultaPj(cnpj_a_consultar);

                                break;
                            case 4:

                                System.out.println("Lista de pessoas jurídicas: ");
                                locadora.RelatótioPjs();

                                break;
                            case 5: // só de chegar no break já volta pro menu principal
                                break;
                        }

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

                            System.out.println("Digite o Título: ");
                            String titulo = ler.next();
                            System.out.println("Digite o código: ");
                            int cod = ler.nextInt();
                            System.out.println("Digite a sinopse: ");
                            String sinopse = ler.next();
                            System.out.println("Digite o gênero: ");
                            String genero = ler.next();
                            System.out.println("Digite o preço: ");
                            double preco = ler.nextDouble();
                            System.out.println("É dublado? ");
                            boolean dublado = ler.nextBoolean();

                            locadora.CadastrarMídia(titulo, sinopse, genero, dublado, preco, cod);

                            break;
                        case 2:

                            System.out.println("Digite o titulo para ser excluído: ");
                            String titulo_a_excluir = ler.next();
                            locadora.ExcluirMídia(titulo_a_excluir);

                            break;
                        case 3:

                            System.out.println("Digite o titulo para consultar disponiblilidade: ");
                            String titulo_a_consultar = ler.next();
                            locadora.ConsultaMídia(titulo_a_consultar);

                            break;
                        case 4:

                            locadora.RelatórioMídia();

                            break;
                        case 5: // só de ter um break, voltamos ao menu principal
                            break;
                        default:
                            System.out.println("Essa não é uma opcão válida.");
                            break;
                    }
                    break;
                case 3:

                    int opcao_emprestimo;
                    System.out.println("Escolha uma opção: \n"
                            + "1 para realizar um empréstimo\n"
                            + "2 para realizar uma devolução\n"
                            + "3 para mostrar empréstimos realizados\n"
                            + "4 para voltar ao menu principal\n");
                    opcao_emprestimo = ler.nextInt();

                    switch (opcao_emprestimo) {
                        case 1:
                            
                            System.out.println("Digite o cliente: ");
                            String cliente = ler.next();
                            System.out.println("Digite o título da obra que será emprestada: ");
                            String midia_emprestimo = ler.next();
                            System.out.println("Digite o ano do empréstimo: ");
                            int ano = ler.nextInt();
                            System.out.println("Digite o dia do empréstimo: ");
                            int dia = ler.nextInt();
                            System.out.println("Digite o mês do empréstimo: ");
                            int mes = ler.nextInt();
                            System.out.println("Digite o valor do empréstimo: ");
                            float valor = ler.nextFloat(); // apenas valor de preço do empréstimo importa, não o valor da mídia pois se não teríamos dois valores diferentes para alugar uma só mídia.
                            System.out.println("Digite a multa em caso de atraso: ");
                            float multa = ler.nextFloat();
                            
                            locadora.RegistraEmprestimo(cliente, midia_emprestimo, ano, mes, dia, valor, multa);
                            
                            System.out.println("Foi devolvido? ");
                            boolean devolvido = ler.nextBoolean();
                            
                            locadora.ExcluirMídia(midia_emprestimo); // como foi emprestada, devemos tirar a midia do array de midias
                            locadora.Valor_a_ser_pago(valor, devolvido, multa);
                           
                            break;
                        case 2:
                            break;
                        case 3:
                            
                            locadora.RelatótrioEmprestimos();
                            
                            break;
                        case 4:
                            break;
                    }

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

// -- ERROS A OU MELHORIAS A CORRIGIR --
// DOUBLE NO MIDIA
// PROBLEMA PARA LER STRINGS COM ESPAÇO
// NÃO PASSAR UM CLIENTE E UMA MÍDIA INTEIRA NO ARRAY EMPRÉSTIMO. PASSAR APENAS O NOME E TITULO RESPECTIVAMENTE.
