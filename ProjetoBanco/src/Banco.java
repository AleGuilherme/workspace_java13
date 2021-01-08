import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int opcao;
		double valor;
		ContaBancaria conta = new ContaBancaria("111.222.333-44",10001,8,0.0);
		
		do {
			System.out.println("Bem vindos ao banco IsiTaú   ");
			System.out.println("---------------------------- ");
			System.out.println("1- Deposito / 2 - Saque      ");
			System.out.println("3 - Saldo   / -1 - Encerrar  ");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("---> DEPOSITO");
				System.out.print  ("     Digite o Valor R$ ");
				valor = teclado.nextDouble();
				conta.creditar(valor);
				System.out.printf ("     Novo Saldo R$ %.2f\n",conta.getSaldo());
				break;
			case 2:
				System.out.println("---> SAQUE");
				System.out.print  ("     Digite o valor R$ ");
				//valor = ;
				
				if (conta.debitar(teclado.nextDouble())) {
					System.out.println("     Debito efetuado com sucesso!");
				}
				else {
					System.out.println("     Saldo insuficiente");
				}
				break;
			case 3:
				System.out.println("---> SALDO DA CONTA");
				System.out.println(conta.exibirInfo());
				break;
			case -1:
				System.out.println("---> OBRIGADO e Volte Sempre!");
				break;
			default:
				System.out.println("Opcao Invalida!");
					
			}
			
		} while (opcao != -1);
	}

}
