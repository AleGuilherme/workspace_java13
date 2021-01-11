package userinterface;

import core.Conta;
import core.ContaEspecial;

public class Banco {
	public static void main(String []args) {
		Conta c = new Conta("Cliente Normal","123.456.789-00",100001);
		ContaEspecial e = new ContaEspecial("Cliente Especial","987.654.321-00",200002,500.00);
		
//		c.setNomeTitular("Cliente normal");
//		c.setNumeroConta(100001);
//		c.setCpf("123.456.789-00");
//		
//		e.setNomeTitular("Cliente especial");
//		e.setCpf("987.654.321-00");
//		e.setNumeroConta(200002);
//		e.setLimite(500.00);
//		
		
		// tudo conta normal
		System.out.println("--------> Conta normal <---------");
		c.creditar(150.00);
		System.out.println(c.exibirInfo());
		
		if (c.debitar(350.0)) {
			System.out.println("Debito autorizado");
		}
		else {
			System.out.println("Sado insuficiente");
		}
		
		System.out.println(c.exibirInfo());
		
		
		System.out.println("---------> Conta Especial <-------");
		e.creditar(150.00);
		System.out.println(e.exibirInfo());
		if (e.debitar(350.0)) {
			System.out.println("Debito autorizado");
		}
		else {
			System.out.println("Sado insuficiente");
		}
		System.out.println(e.exibirInfo());
		
		
	}
	
	

}
