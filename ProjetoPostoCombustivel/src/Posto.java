import java.util.Scanner;

public class Posto {
	public static void main(String[] args) {
		
		BombaDeCombustivel b1, b2, b3;
		BombaDeCombustivel bombaAtual;
		
		Scanner teclado = new Scanner(System.in);
		int numBomba, opcao;
		double valor;
		
		b1 = new BombaDeCombustivel("Gasolina", 4.799);
		b2 = new BombaDeCombustivel("Diesel", 3.999);
		b3 = new BombaDeCombustivel("Gasolina Aditivada", 4.999);
		
		//---------------------------------------------------------------------------- 
		
		/*
		versao super hiper ultra simplificada
		
		b1.abastecerPorLitros(50);
		System.out.println(b1.exibirRecibo());
		
		
		b2.abastecerPorValor(100);
		System.out.println(b2.exibirRecibo());
		
		aqui termina a versão super hiper ultra maxi mega simplificada
		
		*/
		// --------------------------------------------------------------------------
		
		
		do {
			System.out.println("Bem vindo ao IsidroCorp Gas & Energy");
			System.out.println("1- Gasolina | 2- Diesel | 3- G. Aditivada | Outro- Encerrar");
			numBomba = teclado.nextInt();
			if (numBomba == 1) {
				bombaAtual = b1;
			}
			else if (numBomba == 2) {
				bombaAtual = b2;
			}
			else if (numBomba == 3) {
				bombaAtual = b3;
			}
			else {
				System.out.println("Até logo!");
				break;
			}
			
			System.out.println("Digite a opcao 1- Abastecer por Litros / 2- Abastecer por valor");
			opcao = teclado.nextInt();
			System.out.println("Digite o valor:");
			valor = teclado.nextDouble();
			if (opcao == 1) {
				bombaAtual.abastecerPorLitros(valor);
				System.out.println(bombaAtual.exibirRecibo());
			}
			else {
				bombaAtual.abastecerPorValor(valor);
				System.out.println(bombaAtual.exibirRecibo());
			}
			
		} while (numBomba != -1);
		
		
		
	}

}
