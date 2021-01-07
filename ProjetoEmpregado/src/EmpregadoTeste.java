
public class EmpregadoTeste {
	public static void main(String[] args) {
		
		
		Empregado e1, e2, e3;
		
		e1 = new Empregado();
		e2 = new Empregado();
		e3 = new Empregado();
		
		e1.setNome("Professor Isidro");
		e1.setCargo("Professor   ");
		e1.setSalario(22875.00);
		
		e2.setNome("Claudete        ");
		e2.setCargo("Coordenadora");
		e2.setSalario(18234.00);
		
		e3.setNome("Jurandir        ");
		e3.setCargo("Inspetor    ");
		e3.setSalario(11981.32);
		
		e1.imprimir();
		e2.imprimir();
		e3.imprimir();
		
		System.out.println("---> Aumento para reposicao da inflação ---");
		e1.aumentarSalario(5.0);
		e2.aumentarSalario(7.2);
		e3.aumentarSalario(8.3);
		
		e1.imprimir();
		e2.imprimir();
		e3.imprimir();
		
	}

}
