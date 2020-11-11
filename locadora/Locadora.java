
package locadora;

import java.util.Scanner;


public class Locadora { // olá

    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        char continua = 's';
        int opcao;
        
        do {
            System.out.println("Menu Principal\n" +
                    "Digite 1 para manipular Cliente\n" +
                    "Digite 2 para manipular Mídia\n" +
                    "Digite 3 para manipular Empréstimo\n" +
                    "Digite 4 para Sair\n");
                    
                    opcao = ler.nextInt();
            
                    switch(opcao){
                        case 1:
                            // code here and submenu
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
        } while(continua == 's');
        
    }
    
}
