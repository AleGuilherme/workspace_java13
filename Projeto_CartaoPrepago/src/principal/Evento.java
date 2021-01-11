package principal;

import cartoes.CartaoCashBack;
import cartoes.CartaoPrePago;

public class Evento {
	public static void main(String[] args) {
		CartaoPrePago c1, b1, b2, b3;
		
		c1 = new CartaoPrePago("1111 2222 3333 4444","Professor Isidro", 2025,10, 1000.00);
				
//		CartaoCashBack b1, b2, b3;
		
		b1 = new CartaoCashBack("2222 3333 4444 5555", "Jose Almeida", 2025, 10, 1000.00, 0);
		b2 = new CartaoCashBack("3333 4444 5555 6666", "Pedro Almeida", 2025, 10, 1000.00, 1);
		b3 = new CartaoCashBack("4444 5555 6666 7777", "Maria Almeida", 2025, 10, 1000.00, 2);
		System.out.println("---- ORIGINAL");
		System.out.println(c1);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		c1.comprar(100.00);
		b1.comprar(100.00);
		b2.comprar(100.00);
		b3.comprar(100.00);
		
		System.out.println("---- DEPOIS DE UMA COMPRA DE R$ 100,00");
		System.out.println(c1);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
