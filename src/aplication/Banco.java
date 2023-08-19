package aplication;

import java.util.Scanner;

import util.Calculo;

public class Banco {
  private static final String Conta = null;

public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	   Calculo dados = new Calculo(null, 0);
	    
		System.out.println("Bem vindo, informe a conta: ");
		int conta = sc.nextInt();
		dados.setConta(conta);
		
		System.out.println("Nome do dono da conta: ");
		String nome = sc.next();
		dados.setNome(nome);
		
		System.out.println("Informe o valor inicial: ");
		double saldoinicial = sc.nextDouble();
		 dados.setSaldoinicial(saldoinicial);
	
		
		int escolha;
		double valor;
		
		do {
			System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar valor");
            System.out.println("2 - Remover valor");
            System.out.println("3 - Atualizar dados");
            System.out.println("4 - Sair");
            escolha = sc.nextInt();

            
            switch (escolha) {
            case 1:
            	 System.out.println("Digite o valor a ser adicionado: ");
            	 valor = sc.nextDouble();
            	 dados.addconta(valor);
            	 System.out.printf("\nConta: " + conta);
            	 System.out.printf("\nSaldo atual: " + dados.getSaldoinicial());
            	 System.out.println("\nDono: " + dados.getNome());
                break;
            case 2:
                System.out.println("Digite o valor a ser removido: ");
                valor = sc.nextDouble();
                dados.removeSaldo(valor);
                System.out.printf("\nConta: " + conta);
                System.out.println("\nSaldo atual: " + dados.getSaldoinicial() );
                System.out.println("\nDono: " + dados.getNome());
                break;
                
            case 3:
                System.out.println("Deseja atualizar algo?");
                System.out.println("1 - Atualizar Nome");
                System.out.println("2 - Atualizar Conta");
                int opcaoAtualizar = sc.nextInt();
                sc.nextLine(); 

                switch (opcaoAtualizar) {
                    case 1:
                        System.out.println("Digite o novo nome: ");
                        nome = sc.nextLine();
                        dados.setNome(nome);
                        System.out.printf("\nConta: " + conta);
                        System.out.println("\nSaldo atual: " + dados.getSaldoinicial() );
                        System.out.println("\nDono: " + dados.getNome());
                        break;
                    case 2:
                        System.out.println("Digite a nova conta: ");
                        conta = sc.nextInt();
                        dados.setConta(conta);
                        System.out.printf("\nConta: " + conta);
                        System.out.println("\nSaldo atual: " + dados.getSaldoinicial() );
                        System.out.println("\nDono: " + dados.getNome());
                        break;
                    default:
                        System.out.println("ERRO 404.");
                        break;
                }
                break;
            case 4:
                System.out.println("Xauuuuuuuuuu obrigadoooooo.");
                break;
            default:
                System.out.println("Tente novamente.");
                break;
        }
    } while (escolha != 4);

    sc.close();
}
}