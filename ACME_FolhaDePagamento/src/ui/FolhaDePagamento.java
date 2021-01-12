package ui;

import java.util.ArrayList;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;


public class FolhaDePagamento {
	public static void main(String[] args) {
		
		/*
		 * versao 1.0 - com vetor estático
		 * 
		Funcionario lista[] = new Funcionario[5];
		lista[0] = new Chefe(1001,"Adalberto Torres", 8750.0f, 10.0f, 580.0f);
		lista[1] = new Comissionado(1002,"Joana Ferreira", 5000.0f, 25.0f);
		lista[2] = new Horista(1003, "Renato Lima", 100, 80.0f);
		lista[3] = new Horista(1004, "Priscila Campos", 120, 82.55f);
		lista[4] = new Empreiteiro(1005, "Roberto Menezes", 7250.0f);
		*/
		
		/* versao 2.0 - agora com a possibilidade de vetor redimensionável */
		
		// declarando um ArrayList  que vai armazenar funcionarios
		ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
		
		// para inserir os funcionários
		lista.add(new Chefe(1001,"Adalberto Torres", 8750.0f, 10.0f, 580.0f));
		lista.add(new Comissionado(1002,"Joana Ferreira", 5000.0f, 25.0f) );
		lista.add(new Horista(1003, "Renato Lima", 100, 80.0f));
		lista.add(new Horista(1004, "Priscila Campos", 120, 82.55f));
		lista.add(new Empreiteiro(1005, "Roberto Menezes", 7250.0f));
		
		// mostrar os recibos de pagamentos
		for (Funcionario f: lista) {
			// %d é o padrão para numeros inteiros
			// %s é o padrão para strings
			System.out.printf("%5d  %-30s  R$ %8.2f\n", f.getNumeroRegistro(), f.getNome(), f.calcularSalario() );
		}
		
		lista.remove(2);
		
		System.out.println("depois da remoção");
		for (Funcionario f: lista) {
			// %d é o padrão para numeros inteiros
			// %s é o padrão para strings
			System.out.printf("%5d  %-30s  R$ %8.2f\n", f.getNumeroRegistro(), f.getNome(), f.calcularSalario() );
		}
		
		
		
		
	}

}
