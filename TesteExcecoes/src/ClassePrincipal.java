
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassePrincipal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int opcao = 1;
		int id;
		String strId, strPreco, desc, strOp;
		double preco;

		do {
			try {
				Produto p = new Produto();

				System.out.print("Digite o id do produto: ");
				strId = teclado.nextLine();
				id = Integer.parseInt(strId);
				p.setId(id);

				System.out.print("Digite a descricao do produto: ");
				desc = teclado.nextLine();
				p.setDescricao(desc);

				System.out.print("Digite o preço do produto: ");
				strPreco = teclado.nextLine();
				preco = Double.parseDouble(strPreco);
				p.setPreco(preco);

				System.out.println("Produto Cadastrado " + p);

				System.out.println("Cadastrar novo produto? 1 - sim / 0 - não");
				opcao = Integer.parseInt(teclado.nextLine());
			} 
			catch(IsiException ex) {
				System.out.println("ERRO na Regra de Negócios = "+ex.getMessage());
			}
			catch(NumberFormatException ex) {
				System.out.println("Erro - Valor inválido para o campo");
			}
			catch (Exception ex) {
				System.out.println("ERRO - " + ex.getMessage());
				System.out.println("Tipo do erro = "+ex.getClass().getName());
			}

		} while (opcao != 0);

	}

}
