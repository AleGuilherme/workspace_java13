package ui;

import model.*;


public class FolhaDePagamento {
	public static void main(String[] args) {
		
		Funcionario lista[] = new Funcionario[5];
		
		lista[0] = new Chefe(1001,"Adalberto Torres", 8750.0f, 10.0f, 580.0f);
		lista[1] = new Comissionado(1002,"Joana Ferreira", 5000.0f, 25.0f);
		lista[2] = new Horista(1003, "Renato Lima", 100, 80.0f);
		lista[3] = new Horista(1004, "Priscila Campos", 120, 82.55f);
		lista[4] = new Empreiteiro(1005, "Roberto Menezes", 7250.0f);
		
		// mostrar os recibos de pagamentos
		for (Funcionario f: lista) {
			// %d é o padrão para numeros inteiros
			// %s é o padrão para strings
			System.out.printf("%5d  %-30s  R$ %8.2f\n", f.getNumeroRegistro(), f.getNome(), f.calcularSalario() );
		}
	}

}
